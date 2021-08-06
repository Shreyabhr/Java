package com.techlab.model;
import java.io.*;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("test.txt");
			if (file.createNewFile()) { 
		         System.out.println("File is created!");
		      } else {
		         System.out.println("File already exists.");
		      } 
			FileWriter writer = new FileWriter(file);
			writer.write("hello\nworld");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
