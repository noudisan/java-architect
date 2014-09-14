package com.ztt.test.executor;

public class LiftOff implements Runnable {
	protected int countDown = 10;// Default;
	private static int taskCount = 0;
	private final int id = taskCount++;
	public LiftOff() {
	}
	public LiftOff(int countDown) {
		this.countDown = countDown;
	}
	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "LOftoff") + ")，";
	}
	@Override
	public void run() {
		while(countDown-->0){
			System.out.print(status());
			Thread.yield();//对线程调度器：Java线程机制的一部分，可以将CPU从一个线程转移给另一个线程
		}
	}
}
