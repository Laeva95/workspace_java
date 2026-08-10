import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOTest01 {

	public static void main(String[] args) {
		// read(): 0~255 혹은 읽은 값이 없다면 -1 반환
		int data = 0;
		
		int count = 0;
		
		// 입력 스트림
		InputStream input = System.in;
		
		// 출력 스트림
		OutputStream output = System.out;
		
		System.out.println("문자를 입력하세요.\nIOTest01.class 프로그램을 종료하시려면 x 혹은 ctrl + z를 입력하세요");
		
		try {
			while((data = input.read()) != -1) {
				if(data == 'x' || data == 'X') {
					break;
				}
				
				// 읽어들인 바이트 개수 저장
				count++;
				
				// 읽어들인 바이트 출력
				System.out.println((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 입력받은 바이트 개수 출력
		System.out.println("count: " + count);
	}
}
