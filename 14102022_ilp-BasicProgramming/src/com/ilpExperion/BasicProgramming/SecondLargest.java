package com.ilpExperion.BasicProgramming;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number");
		firstNumber = scanner.nextInt();
		System.out.println("Enter second number");
		secondNumber = scanner.nextInt();
		System.out.println("Enter third number");
		thirdNumber = scanner.nextInt();
		
		if((firstNumber>secondNumber) && (firstNumber<thirdNumber))
		{
			System.out.println(firstNumber+" is second largest");
		}
		else if((firstNumber<secondNumber) && (firstNumber>thirdNumber))
		{
			System.out.println(firstNumber+" is second largest");
		}
		else if((secondNumber>firstNumber) && (secondNumber<thirdNumber))
		{
			System.out.println(secondNumber+" is second largest");
		}
		else if((secondNumber<firstNumber) && (secondNumber>thirdNumber))
		{
			System.out.println(secondNumber+" is second largest");
		}
		else
		{
			System.out.println(thirdNumber+" is second largest");
		}
		

	}

}
