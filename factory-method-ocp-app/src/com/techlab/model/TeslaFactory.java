package com.techlab.model;

public class TeslaFactory implements IAutoFactory{
	
	private static TeslaFactory factory;
	
	public static TeslaFactory getInstance() {
		if(factory == null) {
			synchronized(TeslaFactory.class) {
				if(factory == null) {
					factory = new TeslaFactory();
				}
			}
		}
		return factory;
	}
	
	public IAuto make() {
		return new Tesla();
	}


}
