package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class OrderTest {

	@Test
	void testOrder() {
		int expectedoid = 21;
		String expecteddate = "6/6/2021";
		Order o = new Order(21,"6/6/2021");
		assertEquals(expectedoid, o.getOid());		
		assertEquals(expecteddate, o.getDate());
	}

	@Test
	void testAddItem() {
		int expectedoid = 21;
		String expecteddate = "6/6/2021";
		int expectedquantity = 15;
		Product p1 = new Product(1,"tomato",30);
		LineItem item1 = new LineItem(21,10,p1);
		LineItem item2 = new LineItem(23,5,p1);
		Order o = new Order(21,"6/6/2021");
		o.addItem(item1);
		o.addItem(item2);
		assertEquals(expectedoid, o.getOid());
		assertEquals(expecteddate, o.getDate());
		ArrayList<LineItem> items = o.getTotalItems();
		for(LineItem item : items) {
			assertEquals(expectedquantity,item.getQty());
		}
	}

	@Test
	void testCheckOutPrice() {
		double expectedcheckoutprice = 450;
		Product p1 = new Product(1,"tomato",30);
		LineItem item1 = new LineItem(21,10,p1);
		LineItem item2 = new LineItem(23,5,p1);
		Order o = new Order(21,"6/6/2021");
		o.addItem(item1);
		o.addItem(item2);
		assertEquals(expectedcheckoutprice,o.CheckOutPrice());
		
	}

}
