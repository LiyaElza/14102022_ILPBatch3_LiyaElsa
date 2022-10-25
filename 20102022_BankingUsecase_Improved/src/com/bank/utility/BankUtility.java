package com.bank.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Customer;
import com.bank.entity.Service;
import com.bank.service.BankService;

public class BankUtility {

	public static void main(String[] args) {
		
		char mainChoice;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Customer> customers = new ArrayList<Customer>();
		ArrayList<Service> allServicesList = new ArrayList<Service>();
		allServicesList=BankService.createServices();

		
		do {
			
			
			System.out.println("****Welcome to Bank*****");
			System.out.println("1.Create Account\n2.Manage Accounts\n3.Display Accounts\n4.Exit");
			System.out.println("Enter your choice");
			int serviceChoice=scanner.nextInt();
			switch(serviceChoice) {
			case 1 : customers=BankService.createAccount(customers,allServicesList);
				break;
			case 2 : customers=BankService.manageAccount(customers);
				break;
			case 3: System.out.println("Enter customer code");
				scanner.nextLine();
				String customerCode = scanner.nextLine();
				BankService.displayAccount(customers, customerCode);
				break;
			case 4: System.exit(0);
			default : System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to continue in the program? (y/n)");
			mainChoice=scanner.next().charAt(0);
		}while(mainChoice =='y');
		System.out.println("You have successfully quitted from the application");

	}}
