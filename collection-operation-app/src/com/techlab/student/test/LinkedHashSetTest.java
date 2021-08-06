package com.techlab.student.test;

import java.util.Iterator;
import java.util.LinkedHashSet;

import com.techlab.model.Student;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"Raj",8.9);
		Student s2 = new Student(2,"Sujay",9.9);
		Student s3 = new Student(3,"Prachi",7.9);
		LinkedHashSet<Student> set=new LinkedHashSet<Student>();  
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.remove(s1);
		Iterator<Student> itr = set.iterator();
        while (itr.hasNext()) {
        	System.out.println(itr.next());
        }
	}

	

}
