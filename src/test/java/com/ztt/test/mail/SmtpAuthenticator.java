package com.ztt.test.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * Smtp认证
 */
public class SmtpAuthenticator extends Authenticator {
	String username = null;
	String password = null;

	/**
	 * SMTP身份验证
	 * 
	 * @param username
	 * @param password
	 */
	public SmtpAuthenticator(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	/**
	 * @return pass
	 */
	public PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(this.username, this.password);
	}
}