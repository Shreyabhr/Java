package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void testProduct() {
		//arrange
		int expectedpid = 10;
		String expectedpname = "abc";
		double expectedcost = 20;
		//act
		Product p = new Product(10,"abc",20);
		assertEquals(expectedpid, p.getPid());
		assertEquals(expectedpname, p.getPname());
		assertEquals(expectedcost, p.getCost());
	}

}
