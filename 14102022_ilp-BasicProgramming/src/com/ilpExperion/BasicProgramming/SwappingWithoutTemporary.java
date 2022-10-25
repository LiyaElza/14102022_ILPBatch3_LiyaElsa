package com.ilpExperion.BasicProgramming;

import java.util.Scanner;

public class SwappingWithoutTemporary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNumber;
		int secondNumber;
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number");
		firstNumber=scanner.nextInt();
		System.out.println("Enter second number");
		secondNumber=scanner.nextInt();
		System.out.println("First number : "+firstNumber);
		System.out.println("Second number : "+secondNumber);
		
		firstNumber=firstNumber+secondNumber;
		secondNumber=firstNumber-secondNumber;
		firstNumber=firstNumber-secondNumber;
		
		System.out.println("First number : "+firstNumber);
		System.out.println("Second number : "+secondNumber);

	}

}
