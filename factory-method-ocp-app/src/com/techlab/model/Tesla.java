package com.techlab.model;

public class Tesla implements IAuto{
	
	public void start() {
		System.out.println("Start Tesla");
	}
	
	public void stop() {
		System.out.println("Stop Tesla");
	}
	
	public void getName() {
		System.out.println("Tesla");
	}

}
