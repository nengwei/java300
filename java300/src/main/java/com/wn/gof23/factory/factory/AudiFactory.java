package com.wn.gof23.factory.factory;

import com.wn.gof23.factory.Audi;
import com.wn.gof23.factory.Car;

public class AudiFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Audi();
	}

}
