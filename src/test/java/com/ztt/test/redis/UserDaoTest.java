package com.ztt.test.redis;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ztt.redis.dao.UserDao;
import com.ztt.redis.model.User;

@ContextConfiguration(locations = {"classpath*:applicationContext-*.xml"})  
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTest {
	@Autowired
	private UserDao userDao;
	
	@Test
	public void crud() {
		// -------------- Create ---------------
		String uid = "u123456";
		String address1 = "上海";
		User user = new User();
		user.setAddress(address1);
		user.setUid(uid);
		userDao.save(user);
		// ---------------Read ---------------
		user = userDao.read(uid);
		System.out.println("address1=" + user.getAddress());
		Assert.assertEquals(address1, user.getAddress());
		// --------------Update ------------
		String address2 = "北京";
		user.setAddress(address2);
		userDao.save(user);
		user = userDao.read(uid);
		System.out.println("address2Save=" + user.getAddress());
		Assert.assertEquals(address2, user.getAddress());
		// --------------Delete ------------
		userDao.delete(uid);
		user = userDao.read(uid);
		Assert.assertNull(user);
	}
}