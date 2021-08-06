package com.techlab.test;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1,"One");
		map.put(2,"Two");    
		map.put(3,"Three");   
		map.remove(3); 
		map.replace(2, "Twice");  
		for(Entry<Integer, String> m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  

	}

}
