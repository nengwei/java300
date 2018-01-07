package com.wn.gof23.factory.factory;

import com.wn.gof23.factory.Car;

/**
 * 方法工厂模式
 * 
 * @author weineng
 *
 */
public class Client {
	public static void main(String[] args) {
		Car bmw = new AudiFactory().createCar();
		bmw.run();
	}
}
