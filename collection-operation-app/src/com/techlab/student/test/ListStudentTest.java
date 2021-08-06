package com.techlab.student.test;

import java.util.ArrayList;

import com.techlab.model.Student;

public class ListStudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"Raj",8.9);
		Student s2 = new Student(2,"Sujay",9.9);
		Student s3 = new Student(3,"Prachi",7.9);
		Student s4 = new Student(4,"Rahul",6.9);
		Student s5 = new Student(2,"Sujay",9.9);
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.set(0, s4);
		System.out.println(list.contains(s5));
		System.out.println(list.get(1));
		list.remove(0);
		for(Student item : list) {
			System.out.println(item);
		}
		
	}

}
