package com.wn.thread.java174;

public class Demo1 {
	public static void main(String[] args) {
		Study study = new Study();
		Thread t = new Thread(study);
		t.start();
		for (int i = 0; i < 100; i++) {
			if (50 == i) {// 外部干涉
				study.stop();
			}
			System.out.println("main.....");
		}
	}
}

class Study implements Runnable {

	private boolean flag = true;

	@Override
	public void run() {
		while (flag) {
			System.out.println("study.....");
		}
	}

	public void stop() {
		this.flag = false;
	}

}
