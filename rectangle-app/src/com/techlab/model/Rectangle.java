package com.techlab.model;

public class Rectangle {
	private int width;
	private int height;
	private String thickness;
	
	public Rectangle(int width, int height){
		this(width,height,Thickness.LOW);
	}
	
	public Rectangle(int width, int height,Thickness t){
		this.width = width;
		this.height = height;
		this.thickness=t.toString();
	}
	
	public void setWidth(int pwidth) {
		width=pwidth;
	}
	public void setHeight(int pheight) {
		height=pheight;
	}
	public void setThickness(Thickness t) {
		thickness=t.toString();
	}
	
	public int CheckRange(int parameter) {
		if(parameter<=0) {
			return 1;
		}
		else if(parameter>100){
			return 100;
		}
		return parameter;
		
	}
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public String getThickness() {
		return thickness;
	}
	public int calculateArea() {
		return width*height;
		
	}

}
/*
public void setThickness(String pthickness) {
	if(pthickness.equals("low") || pthickness.equals("high") || pthickness.equals("medium")) {
		thickness = pthickness;
	}
	else {
		thickness = "low";
	}
	
}*/