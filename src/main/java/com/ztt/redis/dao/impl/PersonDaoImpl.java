package com.ztt.redis.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.stereotype.Repository;

import com.ztt.redis.dao.PersonDao;
import com.ztt.redis.model.Person;

@Repository("PersonDao")
public class PersonDaoImpl implements PersonDao {
	@Autowired
	private RedisTemplate<String, byte[]> redisTemplate;  
	  
	 
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
	public void remove(final String uid) {
		//RedisOperations<String, byte[]> open = listOps.getOperations();
		/*while (listOps.leftPop(uid) != null) {
			continue;
		}*/
		List<Object> txResults = redisTemplate.execute(new SessionCallback<List<Object>>() {
		    public List<Object> execute(RedisOperations operations) throws DataAccessException {
		        operations.multi();
		        operations.opsForSet().add("aadasa", "value1".getBytes());
		        // This will contain the results of all ops in the transaction
		        return operations.exec();
		    }
		});
		System.out.println("Number of items added to set: " + txResults.get(0));
		
		/*SessionCallback<String> sessionCallback = new SessionCallback<String>() {
			
			@Override
			public <K, V> String execute(RedisOperations<K, V> operation)
					throws DataAccessException {
				
				operation.multi();
				for(int i=0;i<10;i++){
					BoundListOperations hs = ((RedisTemplate)operation).boundListOps(uid);
					hs.leftPush(uid, "hao"+i);
				}
				operation.exec();
				return null;
			}
		};
		redisTemplate.execute(sessionCallback);*/
		
		try {
			//redisTemplate.watch(uid);
			//redisTemplate.multi();
			//ListOperations<String, byte[]> open = redisTemplate.opsForList();
			//open.leftPush(uid, "asdf".getBytes());
			/*while (open.leftPop(uid) != null) {
				continue;
			}*/
			//redisTemplate.discard();
			//open.boundListOps(uid).leftPush("aaaaa".getBytes());
			//int a = 1 / 0;
		} catch (Exception e) {
			//open.discard();
		}
		
		//open.exec();
	}
}
