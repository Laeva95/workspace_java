package ex1;

public class ExceptionHandlingExample3 {

	public static void main(String[] args) {

		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang 패키지 안에 String.class 파일이 만들어져 있음");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			try {
				Class.forName("java.lang.String2");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		System.out.println("자바 프로그램 코드가 끝까지 실행 되었습니다.");
	}
}
