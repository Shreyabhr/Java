package com.techlab.test;
import com.techlab.model.Person;

public class PersonTest {

	public static void main(String[] args) {
		Person p1;
		Person p2;
		p1 = new Person(11,"rajesh",45,56);
		p2 = new Person(23,"anuj",30,20);
		printPersonInfo(p1);
		p1.eat();
		personAfterEating(p1);
		printPersonInfo(p2);
		p2.play();
		personAfterPlaying(p2);
		
	}

	private static void personAfterPlaying(Person p) {
		System.out.println("Due to playing height of "+p.getName()+" increases by 1%: " +p.getHeight());
		System.out.println("Due to playing weight of "+p.getName()+" decreases by 10%: " +p.getWeight());
		
	}

	private static void personAfterEating(Person p) {
		System.out.println("Due to eating weight of "+p.getName()+" increases by 5%: " +p.getWeight());
		
	}

	private static void printPersonInfo(Person p) {
		System.out.println("Id: "+p.getId()+" Name: "+p.getName()+" Height: "+p.getHeight()+" Weight: "+p.getWeight());
	
	}

}
