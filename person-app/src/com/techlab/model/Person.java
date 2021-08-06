package com.techlab.model;

public class Person {
	private int id;
	private String name;
	private float height;
	private float weight;
	
	public Person(int id, String name, float height, float weight) {
		if(id>=1 && id<=100) {
			this.id=id;
		}
		else {
			this.id=50;
		}
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getHeight() {
		return height;
	}
	public float getWeight() {
		return weight;
	}
	public void play() {
		height = height + (float)(0.01 * height);
		weight = weight - (float)(0.1 * weight);
	}
	public void eat() {
		weight = weight + (float)(0.05 * weight);
	}
}
