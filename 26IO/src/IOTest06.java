import java.io.*;

public class IOTest06 {

	public static void main(String[] args) {
		int data = 0;
		
		File f = null;
		
		InputStream fis = null;
		
		FileOutputStream fos = null;
		
		System.out.println("파일에 기록할 내용을 입력하세요.");
		System.out.println("지금 입력한 내용은 파일에 입력됩니다.");
		
		try {
			f = new File("Test.txt");
			
			fos = new FileOutputStream(f, true);	// true: 이미 파일이 존재한다면 덮어씌우지 않고 뒤에 이어서 입력함
			
			fis = System.in;
			
			while((data = fis.read()) != -1) {
				fos.write((char)data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 사용한 fos, fis 객체 메모리를 해제
				if(fos != null){
					fos.close();
				}
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e){
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}
