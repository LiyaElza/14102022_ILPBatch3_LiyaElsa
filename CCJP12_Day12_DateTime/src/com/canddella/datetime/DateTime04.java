package com.canddella.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTime04 {

	public static void main(String[] args) {
		
		var dateTime1 = LocalDateTime.of(2022, Month.JUNE, 29, 6,15,30);
		var date1 = LocalDate.of(2022, Month.JUNE, 29);
		var time1 = LocalTime.of(6, 15);
		var dateTime2 = LocalDateTime.of(date1, time1);
		System.out.println(dateTime1 + "    "+ dateTime2);


	}

}
