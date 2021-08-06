package com.techlab.model;

public class AudiFactory implements IAutoFactory{
	
	public Audi make() {
		return new Audi();
	}

}
