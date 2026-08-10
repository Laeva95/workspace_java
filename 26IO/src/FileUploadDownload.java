import java.io.*;
public class FileUploadDownload {

	public static void main(String[] args) {
		// 사용자가 가지고 있다고 가정할 원본 파일 경로
		String sourceFile = "userFile.txt";
		
		// 서버 역할을 하는 업로드 폴더 경로
		String uploadDir = "upload/";
		
		// 업로드 완료 후 서버에 저장될 파일의 전체 경로
		String uploadFile = uploadDir + "userFile.txt";
		
		// 사용자가 서버에서 다운받은 폴더 경로
		String downloadDir = "download/";
		
		// 사용자가 서버에서 다운로드 받은 파일의 전체 경로
		// 원본과 구분하기 위해 끝에 _copy 를 붙임
		String downloadFile = downloadDir + "userFile_copy.txt";
		
		// ======================================================================
		
		// 파일을 저장하기 위한 폴더 생성
		// mkdirs(): 상위 폴더를 포함한 모든 폴더 생성
		new File(uploadDir).mkdirs();
		new File(downloadDir).mkdirs();
		
		// ======================================================================
		
		// 파일 업로드 처리
		System.out.println("파일 업로드 시작.......");
		
		if(copyFile(sourceFile, uploadFile)) {
			System.out.println("파일 업로드 완료!");
		} else {
			System.out.println("파일 업로드 실패!");
			System.exit(0);
		}
		
		// ========================================================================
		
		// 파일 다운로드 처리
		System.out.println("파일 다운로드 시작.......");
		
		if(copyFile(uploadFile, downloadFile)) {
			System.out.println("파일 다운로드 완료!");
		} else {
			System.out.println("파일 다운로드 실패!");
			System.exit(0);
		}
		
	}
	
	// from 에서 to 경로로 파일을 복사하는 메소드
	public static boolean copyFile(String from, String to) {
		// 원본 파일이 실제로 존재하는지 확인
		File source = new File(from);
		
		// 원본 파일이 존재하지 않는다면 메소드 종료
		if(!source.exists()) {
			System.out.println("원본 업로드할 파일이 존재하지 않습니다: " + from);
			System.out.println("실행 위치: " + source.getAbsolutePath());
			return false;
		}
		
		try(FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(to)) {
			// 원본 파일의 내용을 읽어서 새로운 파일에 복사
			// 한번에 1024 byte씩 읽기 위해 1024 byte 배열 생성
			byte[] buffer = new byte[1024];
			
			int readCount;
			
			// 원본 파일에서 byte 를 읽어 buffer에 저장하고, 저장한 byte 개수를 readCount 에 저장
			while((readCount = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, readCount);
			}
			return true;
		
		} catch(Exception e) {
			// 복사 도중 예외 발생
			System.out.println("파일 처리 중 오류 발생");
			e.printStackTrace();
			
			return false;
		}
	}
}
