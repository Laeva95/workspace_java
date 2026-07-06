
public class F02 {

	public static void main(String[] args) {
		// 1부터 10까지의 정수 중 3의 배수만 제외하고 출력하기
		int n;
		for(n = 1; n <= 10; n++) {
			// 3의 배수일 경우 실행문을 종료하고 다음 증감식으로 이동
			if(n % 3 == 0) {
				continue;
			}
			System.out.print("	" + n);
		}
		
		System.out.println("\n-------------------------------------------------------------------------------------");
		
		n = 0;
		
		while(n < 10) {
			n++;
			// 3의 배수일 경우 실행문을 종료하고 조건식으로 이동
			if(n % 3 == 0) {
				continue;
			}
			System.out.print("	" + n);
		}
		
		
		
	}
}
