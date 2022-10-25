package com.experion.BasicProgramming;

import java.util.Scanner;

public class LoopDemonstration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String[] productNames = new String[5];
		
		System.out.println("Enter the product names");
		
	    for(int i=0; i<5; i++)
	    {
	    	productNames[i]=scanner.nextLine();
	    }
	    
	    System.out.println("The product names are ");
		for(int i=0; i<productNames.length; i++)
	    {
			System.out.println(productNames[i]);
	    }

	}

}
