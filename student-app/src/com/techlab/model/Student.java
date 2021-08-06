package com.techlab.model;
public class Student {
	private int id;
	private int age;
	private String name;
	
	/*public void setId(int pid) {
		if(pid<=50 && pid>=1) {
			id = pid;
		}
		else {
			id = 100;
		}
	}
	public void setAge(int page) {
		if(page<=21 && page>=16) {
			age = page;
		}
		else {
			age = 16;
		}
	}
	public void setName(String pname) {
		name = pname;
	}*/
	public Student(int pid, String pname,int page) {
		this.id = pid;
		this.age = page;
		this.name = pname;
	}
	
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}
