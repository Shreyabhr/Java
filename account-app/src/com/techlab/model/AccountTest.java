package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void testAccount() {
		//arrange
		int expectedaccNo = 101;
		String expectedaccName = "xyz";
		double expectedbalance = 2000;
		//act
		Account a = new Account(101,"xyz",2000);
		//assert
		assertEquals(expectedaccNo, a.getAccNo());
		assertEquals(expectedaccName, a.getAccName());
		assertEquals(expectedbalance, a.getBalance());
		
	}

	@Test
	void testDeposite() {
		double expectedbalance = 2500;
		Account a = new Account(101,"xyz",2000);
		a.deposite(500);
		assertEquals(expectedbalance, a.getBalance());
	}

	@Test
	void testWithdraw() {
		double expectedbalance = 1500;
		Account a = new Account(101,"xyz",2000);
		a.withdraw(500);
		assertEquals(expectedbalance, a.getBalance());
	}

}
