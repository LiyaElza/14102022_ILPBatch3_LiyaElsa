package com.experion.utility;




import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Product;

public class ProductUtility {

	public static void main(String[] args){
		// TODO Auto-generated method stub
	
		/*Account account = new Account("Women's Savings Account","fug",10000);
		AccountService accountService = new AccountService();
		accountService.depositCash(account, 20000);
		accountService.depositCash(account, "wseferg", 10000);
		accountService.depositCash(account, 200000, "ldxajcld");*/
		
		Product product=null;
		Scanner scanner =new Scanner(System.in);
		System.out.println("1.Account 2.Card 3.Loan");
		int choice =scanner.nextInt();
		if(choice==1)
		{
			product = new Account("Women's Savings Account","ACC1243",10000);
		}
		else if(choice==2)
		{
			product = new Card("Master Card","CARD1243",100000);
		}
		else if(choice==3)
		{
			product = new Card("Home Loan","LOAN1243",1000000);
		}
		product.checkProductValidity();
		
		

	}

}
