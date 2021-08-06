package com.techlab.model;
import java.util.ArrayList;

public class Customer {
	private int cid;
	private String cname;
	private final ArrayList<Order> orders;
	
	public Customer(int cid, String cname) {
		this.cid = cid;
		this.cname = cname;
		this.orders = new ArrayList<Order>();
	}
	
	public int getCid() {
		return cid;
	}
	
	public String getCname() {
		return cname;
	}
	
	public ArrayList<Order> getTotalOrders(){
		return orders;
	}
	
	public void addOrder(Order order) {
		orders.add(order);
	}

}
