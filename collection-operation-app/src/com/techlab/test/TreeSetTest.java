package com.techlab.test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();  
		set.add("One");  
        set.add("Two");  
        set.add("Three");  
        set.remove("Two");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
        	System.out.println(itr.next());
        }
        System.out.println("Highest Value: "+set.pollFirst());  
        System.out.println("Lowest Value: "+set.pollLast());  
	}

}
