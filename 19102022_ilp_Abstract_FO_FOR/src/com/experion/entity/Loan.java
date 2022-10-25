package com.experion.entity;

public class Loan extends Product {
	private String loanNumber;
	private double loanAmount;
	
	
	
	public Loan(String productName, String loanNumber, double loanAmount) {
		super(productName);
		this.loanNumber = loanNumber;
		this.loanAmount = loanAmount;
	}
	
	public String getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	@Override
	public void checkProductValidity() {
		// TODO Auto-generated method stub
		System.out.println("Validity check of Loan Class");
	}
	
	
	
}
	
	
	