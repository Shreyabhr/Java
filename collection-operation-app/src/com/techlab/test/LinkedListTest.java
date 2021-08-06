package com.techlab.test;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list= new LinkedList<String>();
		list.add("two");
		list.add("three");
		list.add(0, "one");
		list.set(1, "twice");
		System.out.println(list.get(2));
		list.remove(2);
		for(String item : list) {
			System.out.println(item);
		}
		

	}

}
