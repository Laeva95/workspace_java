package datetest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println(now);
		
		// Tue Aug 04 16:50:34 KST 2026
		// 해당 값을 다른 포맷으로 출력
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		
		System.out.println(sdf.format(now));
		
		for(int i = 0; i < 1000000; i++) {
			System.out.println(i);
		}
		System.out.println(sdf.format(now));
	}
}
