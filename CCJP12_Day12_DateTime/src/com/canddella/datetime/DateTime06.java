package com.canddella.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime06 {

	public static void main(String[] args) {
		
		var date = LocalDate.of(2022, Month.JUNE, 29);
		System.out.println(date);
		date = date.plusDays(2);
		System.out.println(date);
		date = date.plusWeeks(1);
		System.out.println(date);
		date = date.plusMonths(1);
		System.out.println(date);
		date = date.plusYears(5);
		System.out.println(date);
		

	}

}
