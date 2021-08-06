package com.techlab.test;

import java.util.ArrayList;
import java.util.Collections;

import com.techlab.model.SortByCgpa;
import com.techlab.model.SortById;
import com.techlab.model.SortByName;
import com.techlab.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		Student s1 = new Student(1,"Raj",8);
		Student s2 = new Student(2,"Sujay",9);
		Student s3 = new Student(3,"Prachi",7);
		Student s4 = new Student(4,"Rahul",6);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		//Collections.sort(list);
		System.out.println("Sorted By Name");
		Collections.sort(list, new SortByName());
		for(Student item : list) {
			System.out.println(item);
		}
		System.out.println("Sorted By Id");
		Collections.sort(list, new SortById());
		for(Student item : list) {
			System.out.println(item);
		}
		System.out.println("Sorted By Cgpa");
		Collections.sort(list, new SortByCgpa());
		for(Student item : list) {
			System.out.println(item);
		}

	}

}
