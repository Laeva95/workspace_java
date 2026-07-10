
public class MethodEx02 {

	// 숫자 1부터 n까지의 합을 구해서 출력
	public static void sum(int n) {
		int i = 0;
		int total = 0;
		
		// 1부터 n까지의 값을 total에 누적
		for (i = 1; i <= n; i++) {
			total += i;
		}
		
		// total 출력
		System.out.println("총 합: " + total);
	}
	public static void main(String[] args) {
		// 메서드 호출
		sum(10);
		sum(5);
		sum(33);
		
	}
	
}
