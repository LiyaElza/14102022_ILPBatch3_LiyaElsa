package com.experion.Assignment;

import java.util.Scanner;

public class Q2FourNumberAscendDescend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int array[]=new int[4];
		System.out.println("Enter four numbers : ");
		for(int index=0; index<4; index++)
		{
			array[index]=scanner.nextInt();
		}
		for(int index=0; index<4; index++)
		{
			
			for(int innerIndex=index+1;innerIndex<4;innerIndex++)
			{
				if(array[index]>array[innerIndex]) {
					int temp=array[index];
					array[index]=array[innerIndex];
					array[innerIndex]=temp;
					
				}
			}
		}
		System.out.println("The entered numbers in ascending order : ");
		for(int index=0; index<4; index++)
		{
			System.out.println(array[index]);
		}
		
		for(int index=0; index<4; index++)
		{
			
			for(int innerIndex=index+1;innerIndex<4;innerIndex++)
			{
				if(array[index]<array[innerIndex]) {
					int temp=array[index];
					array[index]=array[innerIndex];
					array[innerIndex]=temp;
					
				}
			}
		}
		System.out.println("The entered numbers in descending order : ");
		for(int index=0; index<4; index++)
		{
			System.out.println(array[index]);
		}

	}

}
