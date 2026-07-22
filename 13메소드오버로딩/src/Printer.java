
public class Printer {
	// 메소드 오버로딩
	// 동일한 이름의 메소드를 여러개 정의하는 것
	
	// print 메소드
	// 문자열 하나를 매개변수로 받아서 출력
	
	public static void print(String value) {
		System.out.println("문자열 출력: " + value);
	}
	public static void print(int value) {
		System.out.println("정수 숫자 출력: " + value);
	}
	public static void print(double value) {
		System.out.println("실수 숫자 출력: " + value);
	}
	public static void print(String value1, int value2) {
		System.out.println("문자열과 정수 출력: " + value1 + ", " + value2);
	}
	
	public static void main(String[] args) {
		print(100);
		print(99.99);
		print("문자열", 85);
		
	}
}
