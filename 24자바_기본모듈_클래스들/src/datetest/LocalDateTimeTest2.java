package datetest;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest2 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		LocalDateTime future = now.plusDays(5);
		
		LocalDateTime past = now.minusDays(3);
		
		long between = now.until(future, ChronoUnit.DAYS);
		
		System.out.println(between);
		
		System.out.println(past.isBefore(now));
		
		System.out.println(future.isAfter(now));
	}
}
