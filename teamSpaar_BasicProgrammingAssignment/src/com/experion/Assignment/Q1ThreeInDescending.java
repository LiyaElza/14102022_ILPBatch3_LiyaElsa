package com.experion.Assignment;

import java.util.Scanner;

public class Q1ThreeInDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int firstNumber, secondNumber, thirdNumber;
		System.out.println("Enter the first number");
		firstNumber = scanner.nextInt();
		System.out.println("Enter the Second number");
		secondNumber = scanner.nextInt();
		System.out.println("Enter the Third number");
		thirdNumber = scanner.nextInt();
		
		System.out.println("The entered numbers in descending order : ");

		if (firstNumber >= secondNumber && firstNumber > thirdNumber) {
			if (secondNumber >= thirdNumber)
				System.out.println(firstNumber + "    " + secondNumber + "     " + thirdNumber);

			if (thirdNumber >= secondNumber)
				System.out.println(firstNumber + "    " + thirdNumber + "     " + secondNumber);

		}

		if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {

			if (firstNumber >= thirdNumber)
				
				System.out.println(secondNumber + "    " + firstNumber + "     " + thirdNumber);

			if (thirdNumber >= firstNumber)
				System.out.println(secondNumber + "    " + thirdNumber + "     " + firstNumber);

		}

		if (thirdNumber >= firstNumber && thirdNumber >= secondNumber) {

			if (firstNumber >= secondNumber)
				System.out.println(thirdNumber + "    " + firstNumber + "     " + secondNumber);

			if (secondNumber >= firstNumber)
				System.out.println(thirdNumber + "    " + secondNumber + "     " + firstNumber);

		}

	}

}
