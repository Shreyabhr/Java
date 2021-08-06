package com.techlab.model;

public class LineItem{
	private int lid;
	private int qty;
	Product product;
	
	public LineItem(int lid, int qty, Product product) {
		this.lid = lid;
		this.qty = qty;
		this.product = product;
	}
	
	public int getLid() {
		return lid;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	} 

	public Product getProduct() {
		return product;
	}
	
	public double calculateCost() {
		return qty * product.getCost();
		
	} 

}
