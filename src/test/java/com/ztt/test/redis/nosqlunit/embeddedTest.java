package com.ztt.test.redis.nosqlunit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lordofthejars.nosqlunit.redis.embedded.EmbeddedJedis;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext-*.xml" })
public class embeddedTest {
	private EmbeddedJedis embeddedJedis;

	@Before
	public void setUp() {
		embeddedJedis = new EmbeddedJedis();
	}

	@Test
	public void testByte() {
		embeddedJedis.set("aaaa".getBytes(), "bbbb".getBytes());
		Assert.assertArrayEquals("bbbb".getBytes(),embeddedJedis.get("aaaa".getBytes()));
	}
	
	@Test
	public void testList() {
		embeddedJedis.lpush("aaaa", "aaaa");
		embeddedJedis.lpush("aaaa", "bbbb");
		embeddedJedis.lpush("aaaa", "cccc");
		
		
		Assert.assertEquals("cccc", embeddedJedis.lpop("aaaa"));
		Assert.assertEquals("2", embeddedJedis.llen("aaaa").toString());
		
		Assert.assertEquals("bbbb", embeddedJedis.lindex("aaaa", 0));
		
	}
}
