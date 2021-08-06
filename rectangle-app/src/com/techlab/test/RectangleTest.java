package com.techlab.test;
//1-100 id range

//import java.util.Scanner; 
import com.techlab.model.Rectangle;
import com.techlab.model.Thickness;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1;
		Rectangle r2;
		r1 = new Rectangle(16,45,Thickness.HIGH);
		r2 = new Rectangle(20,30);
		Rectangle [] rectArr=new Rectangle[3];
		rectArr[0] = r1;
		rectArr[1] = r2;
		rectArr[2] = new Rectangle(16,25,Thickness.LOW);
		
		PrintInfo(rectArr);
		//Scanner sc= new Scanner(System.in);
		
		/*
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		System.out.println(r.getThickness());*/
		
		/*System.out.println("Height: ");
		int height=sc.nextInt();
		System.out.println("width: ");
		int width=sc.nextInt();
		r = new Rectangle(width,height);*/
/*
		System.out.println("Height: ");
		int height=sc.nextInt();
		r.setHeight(r.CheckRange(height));
		System.out.println("width: ");
		int width=sc.nextInt();
		r.setWidth(r.CheckRange(width));
		System.out.println("thickness: ");
		String thickness=sc.next();
		r.setThickness(thickness);
		PrintRectangleInfo(r1);
		PrintRectangleInfo(r2);*/
		
	}
	

	private static void PrintInfo(Rectangle[] rectArr) {
		for (Rectangle rect:rectArr) {
			System.out.println("Height: "+rect.getHeight()+" Width: "+rect.getWidth()+" Thickness: "+rect.getThickness()+" Area: "+rect.calculateArea());
			System.out.println(rect.hashCode());
		}
		
	}


	public static void PrintRectangleInfo(Rectangle r) {
		System.out.println("Height: "+r.getHeight()+" Width: "+r.getWidth()+" Thickness: "+r.getThickness()+" Area: "+r.calculateArea());
		
	}

}
