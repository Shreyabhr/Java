package com.techlab.model;

public class Circle {
	private int radius;
	private String color;
	double pi=3.14;
	public Circle(int radius) {
		this(radius,Color.YELLOW);
	}
	public Circle(int radius, Color c) {
		if(radius>=10 && radius<=50) {
			this.radius=radius;
		}
		else {
			this.radius = 10;
		}
		this.color=c.toString();
	}
	
	public int getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public float calculateArea() {
		return (float)pi*radius*radius;
	}
	
	public float calculatePeri() {
		return 2*(float)pi*radius;
	}
	
	public Circle findBiggestCircle(Circle cirArr[]) {
		int maxIndex = 0;
		for (int i = 1; i < cirArr.length; i++) {
			if (cirArr[i].radius > cirArr[maxIndex].radius)
                maxIndex = i;
		}
		return cirArr[maxIndex];  
	}
	
	

}
