package com.experion.Assignment;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q20CheckValidityDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String productName;
		Date validityDate=new Date();
		Date expiryDate = new Date();
		Date purchaseDate=new Date();
		DateFormat dateFor = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product name");
		productName=scanner.nextLine();
		
		System.out.println("Enter Validity date (dd/mm/yyyy):");
		validityDate=dateFor.parse(scanner.nextLine());
		
		System.out.println("Enter Expiry date (dd/mm/yyyy):");
		expiryDate=dateFor.parse(scanner.nextLine());
		
		System.out.println("Enter Purchase date (dd/mm/yyyy):");
		purchaseDate=dateFor.parse(scanner.nextLine());
		
		if(purchaseDate.after(validityDate)) {
			System.out.println("You cannot buy the product");
		}
		else {
			System.out.println("The product is purchased");
		}
		

	}

}
