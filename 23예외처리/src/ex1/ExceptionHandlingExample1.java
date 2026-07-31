package ex1;

public class ExceptionHandlingExample1 {

	public static void printLength (String data) {
		
		int result = data.length();
		
		System.out.println("매개 변수 data로 전달 받은 전체 문자열의 총 개수: " + result);
	}
	public static void main(String[] args) {
		
		System.out.println("[자바 프로그램 시작 코드]");
		
		printLength("ThisIsJava");
		
		printLength(null);
		
		System.out.println("[자바 프로그램 종료 코드]");
	}
}
