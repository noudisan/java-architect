package com.ztt.redis.test;

import java.util.concurrent.CountDownLatch;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisPoolTest {
	private static JedisPoolConfig config;// Jedis客户端池配置
	private static JedisPool pool;// Jedis客户端池

	static {
		config = new JedisPoolConfig();
		config.setMaxIdle(1000);
		config.setTestOnBorrow(true);
		pool = new JedisPool(config, "127.0.0.1", 6379);
	}

	/**
	 * 
	 * 单笔测试(不用池)
	 * 
	 * @param count
	 */
	public static void testNoPool(int count) {
		for (int i = 0; i < count; i++) {
			Jedis jr = null;
			try {
				jr = new Jedis("127.0.0.1", 6379);
				testOnce(jr);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (jr != null)
					jr.disconnect();
			}
		}
	}

	/**
	 * 
	 * 单笔测试(用池)
	 * 
	 * @param count
	 */
	public static void testWithPool(int count) {
		for (int i = 0; i < count; i++) {
			Jedis jr = null;
			try {
				jr = pool.getResource();
				testOnce(jr);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (jr != null)
					pool.returnResource(jr);
			}
		}
	}

	/**
	 * 
	 * 并发测试(不用池)
	 * 
	 * @param paiallel并发量
	 * 
	 * @param count每个并发循环次数
	 */

	public static void paiallelTestNoPool(int paiallel, int count) {
		Thread[] ts = new Thread[paiallel];
		// 用该对象保证所线程都完成主线程才退出
		CountDownLatch cd = new CountDownLatch(paiallel);
		long start = System.currentTimeMillis();
		for (int i = 0; i < paiallel; i++) {
			ts[i] = new Thread(new WorkerNoPool(cd, count));
			ts[i].start();
		}
		try {
			cd.await();// 等待所有子线程完成
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("NoPool useTime:"
				+ (System.currentTimeMillis() - start));

	}

	/**
	 * 
	 * 并发测试(用池)
	 * 
	 * @param paiallel并发量
	 * 
	 * @param count每个并发循环次数
	 */

	public static void paiallelTestWithPool(int paiallel, int count) {
		// 用该对象保证所线程都完成主线程才退出
		CountDownLatch cd = new CountDownLatch(paiallel);
		long start = System.currentTimeMillis();
		Thread[] ts = new Thread[paiallel];
		for (int i = 0; i < paiallel; i++) {
			ts[i] = new Thread(new WorkerWithPool(cd, count));
			ts[i].start();
		}
		try {
			cd.await();// 等待所有子线程完成
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Pool useTime:"
				+ (System.currentTimeMillis() - start));
		pool.destroy();

	}

	private static void testOnce(Jedis jr) {
		jr.incr("incrTest");
		// System.out.println();
	}

	public static class WorkerNoPool implements Runnable {
		private CountDownLatch cd;
		private int count;

		public WorkerNoPool(CountDownLatch cd, int count) {
			this.cd = cd;
			this.count = count;
		}

		public void run() {
			try {
				testNoPool(this.count);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				cd.countDown();
			}
		}
	}

	public static class WorkerWithPool implements Runnable {
		private CountDownLatch cd;
		private int count;

		public WorkerWithPool(CountDownLatch cd, int count) {
			this.cd = cd;
			this.count = count;
		}

		public void run() {
			try {
				testWithPool(this.count);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				cd.countDown();
			}
		}
	}

	public static void main(String[] args) {
		// paiallelTestNoPool(100, 1000); //NoPool useTime:10730
		paiallelTestWithPool(100, 1000);// Pool useTime:2026

	}

}