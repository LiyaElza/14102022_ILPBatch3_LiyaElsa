package com.experion.entity;

import java.util.ArrayList;

public abstract class Product {
	private String productCode;
	private String productType;
	private ArrayList<Service> bankservices;
	
	public Product(String productCode, String productType, ArrayList<Service> bankservices) {
		super();
		this.productCode = productCode;
		this.productType = productType;
		this.bankservices = bankservices;
	}
	public Product()
	{
		
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	public ArrayList<Service> getBankservices() {
		return bankservices;
	}
	public void setBankservices(ArrayList<Service> bankservices) {
		this.bankservices = bankservices;
	}

	
	
	
	
}
