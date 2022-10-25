package com.experion.entity;

import com.experion.service.CardAccountService;

public class Account extends Product implements CardAccountService {
	private String accountNumber;
	private double accountBalance;
	
	
	public Account(String productName, String accountNumber, double accountBalance) {
		super(productName);
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override //annotation
	public void checkProductValidity() {
		// TODO Auto-generated method stub
		System.out.println("Validity check of Account Class");
	}
	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Account Balance is checked");
		
	}
	@Override
	public void cashWithdraw() {
		// TODO Auto-generated method stub
		System.out.println("Cash is withdrawed from Account ");
		
	}
}
	
	
	