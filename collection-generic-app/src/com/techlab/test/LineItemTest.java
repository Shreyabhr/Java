package com.techlab.test;

import java.util.ArrayList;

import com.techlab.model.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		LineItem item1 = new LineItem(1,"Maggie",10,2);
		LineItem item2 = new LineItem(2,"Shampoo",50,1);
		LineItem item3 = new LineItem(3,"Soap",10,3);
		ArrayList cart = new ArrayList();
		cart.add(item1);
		cart.add(item2);
		cart.add(item3);
		cart.add("abc");
		printCart(cart);

	}

	private static void printCart(ArrayList<LineItem> cart) {
		double total = 0;
		for (int i = 0; i < cart.size(); i++) {
			LineItem item = cart.get(i);
			item.calculateTotalItemPrice();
			total = total + item.getTotalItemCost() ;
			System.out.println(item);
		}
		
			System.out.println("checkout total price: " +total);
		
		
	}

}
