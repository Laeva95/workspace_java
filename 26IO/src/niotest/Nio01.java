package niotest;

import java.nio.file.Path;		// 파일이나 폴더의 경로를 저장하는 객체의 부모 인터페이스 타입
import java.nio.file.Files;		// 파일 작업을 실행하는 클래스. 모든 메소드가 static 메소드
import java.io.IOException;

public class Nio01 {

	public static void main(String[] args) throws IOException {
		System.out.println("Path 객체 만들기");
		
		Path dirPath = Path.of("data");
		
		Path filePath = Path.of("data", "memo.txt");
		
		System.out.println("폴더 경로: " + dirPath);
		
		System.out.println("파일 경로: " + filePath);

		System.out.println();
		
		System.out.println("Path 객체에서 경로 정보 꺼내기");

		System.out.println("파일명: " + filePath.getFileName());
		
		System.out.println("상위 폴더: " + filePath.getParent());
		
		System.out.println("절대 경로: " + filePath.toAbsolutePath());
		
		System.out.println("경로의 조각 개수: " + filePath.getNameCount());
		
		System.out.println("0 인덱스 위치의 조각: " + filePath.getName(0));
		System.out.println("1 인덱스 위치의 조각: " + filePath.getName(1));
		
		System.out.println("===============================================");
		
		System.out.println("data 폴더 존재?: " + Files.exists(dirPath));
		System.out.println("memo.txt 파일 존재?: " + Files.exists(filePath));
		
		System.out.println();
		
		// =========================================================
		// 하드디스크에 실제로 파일 및 폴더 생성
		// 이미 존재하는 파일을 다시 만들면 예외가 발생함
		// FileAlreadyException
		
		if(!Files.exists(dirPath)) {
			Files.createDirectory(dirPath);
			System.out.println("data 폴더 생성 완료");
		}else {
			System.out.println("data 폴더가 이미 존재합니다.");
		}
		
		if(!Files.exists(filePath)) {
			Files.createFile(filePath);
			System.out.println("memo.txt 파일 생성 완료");
		}else {
			System.out.println("memo.txt 파일이 이미 존재합니다.");
		}
		
		System.out.println();
		
		// ====================================================
		// 생성 후 상태 다시 확인
		
		System.out.println("data 폴더 존재?: " + Files.exists(dirPath));
		System.out.println("memo.txt 파일 존재?: " + Files.exists(filePath));
		
		System.out.println("data는 폴더인가?: " + Files.isDirectory(dirPath));
		System.out.println("memo.txt는 폴더인가?: " + Files.isDirectory(filePath));
		
		System.out.println("memo.txt는 파일인가?: " + Files.isRegularFile(filePath));
		
		System.out.println("memo.txt 크기: " + Files.size(filePath) + " bytes");
		
		System.out.println("읽기 가능?: " + Files.isReadable(filePath));
		System.out.println("쓰기 가능?: " + Files.isWritable(filePath));
		
		// ====================================================
		// 정리
		System.out.println("1. Path.of 메소드는 JVM의 Heap 영역에 경로 영역을 만들뿐 하드디스크에 파일을 생성하지 않음");
		System.out.println("2. 하드디스크를 확인하고 바꾸는 것은 Files 클래스의 static 메소드 담당");
		
	}
}
