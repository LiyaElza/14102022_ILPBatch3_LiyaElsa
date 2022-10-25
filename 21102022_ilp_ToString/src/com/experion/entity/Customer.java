package com.experion.entity;

public class Customer {
	String customerName;
	String customerCode;
	
	public Customer(String customerName, String customerCode) {
		super();
		this.customerName = customerName;
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerCode=" + customerCode + "]";
	}
	
	

}
