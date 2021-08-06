package com.techlab.model;


public class AutomobileFactory {
	
	private static AutomobileFactory factory;
	
	public static AutomobileFactory getInstance() {
		if(factory == null) {
			synchronized(AutomobileFactory.class){
				if(factory == null) {
					factory = new AutomobileFactory();
				}
			}
		}
		return factory;
	}
	
	public IAuto make(AutoType auto) {
		if(auto == AutoType.AUDI) return new Audi();
		else if (auto == AutoType.BMW) return new BMW();
		else if (auto == AutoType.TESLA) return new Tesla();
		return null;
		
		
	}

}
