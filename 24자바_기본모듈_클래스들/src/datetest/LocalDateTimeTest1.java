package datetest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest1 {

	public static void main(String[] args) {
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		System.out.println(dtf.format(time));
		
		LocalDateTime result = time.plusYears(1);
		
		System.out.println(dtf.format(result));
		
		LocalDateTime result2 = time.plusMonths(2);
		
		System.out.println(dtf.format(result2));
		
		LocalDateTime result3 = time.plusDays(7);
		
		System.out.println(dtf.format(result3));
		
	}
}
