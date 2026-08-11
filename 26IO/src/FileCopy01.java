import java.io.*;
public class FileCopy01 {
	// 입출력할 데이터를 수용할 만큼의 버퍼 메모리 크기 설정
	final static int BUFFER_SIZE = 256;
	public static void main(String[] args) {
		int i = 0;		// 원본 파일에서 한번 읽어들인 바이트 크기
		int len = 0;	// 원본 파일에서 읽어들인 총 바이트 크기
		
		byte[] buffer = new byte[BUFFER_SIZE];
		
		if(args.length < 2) {
			System.out.println("java FileCopy01 원본파일명 복사될새파일명");
			System.exit(0);
		}
		
		File originFile = new File(args[0]);
		File newFile = new File(args[1]);
		
		if(!originFile.exists()) {
			System.out.println("원본 파일이 존재하지 않습니다");
			System.exit(0);
		}
		
		try(FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(newFile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			while((i = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, i);
				bos.flush();
				len += i;
				System.out.println("process : read[" + i +", " + len + "], avali[" + bis.available() + "]");
			}
			
			System.out.println(len + " bytes ard copied............");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
