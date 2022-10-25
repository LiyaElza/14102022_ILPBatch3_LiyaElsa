package com.experion.utility;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
	
		
		char mainChoice;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Product> productList=new ArrayList<Product>();
		//Product productList[]=new Product[3];
		
		do {
			System.out.println("1.Create Product 2.Display Product 3.Buy Product");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1 : productList.add(Service.createProduct());
				break;
			case 2 : Service.displayProductDetails(productList);
				break;
			case 3 : Service.buyProduct(productList);
			}
			
			System.out.println("Do you want to continue (Y/N)");
			mainChoice=scanner.next().charAt(0);
		}while(mainChoice=='Y');
		
		
		
		
	/*	System.out.println("Enter the product code");
		String productCode = scanner.nextLine();
		product.setProductCode(productCode);
		
		System.out.println("The product code is : "+ product.getProductCode());
		
		System.out.println("Enter the product name");
		String productName = scanner.nextLine();
		product.setProductName(productName);
		
		System.out.println("The product name is : "+ product.getProductName());

		System.out.println("Enter the product description");
		String productDescription = scanner.nextLine();
		product.setProductDescription(productDescription);
		
		System.out.println("The product description is : "+ product.getProductDescription());
		
		System.out.println("Enter the product price");
		double productPrice = scanner.nextDouble();
		product.setProductPrice(productPrice);
		
		System.out.println("The product price is : "+ product.getProductPrice());

		System.out.println("Enter if the product is active or not (true/false)");
		boolean active = scanner.nextBoolean();
		product.setActive(active);
		
		System.out.println("The product is : "+ product.isActive());
*/
	}

}
