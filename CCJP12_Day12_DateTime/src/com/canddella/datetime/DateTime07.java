package com.canddella.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime07 {

	public static void main(String[] args) {
		
		var date = LocalDate.of(2022, Month.JUNE, 29);
		var time = LocalTime.of(6, 15);
		var dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime);
		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime);
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime);
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime);
		var dateTimeChain = LocalDateTime.of(date,time).minusDays(1).minusHours(10).minusSeconds(30);
		System.out.println(dateTimeChain);
		StringBuilder name = new StringBuilder();
		name.append("suneesh");
		System.out.println(name.reverse());
		
		

	}

}
