package com.ilpExperion.BasicProgramming;

import java.util.Scanner;

public class SwappingWithTemporary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1;
		int number2;
		int temporary;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number");
		number1=scanner.nextInt();
		System.out.println("Enter second number");
		number2=scanner.nextInt();
		System.out.println("First number : "+number1);
		System.out.println("Second number : "+number2);
		
		temporary=number1;
		number1=number2;
		number2=temporary;
		
		System.out.println("First number : "+number1);
		System.out.println("Second number : "+number2);

	}

}
