package com.techlab.test;

import java.io.FileReader;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("D:\\Design_Patterns_java\\property-file-app\\src\\resources\\credentials.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    System.out.println("Username: "+p.getProperty("username"));  
	    System.out.println("Password: "+p.getProperty("password"));  

	}

	
}
