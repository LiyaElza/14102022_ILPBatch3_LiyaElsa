package com.canddella.period;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodDemo02 {

	public static void main(String[] args) {
		
		var annually = Period.ofYears(1);
		var quarterly = Period.ofMonths(3);
		var everyThreeWeeks = Period.ofWeeks(3);
		var everyOtherDay = Period.ofDays(2);
		var everyYearAndWeek = Period.of(1,11,7);
		System.out.println(everyYearAndWeek);
	}
}
