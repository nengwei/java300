package com.wn.thread.java175;

/**
 * yield:暂停当前正在执行 的线程对象，并执行其它线程，写在哪个线程里面，就暂停谁
 * 
 * @author nengwei
 *
 */
public class YieldDemo implements Runnable {

	public static void main(String[] args) {
		YieldDemo yieldDemo = new YieldDemo();
		Thread t = new Thread(yieldDemo);
		t.start();
		for (int i = 0; i < 1000; i++) {
			if (i % 20 == 0) {
				Thread.yield();
			}
			System.out.println("main...."  + i);
		}
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("yield..." + i);
		}
	}
}