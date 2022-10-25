package com.canddella.datetime;

import java.time.LocalDate;
import java.time.Month;

public class DateTime03 {

	public static void main(String[] args) {
		
		var date1 = LocalDate.of(2022, 6, 29);
		var date2 = LocalDate.of(2022, Month.JUNE, 29);
		System.out.println(date1 + "    "+ date2);


	}

}
