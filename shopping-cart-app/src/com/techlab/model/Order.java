package com.techlab.model;
import java.util.ArrayList;


public class Order {
	private int oid;
	private String date;
	private final ArrayList<LineItem> items;
	
	public Order(int oid, String date) {
		this.oid = oid;
		this.date = date;
		this.items = new ArrayList<LineItem>();

	}
	
	public int getOid() {
		return oid;
	}
	
	public String getDate() {
		return date;
	}
	
	public void addItem(LineItem item){
		boolean flagAdd = true;
		if(items.isEmpty()) {
			items.add(item);
		}
		else {
			for(LineItem it: items) {
				if(it.getProduct().getPname().equals(item.getProduct().getPname())) {
					flagAdd = false;
					it.setQty(item.getQty()+it.getQty());
				}
				
			}
			if(flagAdd) {
				items.add(item);
		}
		
		}
		
	}
	
	public ArrayList<LineItem> getTotalItems(){
		return items;
	}
	
	public double CheckOutPrice() {
		double price = 0;
		for(LineItem item: items) {
			price += item.calculateCost();
		}
		return price;
	}
	
	
	
	

}
