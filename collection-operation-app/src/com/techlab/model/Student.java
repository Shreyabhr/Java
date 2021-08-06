package com.techlab.model;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private double cgpa;
	
	public Student(int id, String name, double cgpa) {
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
	
	public double getCgpa() {
		return cgpa;
	}

	@Override
	public String toString() {
		return "Student [ID =" + id + ", Name =" + name + ", Cgpa =" + cgpa + "]";
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if (id > s.id) {
            return 1;
        }
        else if (id < s.id) {
            return -1;
        }
        else {
            return 0;
        }
	}
	
	

}
