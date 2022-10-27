package com.experion.Assignment;

import java.util.Scanner;

public class Q18Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in); 
		System.out.print("Enter number in the series :- ");  
		int n= scanner.nextInt();
		int  firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");

	      // compute the next term
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	}
	}

}
