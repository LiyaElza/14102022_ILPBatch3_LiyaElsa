package com.experion.entity;

import java.util.ArrayList;

public class Account extends Product{
	
	private double accountBalance ;
	

	
	public Account(String productCode, String productType, ArrayList<Service> bankservices,
			double accountBalance) {
		super(productCode, productType, bankservices);
		this.accountBalance = accountBalance;
	}


	public Account()
	{
		
	}


	public double getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	

}
