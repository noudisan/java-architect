package com.ztt.test.mail;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("E:\\Shoujizhushou\\DZ\\DZ丶法伤贼.jpg");//499 KB (511,573 字节) -- 500 KB (512,000 字节)
		System.out.println(file.length());
	}
}
