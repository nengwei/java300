package com.wn.thread.java172;

public class Web12306 implements Runnable {

	private int num = 50;

	@Override
	public void run() {
		while (true) {
			if (num == 0) {
				break;
			}
			System.out.println(Thread.currentThread().getName() + "抢到了" + num--);
		}
	}

	public static void main(String[] args) {
		Web12306 web12306 = new Web12306();
		Thread web = new Thread(web12306, "黄牛1");
		Thread web1 = new Thread(web12306, "黄牛2");
		web.start();
		web1.start();
	}
}
