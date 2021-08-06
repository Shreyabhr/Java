package com.techlab.test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

import com.techlab.model.AudiFactory;
import com.techlab.model.BmwFactory;
import com.techlab.model.IAuto;
import com.techlab.model.IAutoFactory;
import com.techlab.model.TeslaFactory;

public class FactoryTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("D:\\Design_Patterns_java\\factory-method-ocp-app\\src\\resources\\credentials.properties"); 
		Properties p=new Properties();  
	    p.load(reader);   
	    String path = p.getProperty("currentFactory");  
	    System.out.println(p.getProperty("."));
	    IAutoFactory factory = null;
	    //Properties pe = new Properties(System.getProperties());
	    //IAutoFactory factory = (factory) pe.getClass();
	    //System.getProperty("path.separator");
	    /*if(path.equals("com.techlab.model.TeslaFactory"))
	    	factory = TeslaFactory.getInstance();
	    else if(path.equals("com.techlab.model.AudiFactory"))
	    	factory = AudiFactory.getInstance();
	    else if(path.equals("com.techlab.model.BmwFactory"))
	    	factory = BmwFactory.getInstance();*/
		IAuto auto = factory.make();
		auto.getName();
		auto.start();
		auto.stop();
		System.out.println(factory.hashCode());
		IAutoFactory factory1 = AudiFactory.getInstance();
		System.out.println(factory1.hashCode());
		

	}

}
