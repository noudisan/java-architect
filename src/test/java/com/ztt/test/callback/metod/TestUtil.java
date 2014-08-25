package com.ztt.test.callback.metod;

import com.ztt.test.callback.metod.impl.TestImpl;

public class TestUtil {

	public static Test getTest() {
		
		return new TestImpl();
	}

}
