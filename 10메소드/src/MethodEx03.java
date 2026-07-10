
public class MethodEx03 {

	public static void main(String[] args) {
		System.out.println(abs(-1));		// 1
		System.out.println(abs(-10));		// 10
		System.out.println(abs(0));			// 0
		System.out.println(abs(5));			// 5
	}
	// 정수 하나를 전달받아 절대값을 구해 되돌려주는 메서드 만들기
	public static int abs(int n) {
		return n = n >= 0 ? n : -n;		// n이 0보다 크거나 같다면 그대로 반환, n이 0보다 작다면 -n 반환
	}
	
}
