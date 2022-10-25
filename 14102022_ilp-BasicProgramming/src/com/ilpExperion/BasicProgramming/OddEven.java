package com.ilpExperion.BasicProgramming;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int checkingNumber;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		checkingNumber = scanner.nextInt();
		
		int lastDigit = checkingNumber%10;
		
		if(lastDigit %2 ==0)
		{
			System.out.println("The entered number is Even");
		}
		else
		{
			System.out.println("The entered number is Odd");
		}

}
}
