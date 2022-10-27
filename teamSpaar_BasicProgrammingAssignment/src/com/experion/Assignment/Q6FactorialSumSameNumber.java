package com.experion.Assignment;

import java.util.Scanner;

public class Q6FactorialSumSameNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of terms");
		double numberOfTerms = scanner.nextDouble();
		double termSum = 0;
		for (double index = 1; index <= numberOfTerms; index++) {
			termSum = termSum + (index /Q6FactorialSumSameNumber.factorial(index));
		}
		System.out.println("The sum is : " + termSum);

	}
	
	public static double factorial(double limit)
	{
		
		double factorial=1;
		
		for(double index=1;index<=limit;index++)
		{
			factorial=factorial*index;
			
		}
		return factorial;
	}

}
