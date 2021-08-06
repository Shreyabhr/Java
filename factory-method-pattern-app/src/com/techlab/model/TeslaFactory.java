package com.techlab.model;

public class TeslaFactory implements IAutoFactory{
	
	public Tesla make() {
		return new Tesla();
	}

}
