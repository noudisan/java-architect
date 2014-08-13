package com.ztt.test.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;

import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipFile;

public class ZIPUtil {
	public static void main(String[] args) throws Exception {
		unzip("c:\\test.zip", "D:");
	}
	//创建目录
	static void createDir(String path) {
		File dir = new File(path);
		if (!dir.exists())
			dir.mkdir();
	}
	//取得文件名,不包含后缀名
	static String getSuffixName(String name) {
		return name.substring(0, name.lastIndexOf("."));
	}
	//解压zip文件
	public static void unzip(String zipFilePath, String unzipDirectory)
			throws Exception {
		File file = new File(zipFilePath);
		ZipFile zipFile = new ZipFile(file);
		File unzipFile = new File(unzipDirectory + "/" + getSuffixName(file.getName()));
		if (unzipFile.exists())
			unzipFile.delete();
		unzipFile.mkdir();
		Enumeration zipEnum = zipFile.getEntries();
		InputStream input = null;
		OutputStream output = null;
		ZipEntry entry = null;
		while (zipEnum.hasMoreElements()) {
			entry = (ZipEntry) zipEnum.nextElement();
			String entryName = new String(entry.getName());
			String names[] = entryName.split("\\/");
			int length = names.length;
			String path = unzipFile.getAbsolutePath();
			for (int index = 0; index < length; index++) {
				if (index < length - 1) { // 最后一个目录之前的目录
					path += "/" + names[index] + "/";
					createDir(path);
				} else { // 最后一个
					if (entryName.endsWith("/")) // 为目录,则创建文件夹
						createDir(unzipFile.getAbsolutePath() + "/" + entryName);
					else { // 为文件,则输出到文件
						input = zipFile.getInputStream(entry);
						output = new FileOutputStream(new File(unzipFile.getAbsolutePath() + "/" + entryName));
						byte[] buffer = new byte[1024 * 8];
						int readLen = 0;
						while ((readLen = input.read(buffer, 0, 1024 * 8)) != -1){
							output.write(buffer, 0, readLen);
						}
						input.close();
						output.flush();
						output.close();
					}
				}
			}
		}
	}
}
