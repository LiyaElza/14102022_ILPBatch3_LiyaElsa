package com.canddella.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime05 {

	public static void main(String[] args) {
		
		var dateTime1 = LocalDateTime.of(2022, Month.JUNE, 29, 6,15,30);
		var zone = ZoneId.of("Asia/Calcutta");
		var zoned1 = ZonedDateTime.of(dateTime1, zone);
		System.out.println(zoned1);
		System.out.println(ZoneId.getAvailableZoneIds());
		

	}

}
