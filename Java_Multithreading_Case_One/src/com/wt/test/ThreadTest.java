package com.wt.test;

public class ThreadTest implements Runnable{

	Thread thread;
	
	public ThreadTest() {

		thread = new Thread(this, "Demo Thread");
		System.out.println("Child thread " + thread);
		
		// 开始线程
		thread.run();
		
	}

	// 第二个线程的入口
	public void run() {

		
		
	}

	
	
}
