package com.wn.thread.java172;

public class Programmer implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("敲代码。。。");
		}
	}
}
