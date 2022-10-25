package com.experion.service;

import java.lang.reflect.Array;
import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
	Product product[]=new Product[3];
	
	public void inputProductDetails(int index)
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
		product[index] = new Product(productCode, productName,productDescription, productPrice, openDate, validityDate, expiryDate, active );
	}
	
	public void displayProductDetails()
	{
		System.out.println("Product Code    	Product Name	Product Description		Product Price"
				+ "		Open Date   Validity Date    Expiry Date   Active");
	
		for(int i=0;i<Array.getLength(product);i++) {
			if(product[i]!=null)
				
			System.out.println(product[i].getProductCode()+"  "+product[i].getProductName()+"  "+product[i].getProductDescription()+"  "+product[i].getProductPrice()+"  "+product[i].getOpenDate()+"  "+product[i].getValidityDate()+"  "+product[i].getExpiryDate()+"  "+product[i].isActive());
	}
	/*for (String item : product)
	{
		System.out.println(item.getProductCode()+"  "+item.getProductName()+"  "+item.getProductDescription()+"  "+item.getProductPrice()+"  "+item.getOpenDate()+"  "+item.getValidityDate()+"  "+item.getExpiryDate()+"  "+item.isActive());
	}*/
}
	}
