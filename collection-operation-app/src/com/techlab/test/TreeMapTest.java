package com.techlab.test;

import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		map.put(1,"One");
		map.put(2,"Two");    
		map.put(3,"Three");   
		map.put(4,"Four");   
		map.remove(1);      
		map.replace(3, "Thrice");  
		for(Entry<Integer, String> m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  

	}

}
