package com.wn.thread.java170;

public class Test {
	
	public static void main(String[] args) {
		Rabbit rabbit = new Rabbit();
		rabbit.start();
		
		Tortoise tortoise = new Tortoise();
		tortoise.start();
	}

}
