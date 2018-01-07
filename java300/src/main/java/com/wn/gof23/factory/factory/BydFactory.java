package com.wn.gof23.factory.factory;

import com.wn.gof23.factory.Bmw;
import com.wn.gof23.factory.Car;

public class BydFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new Bmw();
	}

}
