package com.ztt.test.thread;

public class ThreadTest {
	public static void main(String[] args) {
		MyThread m1 = getTread("m1");
		m1.start();

		MyThread m2 = getTread("m2");
		m2.start();
		try {
			m2.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static MyThread getTread(String name) {
		MyThread m1 = new MyThread();
		m1.setName(name);
		return m1;
	}
}
class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			String name = Thread.currentThread().getName();
			System.out.println(name+":"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
