package com.techlab.test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.remove("Australia");
        Iterator<String> itr = h.iterator();
        while (itr.hasNext()) {
        	System.out.println(itr.next());
        }
	}

}
