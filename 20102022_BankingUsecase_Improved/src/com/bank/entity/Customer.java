package com.bank.entity;

import java.util.ArrayList;

public class Customer {

	private String customerCode;
	private String customerName;
	private ArrayList<Product> productList;


	
	
	public Customer(String customerCode, String customerName, ArrayList<Product> productList) {
		super();
		this.customerCode = customerCode;
		this.customerName = customerName;
		this.productList = productList;
	}


	public String getCustomerCode() {
		return customerCode;
	}


	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}


	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public ArrayList<Product> getProductList() {
		return productList;
	}


	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}

	
}
