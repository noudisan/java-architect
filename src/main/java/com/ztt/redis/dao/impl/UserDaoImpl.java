package com.ztt.redis.dao.impl;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.stereotype.Repository;

import com.ztt.redis.dao.UserDao;
import com.ztt.redis.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	private Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	@Autowired
	private RedisTemplate<Serializable, Serializable> redisTemplate;

	private static final String PREFIX_UID ="user.uid.";
	@Override
	public void save(final User user) {
		redisTemplate.execute(new RedisCallback<Object>() {
			@Override
			public Object doInRedis(RedisConnection connection)
					throws DataAccessException {
				logger.warn("this is save:"+user.getUid());
				/*byte[] serializeUid = redisTemplate.getStringSerializer().serialize(PREFIX_UID+ user.getUid());
				byte[] serializeAddress = redisTemplate.getStringSerializer().serialize(user.getAddress());
				connection.set(serializeUid,serializeAddress);*/
				byte[] serializeUid = redisTemplate.getStringSerializer().serialize(PREFIX_UID+ user.getUid());
				JdkSerializationRedisSerializer j = new JdkSerializationRedisSerializer();
				byte[] serializeAddress = j.serialize(user);
				connection.set(serializeUid,serializeAddress);
				return null;
			}
		});
	}

	@Override
	public User read(final String uid) {
		return redisTemplate.execute(new RedisCallback<User>() {
			@Override
			public User doInRedis(RedisConnection connection)
					throws DataAccessException {
				logger.warn("this is read:"+uid);
				byte[] key = redisTemplate.getStringSerializer().serialize(PREFIX_UID + uid);
				if (connection.exists(key)) {
					byte[] value = connection.get(key);
					/*String address = redisTemplate.getStringSerializer().deserialize(value);
					User user = new User();
					user.setAddress(address);
					user.setUid(uid);*/
					JdkSerializationRedisSerializer j = new JdkSerializationRedisSerializer();
					User user =(User) j.deserialize(value);
					return user;
				}
				return null;
			}
		});
	}

	@Override
	public void delete(final String uid) {
		redisTemplate.execute(new RedisCallback<Object>() {
			public Object doInRedis(RedisConnection connection) {
				connection.del(redisTemplate.getStringSerializer().serialize(PREFIX_UID + uid));
				return null;
			}
		});
	}

}