package com.techlab.test;

import com.techlab.model.Programmer;

public class Test {

	public static void main(String[] args) {
		Programmer p1 =new Programmer(12,"Harshada",4500,200);
		printProgrammerInfo(p1);
	

	}

	private static void printProgrammerInfo(Programmer p) {
		System.out.println("Employee ID: "+p.getId()+" Employee Name: "+p.getName()+" Employee Salary: "+p.getSalary()+" Bonus: "+p.getBonus());
		
	}

}
