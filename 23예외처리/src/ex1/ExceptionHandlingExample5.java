package ex1;

public class ExceptionHandlingExample5 {

	public static void main(String[] args) {
		String[] array = {"100", "1oo", null, "200"};
		
		for(int i = 0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println(value);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("자바 프로그램 종료");
		
	}
}
