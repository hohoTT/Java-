package com.wt.test;

class NewThead implements Runnable {

	Thread thread;

	public NewThead() {

		thread = new Thread(this, "Demo Thread");
		System.out.println("Child thread " + thread);

		// 开始线程
		thread.start();

	}

	// 第二个线程的入口
	public void run() {

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Child thread " + i);
				Thread.sleep(50);
			}
		} catch (Exception e) {
			// 线程中断
			System.out.println("Child interrupted ");
		}

		System.out.println("Exiting Child thread ");
	}

}

public class ThreadTest {

	public static void main(String[] args) {

		// 创建一个新的线程
		new NewThead();

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("main thread " + i);
				Thread.sleep(100);
			}
		} catch (Exception e) {
			// 主线程中断
			System.out.println("Main thread interrupted ");
		}

		System.out.println("Exiting Main thread ");

	}

}
