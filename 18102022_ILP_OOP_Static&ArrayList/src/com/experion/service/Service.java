package com.experion.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
	
	public static Product createProduct()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product Code : ");
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name : ");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Description : ");
		String productDescription = scanner.nextLine();
		System.out.println("Enter Product Price : ");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Open Date : ");
		String openDate = scanner.nextLine();
		System.out.println("Enter Validity Date : ");
		String validityDate = scanner.nextLine();
		System.out.println("Enter Expiry Date : ");
		String expiryDate = scanner.nextLine();
		System.out.println("Active ( true or false) : ");
		boolean active = scanner.nextBoolean();
		Product product = new Product(productCode, productName,productDescription, productPrice, openDate, validityDate, expiryDate, active );
		product.setSerialNo(product.getSerialNo()+1);
		product.setSerialNoOriginal(product.getSerialNo());
		return product;
		
		 /*product.setProductCode(productCode);
		 product.setProductName(productName);
		 product.setProductDescription(productDescription);
		 product.setProductPrice(productPrice);
		 product.setOpenDate(openDate);
		 product.setValidityDate(validityDate);
		 product.setExpiryDate(expiryDate);
		 product.setActive(active);*/
		 
	}
	
	public static void displayProductDetails(ArrayList<Product> products)
	{
		System.out.println("Serial No  Product Code    	Product Name	Product Description		Product Price"
				+ "		Open Date   Validity Date    Expiry Date   Active");
		for(Product product : products) {
		if(product!=null) {
		System.out.println(product.getSerialNoOriginal() + " "+product.getProductCode()+"  "+product.getProductName()+"  "+product.getProductDescription()+"  "+product.getProductPrice()+"  "+product.getOpenDate()+"  "+product.getValidityDate()+"  "+product.getExpiryDate()+"  "+product.isActive());
	}}}
}
