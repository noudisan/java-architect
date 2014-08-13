package com.ztt.test.mail;

import java.io.File;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

public class JavaMailSend {
	// private static String smtp = "smtp.163.com"; // 设置发送邮件所用到的smtp
	// private static String servername = "zhou_ttaaoo@163.com";
	// private static String serverpaswd = "noudisan123";
	private static String smtp = "smtp.qq.com"; // 设置发送邮件所用到的smtp
	private static String servername = "1070563998@qq.com";
	private static String serverpaswd = "1292124215";

	/**
	 * send mail
	 */
	private void sendmail(String subject, String[] to, String text,
			String[] filenames, String mimeType) {
		try {

			Properties props = java.lang.System.getProperties(); // 获得系统属性对象
			props.put("mail.smtp.host", smtp); // 设置SMTP主机
			props.put("mail.smtp.auth", "true"); // 是否到服务器用户名和密码验证
			// 到服务器验证发送的用户名和密码是否正确
			SmtpAuthenticator myEmailAuther = new SmtpAuthenticator(servername,
					serverpaswd);
			// 设置邮件会话 注意这里将认证信息放进了Session的创建参数里
			Session mailSession = Session.getInstance(props,
					(Authenticator) myEmailAuther);// 邮件会话对象
			// 设置传输协议
			// Transport transport = mailSession.getTransport("smtp");
			// 设置from、to等信息
			MimeMessage mimeMsg = new MimeMessage(mailSession); // MIME邮件对象
			if (null != servername && !"".equals(servername)) {
				InternetAddress sentFrom = new InternetAddress(servername);
				mimeMsg.setFrom(sentFrom); // 设置发送人地址
			}

			InternetAddress[] sendTo = new InternetAddress[to.length];
			for (int i = 0; i < to.length; i++) {
				System.out.println("发送到:" + to[i]);
				sendTo[i] = new InternetAddress(to[i]);
			}

			mimeMsg.setRecipients(MimeMessage.RecipientType.TO, sendTo);
			mimeMsg.setSubject(subject, "gb2312");

			MimeBodyPart messageBodyPart1 = new MimeBodyPart();
			// messageBodyPart.setText(UnicodeToChinese(text));
			messageBodyPart1.setContent(text, mimeType);

			// 附件传输格式
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart1);

			for (int i = 0; i < filenames.length; i++) {
				MimeBodyPart messageBodyPart2 = new MimeBodyPart();

				String filename = filenames[i].split(";")[0];
				String displayname = filenames[i].split(";")[1];
				// 得到数据源
				FileDataSource fds = new FileDataSource(filename);
				// BodyPart添加附件本身
				messageBodyPart2.setDataHandler(new DataHandler(fds));
				// BodyPart添加附件文件名
				messageBodyPart2.setFileName(MimeUtility
						.encodeText(displayname));
				multipart.addBodyPart(messageBodyPart2);
			}
			mimeMsg.setContent(multipart);
			// 设置信件头的发送日期
			mimeMsg.setSentDate(new Date());
			mimeMsg.saveChanges();
			// 发送邮件
			Transport.send(mimeMsg);
			// transport.close();
			System.out.println("发送到成功!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void send() {
		String title = "title";// 所发送邮件的标题
		// String sendTo[] = { "zhoutaotao@chinadrtv.com" };// 发送到那里
		String sendTo[] = { "1070563998@qq.com", "zhoutaotao@chinadrtv.com",
				"zhoutaotao0903@163.com" };// 发送到那里
		// 邮件的文本内容，可以包含html标记则显示为html页面
		String content = "java send mail !!!!!!";
		// 所包含的附件，及附件的重新命名
		String fileNames[] = { "D:\\00000\\24\\208.jpg;test.png",
				"D:\\00000\\24\\208.jpg;aaa.png" };
		JavaMailSend test = new JavaMailSend();
		try {
			// MailSender mailsender = new MailSender();
			test.sendmail(title, sendTo, content, fileNames,
					"text/html;charset=gb2312");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void sendFile(File fileDirectory) {
		// 所包含的附件，及附件的重新命名
		String fileNames[] = new String[fileDirectory.listFiles().length];
		int i =0;
		for (File file : fileDirectory.listFiles()) {
			fileNames[i] = file.getAbsolutePath() + ";" + file.getName();
			i++;
		}
		JavaMailSend test = new JavaMailSend();
		try {
			String title = fileDirectory.getName();// 所发送邮件的标题
			String sendTo[] = { "1070563998@qq.com", "zhoutaotao@chinadrtv.com",
					"zhoutaotao0903@163.com" };// 发送到那里
			String content = "java send mail !!!!!!";
			test.sendmail(title, sendTo, content, fileNames,
					"text/html;charset=gb2312");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		long time = System.currentTimeMillis();
		File file = new File("E:\\Shoujizhushou");
		JavaMailSend jms = new JavaMailSend();
		jms.fileDirectorySend(file);

		System.out.println((System.currentTimeMillis() - time) + "毫秒");
	}

	public void fileDirectorySend(File file) {
		if (file.exists() && file.isDirectory()) {
			File[] fileArray = file.listFiles();
			for (File subFile : fileArray) {
				if (subRootFile(subFile)) {
					sendFile(subFile);
				} else {
					fileDirectorySend(subFile);
				}
			}
		}
	}

	private boolean subRootFile(File subFile) {
		if (subFile.isDirectory()) {
			for (File file : subFile.listFiles()) {
				if (file.isDirectory()) {
					return false;
				}
			}
		}
		return true;
	}

}