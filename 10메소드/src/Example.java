
public class Example {

	public static void main(String[] args) {
		
		int sum = add(5, 10);							// sum = 15
		
		System.out.println("합계: " + sum);				// 합계: 15
		
		System.out.println("합계: " + add(12, 20));		// 합계: 32
		
	}
	
	// 기본적인 반환값을 갖는 메서드 만들기
	// 두 매개변수의 합을 반환하는 메서드
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
}
