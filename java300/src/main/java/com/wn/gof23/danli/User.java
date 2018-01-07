package com.wn.gof23.danli;

import java.io.Serializable;

public class User implements Serializable{

	private int id;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
