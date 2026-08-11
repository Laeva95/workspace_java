package niotest;

import java.nio.file.Path;		// 파일이나 폴더의 경로를 저장하는 객체의 부모 인터페이스 타입
import java.nio.file.Files;		// 파일 작업을 실행하는 클래스. 모든 메소드가 static 메소드
import java.io.IOException;

public class Nio01 {

	public static void main(String[] args) {
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
		
	}
}
