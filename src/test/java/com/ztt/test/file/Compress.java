package com.ztt.test.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipOutputStream;

import org.apache.tools.zip.ZipEntry;

public class Compress {
	public void zip(String zipFileName, String... sourceFileNames)
			throws Exception {
		FileOutputStream outputStream = new FileOutputStream(zipFileName);
		ZipOutputStream out = new ZipOutputStream(outputStream);
		out.putNextEntry(new ZipEntry("/"));

		for (String sourceFileName : sourceFileNames) {
			File inputFile = new File(sourceFileName);
			zip(out, inputFile);
		}
		
		out.close();
	}

	private void zip(ZipOutputStream out, File file) throws Exception {
		System.out.println(file.getName());
		out.putNextEntry(new ZipEntry(file.getName()));
		FileInputStream in = new FileInputStream(file);
		/*int b;
		while ((b = in.read()) != -1) {
			out.write(b);
		}*/
		final int BUFFER_SIZE = 2048;
		byte[] buff = new byte[BUFFER_SIZE];
        int bytesRead;
        while (-1 != (bytesRead = in.read(buff, 0, buff.length))) {
        	out.write(buff, 0, bytesRead);
        }
		in.close();
	}
	public static void main(String[] temp) {
		Compress book = new Compress();
		try {
			// book.zip("c:\\test.zip","D:\\00000\\19");//你要压缩的文件夹
			book.zip("c:\\test.zip", "D:\\00000\\19\\19.smil",
					"D:\\00000\\19\\186.jpg", "D:\\00000\\19\\187.txt");// 你要压缩的文件夹
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}