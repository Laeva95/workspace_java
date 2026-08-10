 import java.io.*;
 
public class FileType01 {
	public static void main(String[] args) {
		// cmd: java FileType01 FileTest02.java
		// 매개변수 args: { FileTest02.java }
		
		int data = 0;		// 파일 정보를 1바이트씩 저장할 변수
		int size = 0;		// 파일에 기록된 데이터의 크기를 저장할 변수
		
		if(args.length < 1) {
			System.out.println("입력하는 방법: java FileType01 읽어들일파일명");
			
			System.exit(0); 		// java 프로그램 종료
		}
		
		String path = args[0];
		
		try {
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			
			while ((data = fis.read()) != -1) {
				System.out.write((char)data);	// 1 바이트씩 읽어들인 파일을 출력
				size++;							// 파일 크기 변수에 + 1
			}
			
			System.out.println("파일 크기: " + size + "bytes");
		} catch (FileNotFoundException e) {
			System.out.println("지정된 경로에서 FileTest02.java 파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("지정된 경로에서 FileTest02.java 파일에 기록된 데이터를 더 이상 읽어들일 수 없습니다.");
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
