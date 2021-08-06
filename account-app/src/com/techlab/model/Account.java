package com.techlab.model;

public class Account {
	private int accNo;
	private String accName;
	private double balance;
	private boolean transactionFlag = true;
	private double minimumBalance;
	
	public Account(int accNo, String accName, double balance) {
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
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
