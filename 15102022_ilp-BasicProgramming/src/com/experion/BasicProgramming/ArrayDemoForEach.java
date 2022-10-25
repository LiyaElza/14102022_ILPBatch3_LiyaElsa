package com.experion.BasicProgramming;

import java.util.Scanner;

public class ArrayDemoForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String[] productNames = new String[5];
		
		System.out.println("Enter the product names");
		
	    for(int index=0; index<5; index++)
	    {
	    	productNames[index]=scanner.nextLine();
	    }
	    
	    System.out.println("The product names are ");
		for(String productName : productNames)
	    {
			System.out.println(productName + "		"+productName.length());
	    }


	}

}
