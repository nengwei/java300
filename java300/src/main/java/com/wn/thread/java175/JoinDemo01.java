package com.wn.thread.java175;

/**
 * join合并线程
 * 
 * @author nengwei
 *
 */
public class JoinDemo01 extends Thread {

	public static void main(String[] args) throws InterruptedException {

		JoinDemo01 joinDemo01 = new JoinDemo01();
		Thread t = new Thread(joinDemo01);
		t.start();
		for (int i = 0; i < 1000; i++) {
			if (i == 50) {
				t.join();// 等run运行完，若没有则交替运行
			}
			System.out.println("main......" + i);
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.err.println("join....." + i);
		}
	}
}
