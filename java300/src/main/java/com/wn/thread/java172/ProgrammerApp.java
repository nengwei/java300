package com.wn.thread.java172;

public class ProgrammerApp {

	public static void main(String[] args) {
		Programmer programmer = new Programmer();
		Thread pro = new Thread(programmer);
		pro.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("聊qq");
		}
	}

}
