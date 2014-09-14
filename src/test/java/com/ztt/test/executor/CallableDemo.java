package com.ztt.test.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class TaskWithResult implements Callable<String> {
	private int id;
	public TaskWithResult(int id) {
		this.id = id;
	}
	@Override
	public String call() throws Exception {
		TimeUnit.MILLISECONDS.sleep(100);
		return "result of TaskWithResult " + id;
	}
}
public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		List<Future<String>> results = new ArrayList<Future<String>>();
		for (int i = 0; i < 10; i++)
			results.add(exec.submit(new TaskWithResult(i)));
		for (Future<String> fs : results) {
			try {
				// get() blocks until completion;
				System.out.println(fs.get());
			} catch (Exception e) {
			}
		}
		exec.shutdown();
	}
}
