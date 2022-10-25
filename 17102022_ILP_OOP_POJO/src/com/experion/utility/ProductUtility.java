package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.*;

public class ProductUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Service service = new Service();
		service.inputProductDetails();
		service.displayProductDetails();
		
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
