package com.experion.BasicProgramming;

import java.util.Scanner;

public class ArrayDemonstration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] productNames = new String[5];
		
		System.out.println("Enter the product names");
		
	    for(int i=0; i<5; i++)
	    {
	    	productNames[i]=scanner.nextLine();
	    }
		/*productNames[0]=scanner.nextLine();
		productNames[1]=scanner.nextLine();
		productNames[2]=scanner.nextLine();
		productNames[3]=scanner.nextLine();
		productNames[4]=scanner.nextLine();*/
		
		System.out.println("The product names are ");
		for(int i=0; i<5; i++)
	    {
			System.out.println(productNames[i]);
	    }
		/*System.out.println(productNames[0]);
		System.out.println(productNames[1]);
		System.out.println(productNames[2]);
		System.out.println(productNames[3]);
		System.out.println(productNames[4]);*/
		
	}

}
