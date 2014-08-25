package com.ztt.redis.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.stereotype.Repository;

import com.ztt.redis.dao.PersonDao;
import com.ztt.redis.model.Person;

@Repository("PersonDao")
public class PersonDaoImpl implements PersonDao {
	@Autowired
	private RedisTemplate<String, String> template;

	@Resource(name = "redisTemplate")
	private ListOperations<String, byte[]> listOps;

	@Override
	public void save(Person person) {
		JdkSerializationRedisSerializer j = new JdkSerializationRedisSerializer();

		listOps.leftPush(person.getUid(), j.serialize(person));

	}

	@Override
	public Person getLastPerson(String uid) {
		JdkSerializationRedisSerializer j = new JdkSerializationRedisSerializer();
		byte[] personStr = listOps.leftPop(uid);
		if (personStr != null) {
			return (Person) j.deserialize(personStr);
		}
		return null;
	}

	@Override
	public List<Person> getList(String uid) {

		return null;
	}

	@Override
	public Long getSize(String uid) {

		return listOps.size(uid);
	}

	@Override
	public Person getIndex(String uid, long i) {
		JdkSerializationRedisSerializer j = new JdkSerializationRedisSerializer();
		return (Person) j.deserialize(listOps.index(uid, i));
	}

	@Override
	public void remove(String uid) {
		while(listOps.leftPop(uid)!=null){
			continue;
		}
	}
}
