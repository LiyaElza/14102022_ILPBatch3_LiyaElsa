package com.experion.Assignment;

import java.util.Scanner;

public class Q12ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of elements :");
		int limit=scanner.nextInt();
		int[] numberArray=new int[limit];
		int index,innerIndex,temp;
		System.out.println("Enter elements");
		for(index=0;index<limit;index++) {
			numberArray[index]=scanner.nextInt();
		}
			for(index=0;index<limit;index++) {
				for(innerIndex=index+1;innerIndex<limit;innerIndex++) {
					if (numberArray[index]>numberArray[innerIndex]) {
						
						temp=numberArray[index];
						numberArray[index]=numberArray[innerIndex];
						numberArray[innerIndex]=temp;
						
					}
				}
			}
			System.out.println("Sotrted Array in ascending order:");
			for(index=0;index<limit;index++) {
				System.out.println(numberArray[index]);
				
			}			
				
		for(index=0;index<limit;index++) {
			for(innerIndex=index+1;innerIndex<limit;innerIndex++) {
				if (numberArray[index]<numberArray[innerIndex]) {
					
					temp=numberArray[index];
					numberArray[index]=numberArray[innerIndex];
					numberArray[innerIndex]=temp;
					
				}
			}
		}
		System.out.println("Sotrted Array in descending order:");
		for(index=0;index<limit;index++) {
			System.out.println(numberArray[index]);
			
		}
	}


}
