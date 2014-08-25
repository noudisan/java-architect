package com.ztt.test.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ztt.redis.dao.PersonDao;
import com.ztt.redis.model.Person;

@ContextConfiguration(locations = { "classpath*:applicationContext-*.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class PersonDaoTest {
	@Autowired
	private PersonDao personDao;

	@Test
	public void crud() {
		String uid = "u123456";
		String address1 = "上海";
		Person person = new Person();
		person.setAddress(address1);
		person.setUid(uid);
		personDao.save(person);

		String address2 = "北京";
		Person person2 = new Person();
		person2.setAddress(address2);
		person2.setUid(uid);
		personDao.save(person2);

		Long size = personDao.getSize(uid);
		if (size > 0L) {
			for (long i = 0; i < size; i++) {
				System.out.println(personDao.getIndex(uid, i).getAddress());
			}
		}
/*
		Person p2 = personDao.getLastPerson(uid);
		System.out.println(p2.getAddress());
		p2 = personDao.getLastPerson(uid);
		System.out.println(p2.getAddress());*/
	}

	@Test
	public void remove() {
		String uid = "u123456";
		personDao.remove(uid);
	}
}