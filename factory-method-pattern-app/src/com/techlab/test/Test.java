package com.techlab.test;

import com.techlab.model.AudiFactory;

public class Test {
	
	public static void main(String[] args) {
		
		AudiFactory audi = new AudiFactory();
		audi.make().start();
	}

}
