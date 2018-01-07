package com.wn.gof23.factory.simplefactory;

import com.wn.gof23.factory.Audi;
import com.wn.gof23.factory.Bmw;
import com.wn.gof23.factory.Car;

/**
 * 违反开闭原则：需要修改代码
 * 
 * @author weineng
 *
 */
public class CarFactory {

	public Car createCar(String type) {
		if (type.equals("Audi")) {
			return new Audi();
		} else if (type.equals("Bmw")) {
			return new Bmw();
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		CarFactory c = new CarFactory();
		c.createCar("Audi").run();
		c.createCar("Bmw").run();
	}

}
