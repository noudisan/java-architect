package com.ztt.resource.impl;

import com.ztt.resource.AbstractTest;
import com.ztt.resource.TestInterface;
import com.ztt.resource.TestTemplate;

public class TestImpl extends AbstractTest implements TestInterface {

	
	public TestImpl(TestTemplate testTemplate){
		super(testTemplate);
	}
	
	@Override
	public void testMethod() {
		absMethod();
		System.out.println("aaa");
	}

}
