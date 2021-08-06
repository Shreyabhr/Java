package com.techlab.model;

public class Student {
	private int id;
	private String name;
	private int cgpa;
	
	public Student(int id, String name, int cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCgpa() {
		return cgpa;
	}

	@Override
	public String toString() {
		return "Student [ID =" + id + ", Name =" + name + ", Cgpa =" + cgpa + "]";
	}


}


