package com.experion.utility;



import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args){
		// TODO Auto-generated method stub
	
		
		char mainChoice;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Product> productList=new ArrayList<Product>();
		//ArrayList<Account> accountList=new ArrayList<Account>();
		//Product productList[]=new Product[3];
		
		do {
			System.out.println("1.Add Card Product 2.Add Account Product 3.Display Product");
			int choice=scanner.nextInt();
			/*System.out.println("Enter the product type :");
			String productType = scanner.nextLine();*/
			switch(choice) {
			case 1 : productList.add(Service.createProduct("Cards"));
				break;
			case 2 : productList.add(Service.createProduct("Accounts"));
				break;
			case 3 : Service.displayProduct(productList);
			}
			
			System.out.println("Do you want to continue (y/n)");
			mainChoice=scanner.next().charAt(0);
		}while(mainChoice=='y');

	}

}
