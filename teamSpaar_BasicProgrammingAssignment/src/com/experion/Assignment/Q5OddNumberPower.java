package com.experion.Assignment;

import java.util.Scanner;

public class Q5OddNumberPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
	     int limit,sumOfNumbers=0,index=1,count=1;
	     System.out.println("Enter the last term needed:");
	     limit=scanner.nextInt();
	     while(index<=limit)
	     {
	    	 if(count%2==0)
	    		 sumOfNumbers=sumOfNumbers-power(index,count);
	    	 else
	    		 sumOfNumbers=sumOfNumbers+power(index,count);
	         index+=2;
	         count++;
	     }
	     System.out.println("The sum of the series = "+sumOfNumbers);

	}
	
	public static int power(int index,int count)
	{
		int result=1;
		for(int funIndex=0;funIndex<count;funIndex++)
		{
			result=result*index;
		}
		return result;
	}

}
