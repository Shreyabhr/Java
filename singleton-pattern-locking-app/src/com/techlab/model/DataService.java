package com.techlab.model;

public class DataService {
	
private static DataService bucket;
	
	private DataService() {
		System.out.println("Object is created");
		this.hashCode();
	}
	
	/*public static DataService getInstance() {
		if(bucket == null) {
			synchronized(DataService.class){
				if(bucket == null) {
					
					bucket = new DataService();
				}
			}
			
		}
		return bucket;
	}*/
	
	public static DataService getInstance() {
		synchronized(DataService.class){
			if(bucket == null) {
				bucket = new DataService();
		    }
	    }
		return bucket;
	}
	
	public void doSomething() {
		System.out.println("Work done by: "+this.hashCode());
	}

}
