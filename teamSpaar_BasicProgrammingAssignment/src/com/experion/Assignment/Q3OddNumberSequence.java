package com.experion.Assignment;

import java.util.Scanner;

public class Q3OddNumberSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner =new Scanner(System.in);
	     int limit,sumOfNumbers=0,index=1,count=0;
	     System.out.println("Enter the last term needed:");
	     limit=scanner.nextInt();
	     while(index<=limit)
	     {
	    	 if(count%2==0)
	    		 sumOfNumbers=sumOfNumbers+index;
	    	 else
	    		 sumOfNumbers=sumOfNumbers-index;
	         index+=2;
	         count++;
	     }
	     System.out.println("The sum of the series = "+sumOfNumbers);
	}

}
