import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderWriterTest01 {

	public static void main(String[] args) throws IOException {
		// BufferedReader 클래스를 사용하는 이유
		// readLine() 메소드
		
		String fileName = null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("파일 이름을 입력하세요: ");
		
		// readLine(): 한 줄 단위로 입력한 글을 읽어들이는 메소드
		// 엔터 자체는 버려지고 입력에 포함되지 않음
		fileName = br.readLine();
		
		System.out.println("입력한 파일명: " + fileName);
		
		br.close();
		
	}
}
