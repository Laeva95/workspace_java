
public class Example4 {

	public static void main(String[] args) {
		
		printStudentInfo("홍길동", 30);				// 출력: 이름:홍길동, 나이:30
		
		System.out.println(add(5, 10));				// 출력: 15
		
		System.out.println(add2(6.0, 10.0));		// 출력: 16.0
		
	}
	
	// printStudentInfo 메서드 선언
	// 학생 이름을 문자열로, 학생 나이를 정수로 전달 받아서
	// "이름:홍길동, 나이:30" 과 같은 형식으로 출력하는 메서드
	public static void printStudentInfo(String name, int age) {
		System.out.println("이름:" + name + ", 나이:" + age);
	}

	// add 메서드 선언
	// 정수 2개를 전달 받아서 합을 반환하는 메서드
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// add2 메서드 선언
	// 실수 2개를 전달 받아서 합을 반환하는 메서드
	public static double add2(double num1, double num2) {
		return num1 + num2;
	}
}
