package com.ztt.redis.dao;

import java.util.List;

import com.ztt.redis.model.Person;

public interface PersonDao {
	void save(Person person);

	Person getLastPerson(String uid);

	List<Person> getList(String uid);

	Long getSize(String uid);

	Person getIndex(String uid, long i);

	void remove(String uid);
}
