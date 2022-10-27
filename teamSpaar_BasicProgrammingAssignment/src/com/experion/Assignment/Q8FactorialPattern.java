package com.experion.Assignment;

import java.util.Scanner;

public class Q8FactorialPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of terms");
		double numberOfTerms=scanner.nextDouble ();
		double termSum=0;
		for(double index=1;index<=numberOfTerms;index++)
		{
			termSum=termSum+(index/((Q8FactorialPattern.powerTerm(index))+(Q8FactorialPattern.factorial(index))));
		}
		System.out.println("The sum is : "+ termSum);

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
	
	public static double powerTerm(double limit)
	{
		double term=limit*limit;
		double result=1;
		for(int i=1;i<=limit;i++)
		{
			result=result*term;
		}
		return result;
	}

}
