package com.techlab.test;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();       
		map.put(1,"One");
		map.put(2,"Two");    
		map.put(3,"Three");   
		map.put(4,"Four");  
		System.out.println("Keys: "+map.keySet());  
		System.out.println("Values: "+map.values());  
		map.remove(4);  
		map.replace(3, "Thrice");  
		System.out.println("Key-Value pairs: "+map.entrySet());  

	}

}
