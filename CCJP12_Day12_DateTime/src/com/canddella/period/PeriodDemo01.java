package com.canddella.period;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodDemo01 {

	public static void main(String[] args) {
		
		var offerStartDate = LocalDate.of(2022,Month.JULY,1);
		var offerEndDate = LocalDate.of(2022,Month.JULY,31);
		var offerTestingPeriod = Period.ofMonths(1);
		performOfferCheck(offerStartDate,offerEndDate,offerTestingPeriod);
	}

	private static void performOfferCheck(LocalDate offerStartDate, LocalDate offerEndDate,Period offerTestingPeriod) {
		
		while(offerStartDate.isBefore(offerEndDate))
		{
			System.out.println("You are eligible for offer");
			offerStartDate = offerStartDate.plus(offerTestingPeriod);
		}
		System.out.println(offerStartDate);
		
		
	}

}
