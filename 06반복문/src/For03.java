
public class For03 {

	public static void main(String[] args) {
		// for 반복문을 제어할 제어변수 i 선언
		int i;
		
		System.out.println("===== 1번 문제 =====");
		
		// i가 1부터 10이하일때까지 1씩 증가하며 i값 출력
		for(i = 1; i <= 10 ; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n------------------------------------------------>>");
		
		System.out.println("===== 2번 문제 =====");
		
		// i가 1부터 10이하일때까지 2씩 증가하며 i값 출력
		for (i = 1; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n------------------------------------------------>>");
		
		System.out.println("===== 3번 문제 =====");
		
		// i가 2부터 10이하일때까지 2씩 증가하며 i값 출력
		for(i = 2; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n------------------------------------------------>>");
		
		System.out.println("===== 4번 문제 =====");
		
		// irk 10부터 1까지 1씩 감소하며 i값 출력
		for(i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n------------------------------------------------>>");
	}
}
