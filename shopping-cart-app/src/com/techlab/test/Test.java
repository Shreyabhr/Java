package com.techlab.test;

import java.util.ArrayList;

import com.techlab.model.Customer;
import com.techlab.model.LineItem;
import com.techlab.model.Order;
import com.techlab.model.Product;

public class Test {

	public static void main(String[] args) {
		Customer c1 = new Customer(100,"sam");
		Product p1 = new Product(1,"tomato",30);
		LineItem item1 = new LineItem(21,10,p1);
		Product p2 = new Product(2,"potatoe",25);
		LineItem item2 = new LineItem(22,20,p2);
		LineItem item3 = new LineItem(23,5,p1);
		
		Order order = new Order(100,"1 july");
		
		order.addItem(item1);
		order.addItem(item2);
		order.addItem(item3);
		c1.addOrder(order);
		printInvoiceCustomer(c1);

	}

	private static void printInvoiceCustomer(Customer c1) {
		System.out.println("Customer Id: "+c1.getCid());
		System.out.println("Customer Name: "+c1.getCname());
		ArrayList<Order> orders=  c1.getTotalOrders();
		for(Order order : orders) {
			System.out.println("Order Id: "+order.getOid());
			System.out.println("Order date: "+order.getDate());
			ArrayList<LineItem> items = order.getTotalItems();
			for(LineItem item : items) {
				System.out.println("Id: "+item.getLid());
				System.out.println("Quantity: "+item.getQty());
				System.out.println("Product Name: "+item.getProduct().getPname());
				System.out.println("Product Cost: "+item.getProduct().getCost());
			}
			System.out.println("Check Out Price: "+order.CheckOutPrice());
		}
		
	}

}
