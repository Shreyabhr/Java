package com.techlab.test;

import com.techlab.model.Circle;
import com.techlab.model.Color;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1;
		Circle c2;
		Circle c3;
		c1 = new Circle(1,Color.BLUE);
		c2 = new Circle(20,Color.RED);
		c3 = new Circle(25);
		Circle [] cirArr=new Circle[3];
		cirArr[0] = c1;
		cirArr[1] = c2;
		cirArr[2] = c3;
		Circle big = c1.findBiggestCircle(cirArr);
		PrintBigCircleInfo(big);
		PrintCircleInfo(c1);
		PrintCircleInfo(c2);
		PrintCircleInfo(c3);

	}

	private static void PrintBigCircleInfo(Circle b) {
		System.out.println("The biggest circle has: Radius: "+b.getRadius()+" Color: "+b.getColor()+" Area: "+b.calculateArea()+" Perimeter "+b.calculatePeri());
		
	}

	private static void PrintCircleInfo(Circle c) {
		System.out.println("Radius: "+c.getRadius()+" Color: "+c.getColor()+" Area: "+c.calculateArea()+" Perimeter "+c.calculatePeri());
		
	}

}
