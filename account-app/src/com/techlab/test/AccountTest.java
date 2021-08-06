package com.techlab.test;
import com.techlab.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account a1;
		Account a2;
		a1 = new Account(1126,"Ravi",2500);
		a2 = new Account(1127,"Ankita",1500);
		a1.deposite(100);
		
		if(a2.withdraw(600)!=true) {
			System.out.println("Cannot be withdrawn low balance");
		}
		else {
			printAccountInfo(a2);
		}
		printAccountInfo(a1);
		

	}

	private static void printAccountInfo(Account a) {
		System.out.println("Account NO: "+a.getAccNo()+" Account Name: "+a.getAccName()+" Balance: "+a.getBalance());
		
	}

}
