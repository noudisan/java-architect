package com.ztt.test.callback.test;

import com.ztt.test.callback.metod.Test;
import com.ztt.test.callback.template.PersonCallBack;
import com.ztt.test.callback.template.PersonTemplate;

public class CallBackTest {
	public static void main(String[] args) {
		PersonTemplate personTemplate = new PersonTemplate();

		String a = personTemplate.execute(new PersonCallBack<String>() {
			@Override
			public String doGet(Test test) {
				return test.getA();
			}
		});
		System.out.println(a);

		String b = personTemplate.execute(new PersonCallBack<String>() {
			@Override
			public String doGet(Test test) {
				return test.getB();
			}
		});
		System.out.println(b);
	}
}
