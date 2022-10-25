package com.experion.BasicProgramming;

import java.util.Scanner;

public class DayPrediction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dayNumber;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter an interger between 1 to 7");
		
		dayNumber=scanner.nextInt();
		
		switch(dayNumber)
		{
		case 1 : System.out.println("The day is Monday");
			break;
		case 2 : System.out.println("The day is Tuesday");
			break;
		case 3 : System.out.println("The day is Wednesday");
			break;
		case 4 : System.out.println(" The day is Thursday");
			break;
		case 5 : System.out.println("The day is Friday");
			break;
		case 6 : System.out.println("The day is Saturday");
			break;
		case 7 : System.out.println("The day is Sunday");
			break;
		default : System.out.println("Invalid Day Number");
		}

	}

}
