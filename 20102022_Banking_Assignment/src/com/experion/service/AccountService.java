package com.experion.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.BankServices;
import com.experion.entity.Customer;
import com.experion.entity.Product;

public class AccountService {

	Scanner scanner = new Scanner(System.in);
	BankServices bankService = new BankServices();
	ArrayList<BankServices> bankServicesList = new ArrayList<BankServices>();
	
	public ArrayList<Customer> createAccount(ArrayList<Customer> customers) // to create account
	{
		System.out.println("Enter Customer Id");
		String customerIdEnter = scanner.nextLine();
		String findCustomerId = checkCustomer(customerIdEnter,customers);
		if (findCustomerId == null) {
			System.out.println("Customer Id not available!! Create new Account");
			customers=createNewCustomerAccount(customers);
		}
		else {
			System.out.println("Customer available!! Creating Account using existing details");
			customers=createExistingCustomerAccount(findCustomerId,customers);
		}
		return customers;
	}

	

	public String checkCustomer(String customerIdEnter, ArrayList<Customer> customers) // To search existing customer
	{
		String findCustomerId = null;
		for (Customer customer : customers) {
			if (customer.getCustomerId().equalsIgnoreCase(customerIdEnter)) {
				findCustomerId = customer.getCustomerId();
			}
		}
		return findCustomerId;
	}

	public ArrayList<Customer> createNewCustomerAccount(ArrayList<Customer> customers) { //for creating account for new customer
		Account account = null;
		
		System.out.println("Products Available");
		System.out.println("1.Savings Max Account\n2.Current Account\n3.Loan Account");
		System.out.println("Enter your choice");
		int accountChoice = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Customer Code :");
		String customerCode = scanner.nextLine();
		System.out.println("Enter the Customer Name :");
		String customerName = scanner.nextLine();
		System.out.println("Enter the Account Code :");
		String accountCode = scanner.nextLine();
		switch (accountChoice) {
		case 1:
			String accountType = "SavingsMaxAccount";
			//bankServicesList =bankService.addBankServices(accountType);
			account = new SavingsMaxAccount( accountCode,accountType,bankServicesList,0);
			System.out.println("Savings Max Account is created for " + customerName + "...Account is Active !!");
			break;
		case 2:
			String accountType2 = "CurrentAccount";
			//bankServicesList =bankService.addBankServices(accountType2);
			account = new SavingsMaxAccount( accountCode,accountType2,bankServicesList,0);
			System.out.println("Current Account is created for " + customerName + "...Account is Active !!");
			break;
		case 3:
			String accountType3 = "LoanAccount";
			//bankServicesList =bankService.addBankServices(accountType3);
			account = new SavingsMaxAccount( accountCode,accountType3,bankServicesList,0);
			System.out.println("Loan Account is created for " + customerName + "...Account is Active !!");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		System.out.println("Available Services are :");
		for(BankServices bankService : bankServicesList)
		{
			System.out.println(bankService.getServiceName());
		}
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(account);
		Customer customer = new Customer(customerCode, customerName, products);
		customers.add(customer);
		return customers;
	}
	
	public ArrayList<Customer> createExistingCustomerAccount(String findCustomerId,ArrayList<Customer> customers) { // for creating account for existing customer
		// TODO Auto-generated method stub
		Account account = null;
		String customerName=null;
		System.out.println("Products Available");
		System.out.println("1.Savings Max Account\n2.Current Account\n3.Loan Account");
		System.out.println("Enter your choice");
		int accountChoice = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Account Code :");
		String accountCode = scanner.nextLine();
		for (Customer customer : customers) {
			if (customer.getCustomerId() == findCustomerId) {
				customerName = customer.getCustomerName();
			}
		}
		switch (accountChoice) {
		case 1:
			String accountType = "SavingsMaxAccount";
			bankServicesList =bankService.addBankServices(accountType);
			account = new Account(accountCode,accountType,bankServicesList,0);
			System.out.println("Savings Max Account is created for " + customerName + "......Account is Active !!");
			break;
		case 2:
			String accountType2 = "CurrentAccount";
			bankServicesList =bankService.addBankServices(accountType2);
			account = new Account( accountCode,accountType2,bankServicesList,0);
			System.out.println("Current Account is created for " + customerName + "....Account is Active !!");
			break;
		case 3:
			String accountType3 = "LoanAccount";
			bankServicesList =bankService.addBankServices(accountType3);
			account = new Account( accountCode,accountType3,bankServicesList,0);
			System.out.println("Loan Account is created for " + customerName + "...Account is Active !!");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		System.out.println("Available Services are :");
		for(BankServices bankService : bankServicesList)
		{
			System.out.println(bankService.getServiceName());
		}
		for (Customer customer : customers) {
			if (customer.getCustomerId() == findCustomerId) {
				ArrayList<Product> products = customer.getProduct();
				products.add(account);
			}
		}
		
		return customers;
	}
	
	public void displayAccount(ArrayList<Customer> customers,String customerCode) { //to display account details of a customer
		System.out.println("CustomerCode		CustomerName       AccountCode		 AccountType                Balance");
		for (Customer customer : customers) {
			if (customer.getCustomerId().equalsIgnoreCase(customerCode)) {
				ArrayList<Product> products=customer.getProduct();
				for(Product product : products) {
					if(product!=null) {
						Account account = (Account)product;
						System.out.println(customer.getCustomerId()+"   "+customer.getCustomerName()+"  "+product.getProductCode()+"     "+product.getProductType()+"     "+account.getAccountBalance());
						System.out.println("The Account Services are : ");
						for(BankServices bankService : product.getBankservices())
						{
							System.out.println(bankService.getServiceName());
						}
					
				}}
			}
		}
		
	}

	public ArrayList<Customer> manageAccount(ArrayList<Customer> customers) { //to manage accounts
		// TODO Auto-generated method stub
		
		System.out.println("Enter Customer Id");
		String customerCodeEnter = scanner.nextLine();
		String customerName=null;
		ArrayList<Product> products =null;
		int findCustomer = 0;
		String accountSelection = null;
		Service bankService = new Service();
		for (Customer customer : customers) {
			if (customer.getCustomerId().equalsIgnoreCase(customerCodeEnter) ){
				findCustomer = 1;
				customerName = customer.getCustomerName();
				products=customer.getProduct();
			}

		}
		if(findCustomer==0) {
			System.out.println("Invalid Customer Id");}
		else {
			System.out.println(customerName+" has got the following accounts");
			for(Product product : products) {
				if(product!=null)
					System.out.println(product.getProductType());
			}
			
			System.out.println("Enter the account for service : ");
			accountSelection = scanner.nextLine();
			switch(accountSelection)
			{
			case "SavingsMaxAccount" : customers=maxAccountService(customers,customerCodeEnter);
				break;
			case "CurrentAccount" : customers=currentAccountService(customers,customerCodeEnter);
				break;
			case "LoanAccount" : customers=loanAccountService(customers,customerCodeEnter);
				break;
			default : System.out.println("Invalid Selection");
			}
		}	
		//displayAccount(customers,customerCodeEnter);}
		return customers;
}
	public ArrayList<Customer> maxAccountService(ArrayList<Customer> customers, String customerCodeEnter) { //Services for ServiceMaxAccount
		// TODO Auto-generated method stub
		char continueChoice;
		int serviceChoice;
		ArrayList<Product> products = new ArrayList<Product>() ;
		Account account = null;
		for(Customer customer : customers)
		{
			if(customer.getCustomerId().equalsIgnoreCase(customerCodeEnter))
			{
				products=customer.getProduct();
			}
		}
		int accountCount=0;
		String accountCode = null;
		for(Product accountTemp: products)   //in case a customer posses two accounts of same type
		{
			if(accountTemp.getProductType().equalsIgnoreCase("SavingsMaxAccount"))
				accountCount++;
		}
		if(accountCount>1) {
			System.out.println("Enter Account Code");
			accountCode=scanner.nextLine();
			for(Product product: products)
			{
				if(product.getProductType().equalsIgnoreCase("SavingsMaxAccount") && accountCode.equalsIgnoreCase(product.getProductCode())) {
					account=(Account)product;;}
			}
		}
		else {
			for(Product product: products)
			{
				if(product.getProductType().equalsIgnoreCase("SavingsMaxAccount")) {
					account=(Account)product;
				}
					
			}
		}
		do {
			
			System.out.println("1.Cash Deposit\n2.ATM Withdrawal\n3.Online Banking\n4.Display Account Details");
			serviceChoice=scanner.nextInt();
			switch(serviceChoice)
			{
			case 1 : SavingsMaxAccount saveMax=null;
				account=saveMax.cashDeposit(account);
				break;
			case 2 : SavingsMaxAccount saveMax2=null;
			account=saveMax2.cashDeposit(account);
				break;
			case 3 : SavingsMaxAccount saveMax3=null;
			account=saveMax3.cashDeposit(account);
				break;
			case 4 : System.out.println("Account Code		Account Type		Account Balance");
					System.out.println(account.getProductCode()+"		"+account.getProductType()+"		"+account.getAccountBalance());
				break;
			default : System.out.println("Invalid Selection");
			}
			System.out.println("Do you want to continue in this service(y/n)");
			continueChoice=scanner.next().charAt(0);
			
		}while(continueChoice=='y');
		return customers;
	}

	public ArrayList<Customer> currentAccountService(ArrayList<Customer> customers, String customerCodeEnter) { //services for current account
		// TODO Auto-generated method stub
		char continueChoice;
		int serviceChoice;
		ArrayList<Product> products = new ArrayList<Product>() ;
		Account account = null;
		for(Customer customer : customers)
		{
			if(customer.getCustomerId().equalsIgnoreCase(customerCodeEnter))
			{
				products=customer.getProduct();
			}
		}

		int accountCount=0;  
		String accountCode = null;
		for(Product accountTemp: products) //in case a customer posses two accounts of same type
		{
			if(accountTemp.getProductType().equalsIgnoreCase("CurrentAccount"))
				accountCount++;
		}
		if(accountCount>1) {
			System.out.println("Enter Account Code");
			accountCode=scanner.nextLine();
			for(Product accountTemp: products)
			{
				if(accountTemp.getProductType().equalsIgnoreCase("CurrentAccount") && accountCode.equalsIgnoreCase(accountTemp.getProductCode()))
					account=(Account)accountTemp;
			}
		}
		else {
			for(Product accountTemp: products)
			{
				if(accountTemp.getProductType().equalsIgnoreCase("CurrentAccount"))
					account=(Account)accountTemp;
			}
		}
		do {
			
			System.out.println("1.Cash Deposit\n2.ATM Withdrawal\n3.Mobile Banking\n4.Online Banking\n5.Display Account Details");
			serviceChoice=scanner.nextInt();
			switch(serviceChoice)
			{
			case 1 : CurrentAccount current = new CurrentAccount();
					account=current.cashDeposit(account);
				break;
			case 2 : CurrentAccount current2 = new CurrentAccount();
					account=current2.atmWithdrawal(account);
				break;
			case 3 : CurrentAccount current3 = new CurrentAccount();
					account=current3.mobileBanking(account);
					break;
			case 4 : CurrentAccount current4 = new CurrentAccount();
					account=current4.onlineBanking(account);
					break;
			case 5 : System.out.println("Account Code		Account Type		Account Balance");
					System.out.println(account.getProductCode()+"		"+account.getProductType()+"		"+account.getAccountBalance());
					break;
			default : System.out.println("Invalid Selection");
			}
			System.out.println("Do you want to continue in this service (y/n)");
			continueChoice=scanner.next().charAt(0);
			
		}while(continueChoice=='y');
		return customers;
		
	}

	public ArrayList<Customer> loanAccountService(ArrayList<Customer> customers, String customerCodeEnter) { //services for Loan Account
		// TODO Auto-generated method stub
		char continueChoice;
		int serviceChoice;
		ArrayList<Product> products = new ArrayList<Product>() ;
		Account account = null;
		for(Customer customer : customers)
		{
			if(customer.getCustomerId().equalsIgnoreCase(customerCodeEnter))
			{
				products=customer.getProduct();
			}
		}

		int accountCount=0;  
		String accountCode = null;
		for(Product accountTemp: products) //in case a customer posses two accounts of same type
		{
			if(accountTemp.getProductType().equalsIgnoreCase("LoanAccount"))
				accountCount++;
		}
		if(accountCount>1) {
			System.out.println("Enter Account Code");
			accountCode=scanner.nextLine();
			for(Product accountTemp: products)
			{
				if(accountTemp.getProductType().equalsIgnoreCase("LoanAccount") && accountCode.equalsIgnoreCase(account.getProductCode()))
					account=(Account)accountTemp;
			}
		}
		else {
			for(Product accountTemp: products)
			{
				if(accountTemp.getProductType().equalsIgnoreCase("LoanAccount"))
					account=(Account)accountTemp;
			}
		}
		
		do {
			System.out.println("Select an one of the services");
			System.out.println("1.Cash Deposit\n2.Cheque Deposit\n3.Display Account Deails");
			serviceChoice=scanner.nextInt();
			switch(serviceChoice)
			{
			case 1 : LoanAccount loan = new LoanAccount();
					account=loan.cashDeposit(account);
				break;
			case 2 : LoanAccount loan2 = new LoanAccount();
					account=loan2.chequeDeposit(account);
				break;
			case 3 : System.out.println("Account Code		Account Type		Account Balance");
					System.out.println(account.getProductCode()+"		"+account.getProductType()+"		"+account.getAccountBalance());
				break;
			default : System.out.println("Invalid Selection");
			}
			System.out.println("Do you want to continue in this service (y/n)");
			continueChoice=scanner.next().charAt(0);
			
		}while(continueChoice=='y');
		return customers;
		
	}}