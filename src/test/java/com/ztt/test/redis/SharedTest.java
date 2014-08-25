package com.ztt.test.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

@ContextConfiguration(locations = {"classpath*:applicationContext-*.xml"})  
@RunWith(SpringJUnit4ClassRunner.class)
public class SharedTest {
	@Autowired
	private ShardedJedisPool shardedJedisPool;
	
	@Test
	public void test(){
		ShardedJedis resource = shardedJedisPool.getResource();
		
		resource.set("aaaa", "aaaa");
		
		String value = resource.get("aaaa");
		
		System.out.println(value);
	}
	
}
