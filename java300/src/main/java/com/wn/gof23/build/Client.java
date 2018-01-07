package com.wn.gof23.build;

public class Client {

	public static void main(String[] args) {
		AirShipDirector director = new SxtAirShipDirector(new SxtAirShipBuilder());
		AirShip a = director.createAirShip();
		
	}

}
