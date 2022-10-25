package com.experion.entity;

import java.util.ArrayList;

public class Customer {
	private String customerId;
	private String customerName;
	private ArrayList<Product> product;
	
	

	public Customer(String customerId, String customerName, ArrayList<Product> product) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.product = product;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public ArrayList<Product> getProduct() {
		return product;
	}


	public void setProduct(ArrayList<Product> product) {
		this.product = product;
	}


	
	

}
