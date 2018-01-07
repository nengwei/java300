package com.wn.gof23.build;

//StringBuilder   Dombuilder   SaxBuilder
public class SxtAirShipBuilder implements AirShipBuilder {

	@Override
	public Engine builderEngine() {
		System.out.println("构建发动机");
		return new Engine("发动机");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("构建轨道舱");
		return new OrbitalModule("轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("构建逃逸塔");
		return new EscapeTower("轨道舱");
	}

}
