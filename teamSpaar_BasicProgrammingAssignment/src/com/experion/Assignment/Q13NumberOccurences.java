package com.experion.Assignment;

import java.util.Scanner;

public class Q13NumberOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements");
		limit = scanner.nextInt();
		int numArray[] = new int[limit];
		System.out.println("Enter all elements");
		for (int index = 0; index < limit; index++) {
			numArray[index] = scanner.nextInt();
		}
		sort(numArray);
		
		for(int index=0; index<numArray.length; index++)
		{
			int frequencyCount=1;
			boolean flag=false;
			for(int innerIndex=index+1;innerIndex<numArray.length;innerIndex++)
			{
			if(index!=0 && numArray[index-1]!=numArray[index]) {
				if(numArray[index]==numArray[innerIndex] ) {
					frequencyCount++;
					flag=true;
			}}
			else {
				if(numArray[index]==numArray[innerIndex]) {
					frequencyCount++;
					flag=true;
			}
			}
			}
				System.out.println("Frequency of "+numArray[index]+" : "+frequencyCount);
		}
		

	}
	
	public static void sort(int[] numArray) {
		for(int index=0; index<numArray.length; index++)
		{
			
			for(int innerIndex=index+1;innerIndex<numArray.length;innerIndex++)
			{
				if(numArray[index]>numArray[innerIndex]) {
					int temp=numArray[index];
					numArray[index]=numArray[innerIndex];
					numArray[innerIndex]=temp;
					
				}
			}
		}
		
	}

}
