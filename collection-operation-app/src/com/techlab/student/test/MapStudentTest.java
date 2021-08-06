package com.techlab.student.test;

import java.util.HashMap;
import java.util.Map.Entry;

import com.techlab.model.Student;

public class MapStudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"Raj",8.9);
		Student s2 = new Student(2,"Sujay",9.9);
		Student s3 = new Student(3,"Prachi",7.9);
		Student s4 = new Student(4,"Rahul",6.9);
		HashMap<Integer, Student> map = new HashMap<>();
		map.put(1,s1);
		map.put(2,s2);
		map.put(3,s3);
		map.remove(1);
		map.replace(2, s4);  
		for(Entry<Integer, Student> m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  

	}

}
