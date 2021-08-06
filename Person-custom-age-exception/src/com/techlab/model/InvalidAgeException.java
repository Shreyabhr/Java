package com.techlab.model;

public class InvalidAgeException extends Exception{
	private int id;
	private String name;
	private int age;
	private String msg;
	
	public InvalidAgeException(Person other) {
		this.id = other.getId();
		this.name = other.getName();
		this.age = other.getAge();
	}
	
	public void setMessage() {
		msg = "Person cannot vote \n id: "+id+"\n Name: "+name+"\n Age: "+age;
	}

	@Override
	public String getMessage() {
		setMessage();
		return msg;
	}
	
		

}
