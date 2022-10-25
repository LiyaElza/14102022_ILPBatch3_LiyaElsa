package com.experion.service;

import java.util.ArrayList;

import com.experion.entity.Account;
import com.experion.entity.BankServices;
import com.experion.entity.Card;
import com.experion.entity.Product;

public class Service {

	public static Product createProduct(String productType) {
		
		ArrayList<BankServices> bankServices = new ArrayList<BankServices>();
		bankServices.add(new BankServices("234","Online Banking"));
		bankServices.add(new BankServices("222","Cash Transfer"));
		bankServices.add(new BankServices("236","Account Creation"));
		Product product = null;
		
		if (productType.compareTo("Cards") == 0) {
			product = new Card("RC100", "MasterCard", "Cards", "Master");
		} else if (productType.compareTo("Accounts") == 0) {
			product = new Account("AC100", "Savings Account", "Accounts", "Savings",bankServices);
		}
		return product;

	}

	public static void displayProduct(ArrayList<Product> productList) {

		Card card = null;
		Account account = null;
		System.out.println("Product Code " + " " + "Product Name" + " " + "Product Type " + " " + "Card/Account"+" "+"ServiceName");
		for (Product product : productList) {
			if (product instanceof Card) {
				card = (Card) product; // typecasting
				System.out.println(card.getProductCode() + " " + card.getProductName() + " " + card.getProductType()
						+ " " + card.getCardTytpe());
			} else if (product instanceof Account) {
				account = (Account) product;
				System.out.println(account.getProductCode() + " " + account.getProductName() + " "
						+ account.getProductType() + " " + account.getAccountType());
				System.out.println("The list of services are :");
				for(BankServices bankServices: account.getBankServices()) {
					System.out.println(bankServices.getServiceName());
				}
				
			}
		}

	}

}
