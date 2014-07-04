package com.ztt.PropertyEditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Company {
	private Person director;

	public Person getDirector() {
		return director;
	}

	public void setDirector(Person director) {
		this.director = director;
	}

	public static void main(String[] args) {
		String path = new Company().getClass().getResource("/").getPath();
		String realpath = path.substring(1, path.length());
		ApplicationContext context = new FileSystemXmlApplicationContext(
				realpath + "/applicationContext-editor.xml");
		Company c = (Company) context.getBean("company");
		System.out.println(c.getDirector().getName() + "*"+ c.getDirector().getAge());
		
	}

}