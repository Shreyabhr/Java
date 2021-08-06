package com.techlab.model;

public class Person {
	static int id;
	private String name;
	private int age;
	
	static {
		id = 0;
	}
	
	public Person(String name, int age) {
		id +=1;
		this.name=name;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void validAgeForVoting() throws Exception{
		if(age<18) {
			throw new InvalidAgeException(this);
		}
	}
	
}
