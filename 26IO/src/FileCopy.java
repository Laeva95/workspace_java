import java.io.*;

public class FileCopy {

	public static void main(String[] args) {
		int data = 0;
		int size = 0;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		if(args.length != 2) {
			System.out.println("입력하는 방법: java FileCopy 원본파일명 복사될새파일명");
			
			System.exit(0);
		}
		
		String originPath = args[0];
		String newPath = args[1];
		
		try {
			fis = new FileInputStream(originPath);
			fos = new FileOutputStream(newPath);
			
			while((data = fis.read()) != -1) {
				fos.write((char)data);
				size++;
			}
			
			System.out.println("파일 크기: " + size + "bytes");
		} catch (FileNotFoundException e) {
			System.out.println("지정된 경로에서 해당 파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("지정된 경로의 파일에서 더 이상 파일을 읽어들일 수 없습니다.");
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		}

	}
}
