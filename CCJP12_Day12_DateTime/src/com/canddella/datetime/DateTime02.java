package com.canddella.datetime;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime02 {

	public static void main(String[] args) {
		
		var time1 = LocalTime.of(6, 15); // hours and minutes
		var time2 = LocalTime.of(6, 15, 30); // hours, minutes and seconds
		var time3 = LocalTime.of(6, 15, 30, 200); // hours, minutes, seconds and nanoseconds
		System.out.println(time1 + "    "+ time2 + "  "+ time3);
		
	}

}
