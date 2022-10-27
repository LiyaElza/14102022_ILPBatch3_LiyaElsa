package com.experion.Assignment;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q19DateValidity {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		DateFormat dateFor = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter start date (dd/mm/yyyy):");
		Date startDate=dateFor.parse(scanner.nextLine());
		
		System.out.println("Enter end date (dd/mm/yyyy):");
		Date endDate=dateFor.parse(scanner.nextLine());
		
		long differenceInTime = startDate.getTime() - endDate.getTime();
		long differenceInDays = (differenceInTime/ (1000 * 60 * 60 * 24));
		
		System.out.println("The difference in days : "+Math.abs(differenceInDays));
	}



}
