package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Customer;
import com.experion.service.AccountService;

public class BankUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char mainChoice;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Customer> customers = new ArrayList<Customer>();
		Customer customer;

		
		do {
			System.out.println("****Welcome to Bank*****");
			System.out.println("1.Create Account\n2.Manage Accounts\n3.Exit");
			System.out.println("Enter your choice");
			AccountService accountService = new AccountService();
			int serviceChoice=scanner.nextInt();
			switch(serviceChoice) {
			case 1 : customers=accountService.createAccount(customers);
				break;
			case 2 :accountService.manageAccount(customers);
				break;
			case 3 : System.exit(0);
			default : System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to continue? (y/n)");
			mainChoice=scanner.next().charAt(0);
		}while(mainChoice =='y');
		
	}

}
