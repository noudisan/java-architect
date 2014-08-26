package com.ztt.resource;


public abstract class AbstractTest {
	private TestTemplate testTemplate;
	
	public AbstractTest(TestTemplate testTemplate) {
		this.testTemplate =testTemplate;
	}
	
	public void absMethod(){
		testTemplate.print();
	}
	
	public ParentInterface getParentInterface() {
		return testTemplate;
	}

}
