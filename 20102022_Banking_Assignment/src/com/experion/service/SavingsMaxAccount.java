package com.experion.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Service;

public class SavingsMaxAccount extends Account implements SavingsAccountCurrentAccountService,SavingsMaxCurrentLoanService{


	
	
	public SavingsMaxAccount(String productCode, String productType, ArrayList<Service> bankservices,
			double accountBalance) {
		super(productCode, productType, bankservices, accountBalance);
	}

	Scanner scanner = new Scanner(System.in);
	
	
	@Override
	public Account cashDeposit(Account account) { //To deposit cash in SavingsMaxAccount
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to be deposited");
		double cashDeposit=scanner.nextDouble();
		if(cashDeposit<100000.00) {
			account.setAccountBalance(account.getAccountBalance()+cashDeposit);
			System.out.println("Rs."+cashDeposit+" is deposited in the account");
		}
		else
		{
			System.out.println("Sorry..Cannot deposit more than 1 lakh as cash..Try cheque");
		}
		
		return account;

	}

	@Override
	public Account atmWithdrawal(Account account) { //For withdrawal from SavingsMaxaccount
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to be withdrawed");
		double cashWithdrawal=scanner.nextDouble();
		if(account.getAccountBalance()>0) {
			if(cashWithdrawal<25000) {
				account.setAccountBalance(account.getAccountBalance()-cashWithdrawal);
				System.out.println("Cash withdrawal is successfull");}
			else
				System.out.println("The amount exceeds limit...You can withdraw only upto 100000");}
		else
			System.out.println("No Account Balance");
		return account;
	}

	@Override
	public Account onlineBanking(Account account) { //Online Banking Portal for SavingsmaxAccount
		// TODO Auto-generated method stub
		char continueChoice;
		do {
		System.out.println("Available Sevices in this online application");
		System.out.println("1.Cash Deposit\n2.Cash Withdrawal\n3.Display Account Balance");
		int serviceSelection = scanner.nextInt();
		switch(serviceSelection) {
		case 1 : account = cashDeposit(account);
		break;
		case 2 : account = atmWithdrawal(account);
		break;
		case 3 : System.out.println("Account Code		Account Type		Account Balance");
		System.out.println(account.getProductCode()+"		"+account.getProductType()+"		"+account.getAccountBalance());
		break;
		}
		System.out.println("Do you want to continue in this online application (y/n)");
		continueChoice=scanner.next().charAt(0);
		}
		while(continueChoice=='y');
		return account;
	}

}
