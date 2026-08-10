import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class IOTest03 {

	public static void main(String[] args) {
		int data = 0;
		
		String path = "C:\\Users\\KHBS_D_09\\Desktop\\workspace_java\\25컬렉션그리고제네릭\\src\\Collections01.java";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			
			// Collections01.java 파일에 기록된 데이터를 1바이트씩 읽어서 출력
			while((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {		// <= new FileNotFoundException 또는 IOException 자식 객체 주소를 업캐스팅으로 전달 받을 수 있음
			e.printStackTrace();
		}
		
		
		
		
	}
}
