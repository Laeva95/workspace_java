
public class E08 {

	public static void main(String[] args) {
		// 3중 for문을 이용해서 시, 분, 초 나타내기
//		int h;
//		int m;
//		
//		System.out.println("시침 -------------------------------->> 분침");
//		
//		System.out.println("h----------------------------------->>  m");
//		
//		for(h = 0; h < 5; h++) {
//			for(m = 0; m < 60; m++) {
//				System.out.println("현재 시각은 " + h + "시 " + m + "분 입니다.");
//			}
//		}
		
		int hour, minute, second;
		int count = 0;
		
		System.out.println("시침 -> 분침 -> 초침");
		
		for(hour = 1; hour <= 1; hour++) {
			for (minute = 0; minute < 60; minute++) {
				for(second = 0; second < 60; second++) {
					System.out.println("현재 시각은 " + hour + "시 " + minute + "분 " + second + "초 입니다.");
					count++;
				}
			}
		}
		
		System.out.println(count); 					// 3600회 시행
		
	}
}
