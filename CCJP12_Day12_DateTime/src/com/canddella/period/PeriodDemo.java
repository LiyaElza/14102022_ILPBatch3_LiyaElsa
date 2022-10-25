package com.canddella.period;

import java.time.LocalDate;
import java.time.Month;

public class PeriodDemo {

	public static void main(String[] args) {
		
		var offerStartDate = LocalDate.of(2022,Month.JULY,1);
		var offerEndDate = LocalDate.of(2022,Month.JULY,31);
		performOfferCheck(offerStartDate,offerEndDate);
	}

	private static void performOfferCheck(LocalDate offerStartDate, LocalDate offerEndDate) {
		
		while(offerStartDate.isBefore(offerEndDate))
		{
			System.out.println("You are eligible for offer");
			offerStartDate = offerStartDate.plusMonths(1);
		}
		System.out.println(offerStartDate);
		
		
	}

}
