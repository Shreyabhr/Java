package com.techlab.test;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.set(1, "twice");
		list.remove(0);
		for(String item : list) {
			System.out.println(item);
		}
		System.out.println(list.get(1));

	}

}
