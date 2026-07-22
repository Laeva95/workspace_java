class Calculator{
	// add 메소드 오버로딩
	
	// 1. 두 정수의 합을 반환
	public int add(int a, int b) {
		return a + b;
	}
	
	// 2. 세 정수의 합을 반환
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	// 3. 두 실수의 합을 반환
	public double add(double a, double b) {
		return a + b;
	}
	
	// 4. 정수와 실수의 합을 반환
	public double add(int a, double b) {
		return a + b;
	}
}
public class Main {	
	public static void main(String[] args) {
		// Calculator 클래스 객체 생성
		Calculator calculator = new Calculator();
		
		// 정수 5와 정수 10의 합을 출력
		System.out.println(calculator.add(5, 10));
		
		// 정수 5와 정수 10과 정수 15의 합을 출력
		System.out.println(calculator.add(5, 10, 15));
		
		// 실수 5.5와 실수 10.5의 합을 출력
		System.out.println(calculator.add(5.5, 10.5));
		
		// 정수 5와 실수 10.5의 합을 출력
		System.out.println(calculator.add(5, 10.5));
		
	}
}
