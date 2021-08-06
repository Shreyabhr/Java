package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineItemTest {

	@Test
	void testLineItem() {
		int expectedlid = 101;
		int expectedquantity = 10;
		int expectedproductpid = 1;
		String expectedproductpname = "tomato";
		double expectedproductcost = 30;
		LineItem item = new LineItem(101,10,new Product(1,"tomato",30));
		assertEquals(expectedlid, item.getLid());
		assertEquals(expectedquantity, item.getQty());
		assertEquals(expectedproductpid, item.getProduct().getPid());
		assertEquals(expectedproductpname, item.getProduct().getPname());
		assertEquals(expectedproductcost, item.getProduct().getCost());
	}

	@Test
	void testCalculateCost() {
		double expectedtotalcost = 300;
		LineItem item = new LineItem(101,10,new Product(1,"tomato",30));
		assertEquals(expectedtotalcost,item.calculateCost());
	}

}
