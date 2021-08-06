package com.techlab.test;
import com.techlab.model.Person;

public class PersonTest {
	public static void main(String[] args) {
		Person p1;
		p1 = new Person("rajesh",14);
		try {
			p1.validAgeForVoting();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
		
		
	

}
