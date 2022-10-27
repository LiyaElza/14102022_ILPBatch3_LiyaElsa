package com.experion.Assignment;

import java.util.Scanner;

public class Q14Sumof8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int limit = scanner.nextInt();
		int numArray[]=new int[limit];
		int sumArray[]=new int[limit];
		System.out.println("Enter elements : ");
		for(int index=0;index<limit;index++)
		{
			numArray[index]=scanner.nextInt();
		}
		for(int index=0;index<limit;index++)
		{
			for(int innerIndex=0;innerIndex<limit;innerIndex++)
			{
				if((numArray[index]+numArray[innerIndex])==8)
				{
					System.out.println("The set with sum of 8 : "+numArray[index]+" , "+numArray[innerIndex]);
				}
			}
		}
	}

}
