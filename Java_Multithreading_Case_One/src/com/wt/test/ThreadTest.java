package com.wt.test;

class NewThead implements Runnable {

	Thread thread;

	public NewThead() {

		thread = new Thread(this, "Demo Thread");
		System.out.println("Child thread " + thread);

		// ��ʼ�߳�
		thread.start();

	}

	// �ڶ����̵߳����
	public void run() {

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Child thread " + i);
				Thread.sleep(50);
			}
		} catch (Exception e) {
			// �߳��ж�
			System.out.println("Child interrupted ");
		}

		System.out.println("Exiting Child thread ");
	}

}

public class ThreadTest {

	public static void main(String[] args) {

		// ����һ���µ��߳�
		new NewThead();

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("main thread " + i);
				Thread.sleep(100);
			}
		} catch (Exception e) {
			// ���߳��ж�
			System.out.println("Main thread interrupted ");
		}

		System.out.println("Exiting Main thread ");

	}

}
