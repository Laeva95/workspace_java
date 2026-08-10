import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOTest0A {

	public static void main(String[] args) {
		// 키보드로 입력받은 전체 데이터 중에 1바이트 크기의 데이터만 저장
		int data = 0;
		
		try {
			OutputStream output = System.out;
			
			// 1. 하나씩 출력
			output.write(74);
			output.write(97);
			output.write(118);
			output.write(97);
			output.write(10);
			output.flush();
			
			// 2. 배열로 한번에 출력
			byte[] msg = { 72, 101, 108, 108, 111, 33, 10 };
			output.write(msg);
			output.flush();
			
			// 3. 배열의 일부만 출력
			output.write(msg, 1, 4);
			output.write(10);
			output.flush();
			
			// ===========================================================================
			
			// input 으로 입력한 데이터를 output 으로 출력하기
			InputStream input = System.in;
			
			System.out.print("문자를 입력하세요(끝내려면 ctrl + z를 입력하세요) : ");
			
			while((data = input.read()) != -1) {
				output.write(data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
