package com.experion.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
	static Date openDate;
	static Date validityDate;
	static Date expiryDate;
	
	
	public static Product createProduct() throws ParseException
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
		String date = scanner.nextLine();
		DateFormat dateFor = new SimpleDateFormat("dd/MM/yyyy");
		Date openDate=dateFor.parse(date);
		System.out.println("Enter Validity Date : ");
		String date1 = scanner.nextLine();
		Date validityDate=dateFor.parse(date1);
		System.out.println("Enter Expiry Date : ");
		String date2 = scanner.nextLine();
		Date expiryDate=dateFor.parse(date2);
		Product product = new Product(productCode, productName,productDescription, productPrice, openDate, validityDate, expiryDate);
		product.setSerialNo(product.getSerialNo()+1);
		product.setSerialNoOriginal(product.getSerialNo());
		return product;
		 
	}
	
	public static void displayProductDetails(ArrayList<Product> products)
	{
		System.out.println("Sl.no  Product Code    	Product Name	Product Description		Product Price"
				+ "		Open Date   Validity Date    Expiry Date");
		DateFormat dateFor = new SimpleDateFormat("dd/MM/yyyy");
		for(Product product : products) {
		if(product!=null) {
		System.out.println(product.getSerialNoOriginal()+"  "+product.getProductCode()+"    "+product.getProductName()+"    "+product.getProductDescription()+"    "+product.getProductPrice()+"    "+dateFor.format(product.getOpenDate())+"    "+dateFor.format(product.getValidityDate())+"    "+dateFor.format(product.getExpiryDate()));
	}}}
	

	public static void buyProduct(ArrayList<Product> productList) throws ParseException
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the product number :");
		int productChoice = scanner.nextInt();
		DateFormat dateFor = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Sl.No  Product Code    	Product Name	Product Description		Product Price"
				+ "		Open Date   Validity Date    Expiry Date");
		System.out.println();
		for(Product product : productList) {
			int productNo = product.getSerialNoOriginal();
			if(productNo == productChoice) {
				
				System.out.println(product.getSerialNoOriginal()+" "+product.getProductCode()+"  "+product.getProductName()+"  "+product.getProductDescription()+"  "+product.getProductPrice()+"  "+product.getOpenDate()+"  "+product.getValidityDate()+"  "+product.getExpiryDate());
				Date openDate = dateFor.parse(dateFor.format(product.getOpenDate()));
				Date validityDate=dateFor.parse(dateFor.format(product.getValidityDate()));
				Date expiryDate=dateFor.parse(dateFor.format(product.getExpiryDate()));
				Date localDate = dateFor.parse(dateFor.format(new Date()));
				
				if(expiryDate.before(localDate))
				{
					System.out.println("The product is expired.....Sorry!!!");
				}
				else if(openDate.before(localDate)){
					if(validityDate.after(localDate)){
						System.out.println("The product is Active, you can buy.....");
					}
					else if(validityDate.equals(localDate))
					{
						System.out.println("The product is Active, you can buy.....");
					}
					else {
						System.out.println("The product is Inactive");
					}
				}
				else {
					System.out.println("The product is not in sale...Will be back soon...");
				}
			}}
	}
	}
