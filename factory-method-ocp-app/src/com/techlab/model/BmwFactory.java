package com.techlab.model;

public class BmwFactory implements IAutoFactory{
	
	private static BmwFactory factory;
	
	public static BmwFactory getInstance() {
		if(factory == null) {
			synchronized(BmwFactory.class) {
				if(factory == null) {
					factory = new BmwFactory();
				}
			}
		}
		return factory;
	}
	
	public IAuto make() {
		return new BMW();
	}

}
