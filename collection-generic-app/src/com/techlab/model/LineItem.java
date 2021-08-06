package com.techlab.model;

public class LineItem {
	private int id;
	private String name;
	private double unitPrice;
	private int quantity;
	private double totalItemCost;
	
	public LineItem(int id,String name,double unitPrice,int quantity) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getTotalItemCost() {
		return totalItemCost;
	}
	
	public void calculateTotalItemPrice() {
		totalItemCost = unitPrice * quantity;
	}

	@Override
	public String toString() {
		return "LineItem [Id=" + id + ", Name=" + name + ", Price=" + unitPrice + ", Quantity="
				+ quantity + "]";
	}
	
	
	

}
