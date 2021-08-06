package com.techlab.student.test;

import java.util.Iterator;
import java.util.TreeSet;

import com.techlab.model.Student;

public class TreeSetStudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(1,"Raj",8.9);
		Student s2 = new Student(2,"Sujay",9.9);
		Student s3 = new Student(3,"Prachi",7.9);
		TreeSet<Student> set=new TreeSet<Student>();  
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.remove(s1);
		Iterator<Student> itr = set.iterator();
        while (itr.hasNext()) {
        	System.out.println(itr.next());
        }
        System.out.println("Highest Value: "+set.pollFirst());  
        System.out.println("Lowest Value: "+set.pollLast());  
	}

}
