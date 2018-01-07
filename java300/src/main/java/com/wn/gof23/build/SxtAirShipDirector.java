package com.wn.gof23.build;

/**
 * 装配
 * 
 * @author weineng
 *
 */
public class SxtAirShipDirector implements AirShipDirector {

	private AirShipBuilder builder;

	public SxtAirShipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}

	@Override
	public AirShip createAirShip() {
		Engine e = builder.builderEngine();
		OrbitalModule o = builder.builderOrbitalModule();
		EscapeTower es = builder.builderEscapeTower();

		AirShip ship = new AirShip();
		ship.setEngine(e);
		ship.setOrbitalModule(o);
		ship.setEscapeTower(es);
		return ship;
	}

}
