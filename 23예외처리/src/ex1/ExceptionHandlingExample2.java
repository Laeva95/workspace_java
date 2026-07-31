package ex1;

public class ExceptionHandlingExample2 {

	public static void printLength (String data) {
		
		try {								// 예외가 발생할 가능성이 있는 코드
											// 예외가 발생하면 그 이후 코드는 실행되지 않음
			System.out.println("[시작 코드 실행]");
			int result = data.length();
			System.out.println("매개 변수 data로 전달 받은 전체 문자열의 총 개수: " + result);
		} catch (NullPointerException e) {	// 예외가 발생할 때 실행되는 코드
			// 예외가 발생한 이유를 문자열로 반환
			System.out.println(e.getMessage());
			
			// 예외 이유 메시지 + 발생한 예외 종류명을 반환
			System.out.println(e.toString());
			
			// 예외 이유 메시지 + 발생한 예외 종류명 + 예외 발생 코드 위치 줄번호를 문자열로 출력
			e.printStackTrace();
			
			System.out.println("printLength() 메소드를 호출할 때 문자열을 매개 변수로 전달하세요.");
		} finally {							// 예외와 상관 없이 실행되는 코드
			System.out.println("[마무리 코드 실행]");
		}
	}
		
	public static void main(String[] args) {
		
		System.out.println("[자바 프로그램 시작 코드]");
		
		printLength("ThisIsJava");
		
		printLength(null);
		
		System.out.println("[자바 프로그램 종료 코드]");
	}
}
