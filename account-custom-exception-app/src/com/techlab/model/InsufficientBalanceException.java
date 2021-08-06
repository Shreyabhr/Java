package com.techlab.model;

public class InsufficientBalanceException extends RuntimeException{
	private int accNo;
	private String accName;
	private double balance;
	private double amount;
	private String msg;
	
	public InsufficientBalanceException(Account other, double amount) {
		this.accNo = other.getAccNo();
		this.accName = other.getAccName();
		this.balance = other.getBalance();
		this.amount = amount;
		
	}
	
	public void setMessage() {
		msg = "Sorry the amount "+amount+" cannot be withdrwal due to low balance from\n AccountNo: "+accNo+ "\n AccountName:"+accName+"\n Balance: "+balance;
	}

	@Override
	public String getMessage() {
		setMessage();
		return msg;
	}
	
	
	
	
	
	

}
