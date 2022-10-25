package com.canddella.duration;

import java.time.Duration;

public class DurationDemo {

	public static void main(String[] args) {

		var daily = Duration.ofDays(1);
		System.out.println(daily);
		var hourly = Duration.ofHours(1);
		System.out.println(hourly);
		var everyMinute = Duration.ofMinutes(1);
		System.out.println(everyMinute);
		var everyTenSeconds = Duration.ofSeconds(10);
		System.out.println(everyTenSeconds);
		var everyMilli = Duration.ofMillis(1);
		System.out.println(everyMilli);
		var everyNano = Duration.ofNanos(1);
		System.out.println(everyNano);

	}

}
