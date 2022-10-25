package com.experion.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Service;

public class LoanAccount extends Account implements LoanAccountService,SavingsMaxCurrentLoanService{

	
	

	public LoanAccount(String productCode, String productType, ArrayList<Service> bankservices,
			double accountBalance) {
		super(productCode, productType, bankservices, accountBalance);
	}

	Scanner scanner = new Scanner(System.in);

	public LoanAccount()
	{
		
	}

	@Override
	public Account chequeDeposit(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount on the cheque");
		double chequeDeposit=scanner.nextDouble();
		account.setAccountBalance(account.getAccountBalance()+chequeDeposit);
		System.out.println("Rs."+chequeDeposit+" is deposited in the account");
		return account;
		
	}

	@Override
	public Account cashDeposit(Account account) {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to be deposited");
		double cashDeposit=scanner.nextDouble();
		if(cashDeposit<100000) {
			account.setAccountBalance(account.getAccountBalance()+cashDeposit);
			System.out.println("Rs."+cashDeposit+" is deposited in the account");
		}
		else
		{
			System.out.println("Sorry..Cannot deposit more than 1 lakh as cash..Try cheque");
		}
		
		return account;
	}

}
