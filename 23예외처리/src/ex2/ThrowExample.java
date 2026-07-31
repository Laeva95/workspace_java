package ex2;

public class ThrowExample {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void findClass() throws ClassNotFoundException{
		
		// 예외가 발생 할 수 있는 코드
		Class.forName("java.lang.String2");
		
		
	}
}
