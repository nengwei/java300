package com.wn.gof23.prototype;

import java.util.Date;

public class Client {
	
	//浅复制
	public static void main(String[] args) throws CloneNotSupportedException {
		Sheep sheep = 	new Sheep("克隆羊", new Date());
		System.out.println(sheep.getName());
		
		Sheep sheep2 = (Sheep) sheep.clone();
		System.out.println(sheep2.getName());
	}

}
