package com.techlab.model;

public class Account {
	private int accNo;
	private String accName;
	private double balance;
	private boolean transactionFlag = true;
	private double minimumBalance;
	static int count;
	
	static {
		count = 0;
	}
	
	public Account(int accNo, String accName, double balance) {
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
		count += 1;
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + ", minimumBalance="
				+ minimumBalance + "]";
	}
	
	
	@Override
	public int hashCode() {
		return accNo;
	}

	@Override
	public boolean equals(Object obj) {
		Account a = (Account) obj;
		if(this.accNo == a.accNo) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public int getAccNo() {
		return accNo;
	}
	public String getAccName() {
		return accName;
	}
	public double getBalance() {
		return balance;
	}
	public int getCount() {
		return count;
	}
	public static int headCount() {
		return count;
	}
	public boolean getTransactionFlag() {
		return transactionFlag;
	}
	
	public void deposite(double amount) {
		balance += amount;
	}
	
	public boolean withdraw(double amount) {
		if(balance-amount<=minimumBalance) {
			transactionFlag=false;
		}
		else {
			balance -= amount;
		}
		return transactionFlag;
	}

	
	


}
