package com.experion.service;

import java.util.ArrayList;

import com.experion.entity.Service;

public class BankServiceCreation {
	
	ArrayList<Service> allServiceList = new ArrayList();
	public static ArrayList<Service> createServices()
	{
		ArrayList<Service> allServiceList = new ArrayList();
		allServiceList.add(new Service("SOB100","Online Banking"));
		allServiceList.add(new Service("SMB200","Mobile Banking"));
		allServiceList.add(new Service("SCD300","Cash Deposit"));
		allServiceList.add(new Service("SCW400","Cash Withdrawal"));
		allServiceList.add(new Service("SCHQD500","Cheque Deposit"));
		return allServiceList;
	}
	public ArrayList<Service> addBankServices(String accountType,ArrayList<Service> allServiceList) {
	ArrayList<Service> bankServices = new ArrayList<Service>();
	if (accountType == "SavingsMaxAccount") {
		for(Service service : allServiceList)
		{
			if(service.)
			bankServices.add
		}
	} else if (accountType == "CurrentAccount") {
	} else if (accountType == "LoanAccount") {
	}
	return bankServices;
}

}
