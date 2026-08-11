import java.io.*;

public class PrintStreamTest1 {

	public static void main(String[] args) {
		// PrintStream 다양한 자료형을 따로 변환하지 않고 바로 출력 할 수 있음
		// 1. 파일이 존재하지 않으면 새로 생성됨
		// 2. 파일을 만들 수 없는 상황이면 예외 발생
		try {
			PrintStream out = new PrintStream("ps.txt");
			
			out.println(10);
			out.println(3.4);
			out.println('A');
			out.println(true);
			out.println("hello");
			
			out.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
