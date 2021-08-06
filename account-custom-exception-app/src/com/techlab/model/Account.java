package com.techlab.model;

public class Account {
	static int accNo;
	private String accName;
	private double balance;
	private boolean isWithdrawalFlag = true;
	private double minimumBalance = 1000;
	static int count;
	
	static {
		count = 0;
		accNo = 100;
	}
	
	public Account(String accName, double balance) {
		accNo += 1;
		this.accName = accName;
		this.balance = balance;
		count += 1;
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
	public boolean getIsWithdrawalFlag() {
		return isWithdrawalFlag;
	}
	
	public void deposite(double amount) {
		balance += amount;
	}
	
	public boolean withdraw(double amount){
		if(balance-amount<=minimumBalance) {
			isWithdrawalFlag=false;
			throw new InsufficientBalanceException(this,amount);
		}
		else {
			balance -= amount;
		}
		return isWithdrawalFlag;
	}

}
