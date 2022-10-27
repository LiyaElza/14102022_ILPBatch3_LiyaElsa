package com.experion.Assignment;

import java.util.Scanner;

public class Q15DuplicateRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit,index=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of elements");
		limit=scanner.nextInt();
		int numArray[]=new int[limit];
		System.out.println("Enter all elements");
		for(index=0;index<limit;index++)
		{
			numArray[index]=scanner.nextInt();
		}
		for(index=0;index<limit;index++)
		{
			for(int index2=index+1;index2 < limit;index2++) {
				if(numArray[index]==numArray[index2]) {
					
					for(int index3=index2;index3<limit-1;index3++)
					{
						numArray[index3]=numArray[(index3+1)];
					}
					limit--;
				}
			}
		}
		System.out.println("Array after removing duplication : ");
		for(index=0;index<limit;index++)
		{
			System.out.println(numArray[index]);
		}
	}

}
