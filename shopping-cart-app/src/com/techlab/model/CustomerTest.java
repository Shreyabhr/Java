package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testCustomer() {
		int expectedcid = 201;
		String expectedcname = "qrs";
		Customer c = new Customer(201,"qrs");
		assertEquals(expectedcid,c.getCid());
		assertEquals(expectedcname,c.getCname());
	}

	@Test
	void testAddOrder() {
		int expectedoid = 21;
		String expecteddate = "6/6/2021";
		String expectedcname = "qrs";
		Customer c = new Customer(201,"qrs");
		Product p1 = new Product(1,"tomato",30);
		LineItem item1 = new LineItem(21,10,p1);
		LineItem item2 = new LineItem(23,5,p1);
		Order o = new Order(21,"6/6/2021");
		o.addItem(item1);
		o.addItem(item2);
		c.addOrder(o);
		assertEquals(expectedcname, c.getCname());
		ArrayList<Order> orders=  c.getTotalOrders();
		for(Order order : orders) {
			assertEquals(expectedoid,order.getOid());
			assertEquals(expecteddate,order.getDate());
		}
	}

}
