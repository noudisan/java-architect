package com.ztt.test.callback.template;

import com.ztt.test.callback.metod.Test;
import com.ztt.test.callback.metod.TestUtil;

public class PersonTemplate {

	public <T> T execute(PersonCallBack<T> personCallBack) {
		Test test =TestUtil.getTest();
		
		T t = personCallBack.doGet(test);
		
		return t;
	}
}
