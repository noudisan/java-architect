package com.ztt.test.thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class CountTask extends RecursiveTask<Integer> {
	private static final long serialVersionUID = -1364786218858348734L;
	private static final Integer THREDHOLD = 2;// 阈值
	private int start, end;

	public CountTask(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	protected Integer compute() {
		int sum = 0;

		// 如果任务足够小就计算任务
		boolean canCompute = (end - start) <= THREDHOLD;
		if (canCompute) {
			for (int i =start; i <= end; i++) {
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
				sum += i;
			}
		} else {
			// 如果任务大于阈值，就分裂成两个子任务计算
			int middle = (end - start) / 2+start;
			CountTask leftTask = new CountTask(start, middle);
			CountTask writeTask = new CountTask(middle+1 , end);

			// 执行子任务
			leftTask.fork();
			writeTask.fork();

			// 执行完子任务
			int leftResult = leftTask.join();
			System.out.println("left result:"+leftResult);
			int writeResult = writeTask.join();
			System.out.println("write result:"+writeResult);

			sum = leftResult + writeResult;
		}

		return sum;
	}

	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		// 生成一个计算任务
		CountTask countTask = new CountTask(1, 30);
		Future<Integer> result = forkJoinPool.submit(countTask);
		
		try {
			System.out.println(result.get());
		} catch (Exception e) {
		}
		//异步问题
		if(countTask.isCompletedAbnormally()){
			System.out.println("任务执行失败："+countTask.getException());
		}
		

	}

}
