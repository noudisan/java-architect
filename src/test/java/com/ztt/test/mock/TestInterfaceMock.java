package com.ztt.test.mock;

import com.ztt.resource.ParentInterface;
import com.ztt.resource.TestInterface;
import com.ztt.resource.TestTemplate;

public class TestInterfaceMock implements TestInterface {

	@Override
	public void testMethod() {
		System.out.println("aaaaaaaaaa");
	}

	@Override
	public ParentInterface getParentInterface() {
		return new TestTemplate();
	}

}
