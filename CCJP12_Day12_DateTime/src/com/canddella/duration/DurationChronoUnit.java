package com.canddella.duration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationChronoUnit {

	public static void main(String[] args) {

		var daily = Duration.of(1,ChronoUnit.DAYS);
		System.out.println(daily);
		var hourly = Duration.of(1,ChronoUnit.HOURS);
		System.out.println(hourly);
		var everyMinute = Duration.of(1,ChronoUnit.MINUTES);
		System.out.println(everyMinute);
		var everyTenSeconds = Duration.of(10,ChronoUnit.SECONDS);
		System.out.println(everyTenSeconds);
		var everyMilli = Duration.of(1,ChronoUnit.MILLIS);
		System.out.println(everyMilli);
		var everyNano = Duration.of(1,ChronoUnit.NANOS);
		System.out.println(everyNano);

	}

}
