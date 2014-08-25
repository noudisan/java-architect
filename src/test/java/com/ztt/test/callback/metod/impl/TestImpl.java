package com.ztt.test.callback.metod.impl;

import com.ztt.test.callback.metod.Test;

public class TestImpl implements Test {

	@Override
	public String getA() {
		return "this is A";
	}

	@Override
	public String getB() {
		return "this is B";
	}
}
