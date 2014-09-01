package com.ztt.test.resource;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ztt.resource.TestInterface;

@ContextConfiguration(locations = { "classpath*:test-*.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class ResourceTest {

	@Resource(name="testTemplate")
	private TestInterface testInterface;

	@Test
	public void test() {

        testInterface.testMethod();
	}
}
