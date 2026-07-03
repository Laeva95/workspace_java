
public class If01 {

	public static void main(String[] args) {
		// 절대값 구하기
		int num;
		
		num = -5;
		
		 // num이 0보다 작다면
		if (num < 0) {
			// num의 부호를 반대로
			num = -num;
		}
		
		// num이 0보다 작으므로 -5가 아닌 5가 반환
		System.out.println(num);
		
		num = 5;
		
		 // num이 0보다 작다면
		if (num < 0) {
			// num의 부호를 반대로
			num = -num;
		}
		// num이 0보다 크므로 5가 그대로 반환
		System.out.println(num);
		
		
	}
}
