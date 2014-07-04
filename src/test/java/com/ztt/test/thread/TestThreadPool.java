package com.ztt.test.thread;

import java.io.Serializable;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPool {
	private static int produceTaskSleepTime = 2000;

	public static void main(String[] args) {
		// 构造一个线程池
		ThreadPoolExecutor producerPool = new ThreadPoolExecutor(2, 4, 0,
				TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(3),
				new ThreadPoolExecutor.DiscardOldestPolicy());

		// 每隔produceTaskSleepTime的时间向线程池派送一个任务。
		int i = 1;
		while (true) {
			try {
				Thread.sleep(produceTaskSleepTime);

				String task = "task@ " + i;
				System.out.println("put " + task);

				producerPool.execute(new ThreadPoolTask(task));
				i++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

/**
 * 线程池执行的任务
 */
class ThreadPoolTask implements Runnable, Serializable {

	/**
	 * serialVersionUID, JDK1.5中，每个实现Serializable接口的类都推荐声明这样的一个ID
	 */
	private static final long serialVersionUID = -2443443826296885045L;


	private static int consumeTaskSleepTime = 2000000;

	private Object threadPoolTaskData;

	ThreadPoolTask(Object tasks) {
		this.threadPoolTaskData = tasks;
	}

	// 每个任务的执行过程，现在是什么都没做，除了print和sleep，:)
	public void run() {
		System.out.println("start .." + threadPoolTaskData);
		try {
			// 便于观察现象，等待一段时间
			Thread.sleep(consumeTaskSleepTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
		threadPoolTaskData = null;
	}

}


