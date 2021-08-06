package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account a1;
		Account a2;
		Account a3;
		a1 = new Account("Ravi",2500);
		a1.getCount();
		printAccountInfo(a1);
		a2 = new Account("Ankita",1500);
		a2.getCount();
		printAccountInfo(a2);
		a3 = new Account("Sharon",2500);
		a3.getCount();
		printAccountInfo(a3);
		System.out.println("count: "+Account.headCount());

	}
	private static void printAccountInfo(Account a) {
		System.out.println("Account NO: "+a.getAccNo()+" Account Name: "+a.getAccName()+" Balance: "+a.getBalance()+" Count:"+a.getCount());
		
	}

}
