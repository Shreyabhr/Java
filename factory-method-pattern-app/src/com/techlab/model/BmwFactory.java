package com.techlab.model;

public class BmwFactory implements IAutoFactory{
	
	public BMW make() {
		return new BMW();
	}

}
