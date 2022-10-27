package com.experion.Assignment;

import java.util.Scanner;

public class Q4SumOfCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the limit");
		int lastTerm =scanner.nextInt();
		
		int currentTerm=2;
		int iterationCount=0;
		int sumSeries = 1; 
		while(currentTerm<=lastTerm)
		{
			iterationCount++;
			sumSeries=sumSeries+(currentTerm*currentTerm*currentTerm);
			currentTerm=currentTerm+iterationCount;
			
			
		}
		System.out.println("The sum of series is : "+sumSeries);

	}

}
