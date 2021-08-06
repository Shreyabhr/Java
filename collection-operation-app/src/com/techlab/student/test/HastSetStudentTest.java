package com.techlab.student.test;

import java.util.HashSet;
import java.util.Iterator;

import com.techlab.model.Student;

public class HastSetStudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(1,"Raj",8.9);
		Student s2 = new Student(2,"Sujay",9.9);
		Student s3 = new Student(3,"Prachi",7.9);
		HashSet<Student> h = new HashSet<Student>();
		h.add(s1);
		h.add(s2);
		h.add(s3);
		h.remove(s2);
		Iterator<Student> itr = h.iterator();
		while (itr.hasNext()) {
        	System.out.println(itr.next());
        }
		

	}

}
