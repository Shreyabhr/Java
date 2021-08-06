package com.techlab.test;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;

public class EmployeeFile {
	public static void main(String[] args){
		File file1 = new File("emp.csv");
		try {
			List<String> lines = Files.readAllLines(Paths.get("emp.csv"));
			try {
				File file = new File("copyemp.csv");
				if (file.createNewFile()) { 
			         System.out.println("File is created!");
			      } else {
			         System.out.println("File already exists.");
			      } 
				FileWriter writer = new FileWriter(file);
				for(String line : lines) {
					line = line.replace("\"", "");
				    String[] words = line.split(",");
				
				    for(int i = 0; i < words.length ; i++) {
				    	//

				    	if(words[i].equals("KING")) {
				    		words[i]= "SHREYA";
				    	}
				    	writer.append(words[i]);
					    writer.append(",");
				    }
				    writer.append("\n");
			}
				writer.close();
				
				file1.delete();
				
				File file2 = new File("emp.csv");
				file.renameTo(file2);
			
			}catch (Exception e){
				
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		

}
}
