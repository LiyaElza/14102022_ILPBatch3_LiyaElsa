package com.experion.entity;

import com.experion.service.CardAccountService;

public class Card extends Product implements CardAccountService {
	private String cardNumber;
	private double cardBalance;
	
	
	public Card(String productName, String cardNumber, double cardBalance) {
		super(productName);
		this.cardNumber = cardNumber;
		this.cardBalance = cardBalance;
	}


	public String getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	public double getCardBalance() {
		return cardBalance;
	}


	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}


	@Override
	public void checkProductValidity() {
		// TODO Auto-generated method stub
		System.out.println("Validity check of Card Class");
	}


	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Card Balance is checked ");
		
	}


	@Override
	public void cashWithdraw() {
		// TODO Auto-generated method stub
		System.out.println("Cash is withdrawed from Card ");
	}
	
	
}
	
	
	