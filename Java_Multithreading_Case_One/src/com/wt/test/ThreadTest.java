package com.wt.test;

public class ThreadTest implements Runnable{

	Thread thread;
	
	public ThreadTest() {

		thread = new Thread(this, "Demo Thread");
		System.out.println("Child thread " + thread);
		
		// ��ʼ�߳�
		thread.run();
		
	}

	// �ڶ����̵߳����
	public void run() {

		
		
	}

	
	
}
