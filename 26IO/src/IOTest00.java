import java.io.IOException;
import java.io.InputStream;

public class IOTest00 {

	public static void main(String[] args) {
		// 입력 스트림 통로에서 1바이트씩 읽어 정수값을 저장할 변수
		int data = 0;
		
		System.out.println("하나의 문자를 입력하세요.");
		
		// 키보드와 연결된 입력 스트림 객체 생성
		InputStream input = System.in;
		
		// 입력한 데이터 중 첫 1바이트만 읽어 data 변수에 저장
		try {
			data = input.read();
			// 입력된 데이터가 남아있다면 반복해서 꺼내어 data 변수에 저장 후 사용
			while(data != -1) {
				// 저장된 데이터를 char 타입으로 캐스팅해서 출력
				System.out.println((char)data);
				
				data = input.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
