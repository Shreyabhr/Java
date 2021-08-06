package com.techlab.test;
import java.util.Scanner;

import com.techlab.model.Student; 

public class StudentTest {

	public static void main(String[] args) {
		Student s;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Id: ");
		int id=sc.nextInt();
		System.out.print("Name: ");
		String name=sc.next();
		System.out.print("Age: ");
		int age=sc.nextInt();
		s = new Student(id,name,age);
		
		/*System.out.print("Id: ");
		int id=sc.nextInt();
		s.setId(id);
		System.out.print("Name: ");
		String name=sc.next();
		s.setName(name);
		System.out.print("Age: ");
		int age=sc.nextInt();
		s.setAge(age);*/
		
		PrintStudentInfo(s);

	}

	private static void PrintStudentInfo(Student s) {
		System.out.println("Id: "+s.getId()+" Name: "+s.getName()+" Age: "+s.getAge());
		
	}

	

}
