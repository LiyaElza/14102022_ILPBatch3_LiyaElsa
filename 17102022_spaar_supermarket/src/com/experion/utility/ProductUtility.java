package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.*;

public class ProductUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Service service = new Service();
		Scanner scanner = new Scanner(System.in);
		int choice;
		char ch;
		int index =0;

		

		
			do {
				System.out.println("****Welcome to Supermarket****");
				System.out.println("Services Available : 1. Add Stock 2. Display Stock (Select service option)");
				choice = scanner.nextInt();
				if (choice == 1) {
					service.inputProductDetails(index);
					index++;}
				else if (choice == 2) {
					service.displayProductDetails();}
				else {
					System.out.println("Invalid Option");
				}
				System.out.println("Do you want to continue? (Y/N)");
				ch = scanner.next().charAt(0);
			}
				 while (ch == 'Y');
			

		

	}

}
