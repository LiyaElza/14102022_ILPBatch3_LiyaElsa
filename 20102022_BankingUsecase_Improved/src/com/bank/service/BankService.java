package com.bank.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.Account;
import com.bank.entity.Customer;
import com.bank.entity.Product;
import com.bank.entity.Service;

public class BankService {

	public static Scanner scanner = new Scanner(System.in);

//Creating Services List
	public static ArrayList<Service> createServices() {

		ArrayList<Service> allServiceList = new ArrayList<Service>();
		allServiceList.add(new Service("Mobile Banking"));
		allServiceList.add(new Service("ATM Withdrawal"));
		allServiceList.add(new Service("Cash Deposit"));
		allServiceList.add(new Service("Cheque Deposit"));
		allServiceList.add(new Service("Online Banking"));

		return allServiceList;

	}

	// Adding Services to the account
	public static ArrayList<Service> addBankService(String accountType, ArrayList<Service> allServicesList) {

		ArrayList<Service> bankServicesList = new ArrayList<Service>();
		if (accountType.equalsIgnoreCase("SavingsMaxAccount")) {
			for (Service service : allServicesList) {
				if (service.getServiceName().equalsIgnoreCase("Cash Deposit")
						|| service.getServiceName().equalsIgnoreCase("ATM Withdrawal")
						|| service.getServiceName().equalsIgnoreCase("Online Banking"))
					bankServicesList.add(service);
			}
		}
		if (accountType.equalsIgnoreCase("LoanAccount")) {
			for (Service service : allServicesList) {
				if (service.getServiceName().equalsIgnoreCase("Cash Deposit")
						|| service.getServiceName().equalsIgnoreCase("Cheque Deposit"))
					bankServicesList.add(service);
			}
		}
		if (accountType.equalsIgnoreCase("CurrentAccount")) {
			for (Service service : allServicesList) {
				if (service.getServiceName().equalsIgnoreCase("Cash Deposit")
						|| service.getServiceName().equalsIgnoreCase("ATM Withdrawal")
						|| service.getServiceName().equalsIgnoreCase("Online Banking")
						|| service.getServiceName().equalsIgnoreCase("Mobile Banking"))
					bankServicesList.add(service);
			}
		}
		return bankServicesList;
	}

	// Creating a new account
	public static ArrayList<Customer> createAccount(ArrayList<Customer> customers, ArrayList<Service> allServicesList) {
		System.out.println("Enter Customer Id");
		String customerIdEnter = scanner.nextLine();
		String findCustomerId = checkCustomer(customerIdEnter, customers);
		String customerName = null;
		String customerCode = null;
		if (findCustomerId == null) {
			System.out.println(
					"Customer is not registered!! Please enter the following details to complete registration");
			System.out.println("Enter the Customer Code :");
			customerCode = scanner.nextLine();
			System.out.println("Enter the Customer Name :");
			customerName = scanner.nextLine();
		} else {
			System.out.println("Customer available!! Creating Account using existing details");
		}

		System.out.println("\nPlease select one of the following accounts to complete account creation");
		System.out.println("\n1.Savings Max Account\n2.Current Account\n3.Loan Account");
		System.out.println("\nEnter your choice");
		int accountChoice = scanner.nextInt();
		scanner.nextLine();
		System.out.println("\nEnter the Account Code :");
		String accountCode = scanner.nextLine();

		Account account = null;
		switch (accountChoice) {
		case 1:
			String accountType = "SavingsMaxAccount";
			account = new Account(accountCode, accountType, addBankService(accountType, allServicesList), 0);
			break;
		case 2:
			String accountType2 = "CurrentAccount";
			account = new Account(accountCode, accountType2, addBankService(accountType2, allServicesList), 0);
			break;
		case 3:
			String accountType3 = "LoanAccount";
			account = new Account(accountCode, accountType3, addBankService(accountType3, allServicesList), 0);
			break;
		default:
			System.out.println("Invalid Choice");
		}

		System.out.println("\nAvailable Services are :");
		for (Service bankService : account.getServiceList()) {
			System.out.println(bankService.getServiceName());
		}

		if (findCustomerId == null) {
			ArrayList<Product> products = new ArrayList<Product>();
			products.add(account);
			System.out
					.println(account.getProductName() + " is created for " + customerName + "...Account is Active !!");
			Customer customer = new Customer(customerCode, customerName, products);
			customers.add(customer);

		} else {
			for (Customer customer : customers) {
				if (customer.getCustomerCode() == findCustomerId) {

					ArrayList<Product> products = customer.getProductList();
					products.add(account);
					System.out.println(account.getProductName() + " is created for " + customer.getCustomerName()
							+ "...Account is Active !!");
				}
			}
		}

		return customers;
	}

	// Checking for existing customer
	public static String checkCustomer(String customerIdEnter, ArrayList<Customer> customers) {
		String findCustomerId = null;
		for (Customer customer : customers) {
			if (customer.getCustomerCode().equalsIgnoreCase(customerIdEnter)) {
				findCustomerId = customer.getCustomerCode();
			}
		}
		return findCustomerId;
	}

	// Displaying account details of a customer using customer code
	public static void displayAccount(ArrayList<Customer> customers, String customerCode) {
		System.out
				.println("CustomerCode		CustomerName       AccountCode		 AccountType                Balance");
		for (Customer customer : customers) {
			if (customer.getCustomerCode().equalsIgnoreCase(customerCode)) {
				ArrayList<Product> products = customer.getProductList();
				for (Product product : products) {
					if (product != null) {
						Account account = (Account) product;
						System.out.println(customer.getCustomerCode() + "   " + customer.getCustomerName() + "  "
								+ product.getProductCode() + "     " + product.getProductName() + "     "
								+ account.getAccountBalance());
						System.out.println("The Account Services are : ");
						for (Service bankService : product.getServiceList()) {
							System.out.println(bankService.getServiceName());
						}

					}
				}
			}
		}
	}

	// Function to provide account services
	public static ArrayList<Customer> manageAccount(ArrayList<Customer> customers) { // to manage accounts
		// TODO Auto-generated method stub

		System.out.println("Enter Customer Id");
		String customerCodeEnter = scanner.nextLine();
		int findCustomer = 0;
		Customer customerSelect = null;
		for (Customer customer : customers) {
			if (customer.getCustomerCode().equalsIgnoreCase(customerCodeEnter)) {
				findCustomer = 1;
				customerSelect = customer;
				break;
			}

		}
		if (findCustomer == 0) {
			System.out.println("Invalid Customer Id");
		} else {
			System.out.println(customerSelect.getCustomerName() + " has got the following accounts");
			for (Product product : customerSelect.getProductList()) {
				if (product != null)
					System.out.println(product.getProductName());
			}

			System.out.println("Enter the account for service : ");
			String accountSelection = scanner.nextLine();
			switch (accountSelection) {
			case "SavingsMaxAccount":
				customers = maxAccountService(customers, customerCodeEnter);
				break;
			case "CurrentAccount":
				customers = currentAccountService(customers, customerCodeEnter);
				break;
			case "LoanAccount":
				customers = loanAccountService(customers, customerCodeEnter);
				break;
			default:
				System.out.println("Invalid Selection");
			}
		}
		return customers;
	}

	// Function for SavingsMaxAccount services
	public static ArrayList<Customer> maxAccountService(ArrayList<Customer> customers, String customerCodeEnter) {
		// TODO Auto-generated method stub
		char continueChoice;
		int serviceChoice;
		Account account = searchAccount(customers, customerCodeEnter, "SavingsMaxAccount");
		do {
			System.out.println("Select the service of your choice");
			System.out.println("1.Cash Deposit\n2.ATM Withdrawal\n3.Online Banking\n4.Display Account Details");
			serviceChoice = scanner.nextInt();
			switch (serviceChoice) {
			case 1:
				account = cashDeposit(account);
				break;
			case 2:
				account = atmWithdrawal(account);
				break;
			case 3:
				account = onlineBanking(account);
				break;
			case 4:
				System.out.println("Account Code		Account Type		Account Balance");
				System.out.println(account.getProductCode() + "		" + account.getProductName() + "		"
						+ account.getAccountBalance());
				break;
			default:
				System.out.println("Invalid Selection");
			}
			System.out.println("Do you want to continue in this account management service(y/n)");
			continueChoice = scanner.next().charAt(0);

		} while (continueChoice == 'y');
		return customers;
	}

	// Function for CurrentAccount services
	public static ArrayList<Customer> currentAccountService(ArrayList<Customer> customers, String customerCodeEnter) {

		char continueChoice;
		int serviceChoice;
		Account account = searchAccount(customers, customerCodeEnter, "CurrentAccount");
		do {
			System.out.println("Select the service of your choice");
			System.out.println(
					"1.Cash Deposit\n2.ATM Withdrawal\n3.Mobile Banking\n4.Online Banking\n5.Display Account Details");
			serviceChoice = scanner.nextInt();
			switch (serviceChoice) {
			case 1:
				account = cashDeposit(account);
				break;
			case 2:
				account = atmWithdrawal(account);
				break;
			case 3:
				account = mobileBanking(account);
				break;
			case 4:
				account = onlineBanking(account);
				break;
			case 5:
				System.out.println("Account Code		Account Type		Account Balance");
				System.out.println(account.getProductCode() + "		" + account.getProductName() + "		"
						+ account.getAccountBalance());
				break;
			default:
				System.out.println("Invalid Selection");
			}
			System.out.println("Do you want to continue in this account management service(y/n)");
			continueChoice = scanner.next().charAt(0);

		} while (continueChoice == 'y');
		return customers;

	}

	// Function for LoanAccount services
	public static ArrayList<Customer> loanAccountService(ArrayList<Customer> customers, String customerCodeEnter) {
		char continueChoice;
		int serviceChoice;
		Account account = searchAccount(customers, customerCodeEnter, "LoanAccount");

		do {
			System.out.println("Select the service of your choice");
			System.out.println("1.Cash Deposit\n2.Cheque Deposit\n3.Display Account Deails");
			serviceChoice = scanner.nextInt();
			switch (serviceChoice) {
			case 1:
				account = cashDeposit(account);
				break;
			case 2:
				account = chequeDeposit(account);
				break;
			case 3:
				System.out.println("Account Code		Account Type		Account Balance");
				System.out.println(account.getProductCode() + "		" + account.getProductName() + "		"
						+ account.getAccountBalance());
				break;
			default:
				System.out.println("Invalid Selection");
			}
			System.out.println("Do you want to continue in this account management service(y/n)");
			continueChoice = scanner.next().charAt(0);

		} while (continueChoice == 'y');
		return customers;

	}

	// Function searching for accounts and multiple accounts of the same type of a
	// single customer
	public static Account searchAccount(ArrayList<Customer> customers, String customerCodeEnter, String accountType) {
		ArrayList<Product> products = new ArrayList<Product>();
		Account account = null;
		for (Customer customer : customers) {
			if (customer.getCustomerCode().equalsIgnoreCase(customerCodeEnter)) {
				products = customer.getProductList();
			}
		}
		int accountCount = 0;
		String accountCode = null;
		for (Product accountTemp : products) {
			if (accountTemp.getProductName().equalsIgnoreCase("SavingsMaxAccount"))
				accountCount++;
		}
		if (accountCount > 1) {
			System.out.println("Enter Account Code");
			accountCode = scanner.nextLine();
			for (Product product : products) {
				if (product.getProductName().equalsIgnoreCase("SavingsMaxAccount")
						&& accountCode.equalsIgnoreCase(product.getProductCode())) {
					account = (Account) product;
				}
			}
		} else {
			for (Product product : products) {
				if (product.getProductName().equalsIgnoreCase("SavingsMaxAccount")) {
					account = (Account) product;
				}

			}
		}
		return account;
	}

	// Function for Cash Deposit
	public static Account cashDeposit(Account account) {

		System.out.println("Enter the amount to be deposited");
		double cashDeposit = scanner.nextDouble();
		if (cashDeposit < 100000.00) {
			account.setAccountBalance(account.getAccountBalance() + cashDeposit);
			System.out.println("Rs." + cashDeposit + " is deposited in the account");
		} else {
			System.out.println("Sorry..Cannot deposit more than 1 lakh as cash..Try cheque");
		}

		return account;

	}

	// Function for ATM Withdrawal
	public static Account atmWithdrawal(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to be withdrawed");
		double cashWithdrawal = scanner.nextDouble();
		if (account.getAccountBalance() > cashWithdrawal) {
			if (cashWithdrawal < 25000) {
				account.setAccountBalance(account.getAccountBalance() - cashWithdrawal);
				System.out.println("Cash withdrawal is successfull");
			} else
				System.out.println("The amount exceeds limit...You can withdraw only upto 100000");
		} else
			System.out.println("No Account Balance");
		return account;
	}

	// Function for Online Banking
	public static Account onlineBanking(Account account) {
		// TODO Auto-generated method stub
		char continueChoice;
		do {
			System.out
					.println("\nWelcome to Online Application.........\nAvailable Sevices in this online application");
			System.out.println("1.Cash Deposit\n2.Cash Withdrawal\n3.Display Account Balance");
			int serviceSelection = scanner.nextInt();
			switch (serviceSelection) {
			case 1:
				account = cashDeposit(account);
				break;
			case 2:
				account = atmWithdrawal(account);
				break;
			case 3:
				System.out.println("Account Code		Account Type		Account Balance");
				System.out.println(account.getProductCode() + "		" + account.getProductName() + "		"
						+ account.getAccountBalance());
				break;
			}
			System.out.println("Do you want to continue in this online application (y/n)");
			continueChoice = scanner.next().charAt(0);
		} while (continueChoice == 'y');
		return account;
	}

	// Function for Mobile Banking
	public static Account mobileBanking(Account account) { // mobile banking for current accounts
		char continueChoice;
		do {
			System.out
					.println("\nWelcome to Mobile Application.........\nAvailable Sevices in this mobile application");
			System.out.println("1.Cash Deposit\n2.Cash Withdrawal\n3.Display Account Balance");
			int serviceSelection = scanner.nextInt();
			switch (serviceSelection) {
			case 1:
				account = cashDeposit(account);
				break;
			case 2:
				account = atmWithdrawal(account);
				break;
			case 3:
				System.out.println("Account Code		Account Type		Account Balance");
				System.out.println(account.getProductCode() + "		" + account.getProductName() + "		"
						+ account.getAccountBalance());
				break;
			}
			System.out.println("Do you want to continue in this mobile application (y/n)");
			continueChoice = scanner.next().charAt(0);
		} while (continueChoice == 'y');
		return account;

	}

	// Function for Cheque Deposit
	public static Account chequeDeposit(Account account) {
		System.out.println("Enter the amount on the cheque");
		double chequeDeposit = scanner.nextDouble();
		account.setAccountBalance(account.getAccountBalance() + chequeDeposit);
		System.out.println("Rs." + chequeDeposit + " is deposited in the account");
		return account;

	}

}