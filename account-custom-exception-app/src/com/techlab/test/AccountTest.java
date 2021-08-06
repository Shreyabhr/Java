package com.techlab.test;

import com.techlab.model.Account;
import com.techlab.model.InsufficientBalanceException;

public class AccountTest{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1;
		Account a2;
		a1 = new Account("Ravi",1500);
		
		try {
			a1.withdraw(600);
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		a2 = new Account("Arti",2000);
		printAccountInfo(a2);
		
	}
	private static void printAccountInfo(Account a) {
		System.out.println("Account NO: "+a.getAccNo()+" Account Name: "+a.getAccName()+" Balance: "+a.getBalance()+" Count:"+a.getCount());
		
	}




}
