
package niotest;

import java.nio.charset.StandardCharsets;      // 문자 인코딩 상수 모음. UTF_8 사용
import java.nio.file.DirectoryStream;          // 폴더 안 항목을 하나씩 꺼내는 스트림 타입
import java.nio.file.Files;                    // 파일 작업을 실행하는 클래스. 전부 static 메서드
import java.nio.file.Path;                     // 파일 경로를 담는 객체의 타입
import java.nio.file.StandardCopyOption;       // 복사/이동 옵션 상수 모음 (REPLACE_EXISTING 등)
import java.io.IOException;                    // 파일 작업 실패 시 발생하는 예외 클래스
import java.util.List;                         // 목록 타입

/*
 * ==================================================================
 * [NIO 예제 3] 파일 복사, 이동, 삭제, 폴더 목록
 * ==================================================================
 *
 * ------------------------------------------------------------------
 * 1. 용어 정리 (이 예제에 나오는 자바 용어)
 * ------------------------------------------------------------------
 *
 *   버퍼            : 데이터를 옮길 때 중간에 잠시 담아 두는 byte 배열.
 *                     Heap 에 만들어진다. 한 바이트씩 옮기는 것보다
 *                     묶어서 옮기는 것이 훨씬 빠르기 때문에 사용한다.
 *   DirectoryStream : 폴더 안의 항목(Path 객체)을 하나씩 꺼내 주는 스트림.
 *                     NIO 에서 유일하게 내 코드로 닫아야 하는 스트림이다.
 *   try-with-resources : try (스트림 생성) { 사용 } 형태의 문법.
 *                     try 블록이 끝나면 스트림의 close() 가 자동 호출된다.
 *   예외            : 실행 중 오류. 아래 세 가지가 이 예제와 관련 있다.
 *                     FileAlreadyExistsException  이미 있는데 또 만들 때
 *                     NoSuchFileException         없는 것을 지우거나 읽을 때
 *                     DirectoryNotEmptyException  안 비운 폴더를 지울 때
 *
 *
 * ------------------------------------------------------------------
 * 2. copy 와 move 의 차이 (이 예제의 핵심)
 * ------------------------------------------------------------------
 *
 *   Files.copy(원본, 대상)  실행 후
 *     원본 위치 : 파일 그대로 있음
 *     대상 위치 : 파일 새로 생김
 *     디스크의 파일 개수 : 2개
 *
 *   Files.move(원본, 대상)  실행 후
 *     원본 위치 : 파일 없어짐
 *     대상 위치 : 파일 생김
 *     디스크의 파일 개수 : 1개
 *
 *   백업 작업은 원본이 남아야 하므로 copy 를 쓰고,
 *   분류/정리 작업은 원본 위치가 비워져야 하므로 move 를 쓴다.
 *
 *
 * ------------------------------------------------------------------
 * 2-1. IO(java.io) 와의 비교 - 같은 일을 하는 옛날 방식
 * ------------------------------------------------------------------
 *
 *   [이 예제의 NIO 코드와 IO 대응 코드]
 *
 *     NIO (이 예제, 각 1줄)     | IO (java.io 방식)
 *     --------------------------+------------------------------------------
 *     Files.copy                | 전용 메서드 없음. 스트림 2개 + 버퍼 반복을
 *                               | 직접 구현해야 했다 ([2] 에서 상세 비교)
 *     Files.move                | f.renameTo(대상) - 실패 시 false 만 반환
 *     Files.deleteIfExists      | f.delete()      - 실패 시 false 만 반환
 *     Files.newDirectoryStream  | f.listFiles()   - 전체를 배열로 한 번에
 *
 *   요약 : IO 는 "복사 기능이 아예 없고", 나머지도 실패 원인을
 *          알려 주지 않는다. 이 두 가지가 NIO 로 바뀐 핵심 이유다.
 *
 *
 * ------------------------------------------------------------------
 * 3. 실행 순서 (게시판 첨부파일 처리 흐름)
 * ------------------------------------------------------------------
 *
 *   temp 폴더    : 업로드 직후 파일을 임시 보관하는 폴더
 *   upload 폴더  : 검사 후 정식으로 저장하는 폴더
 *   backup 폴더  : 복사본을 보관하는 폴더
 *
 *   [1] 폴더 3개 생성, 파일 2개 준비
 *   [2] temp 에서 upload 로 복사   --> 원본 유지 확인
 *   [3] temp 에서 upload 로 이동   --> 원본 소멸 확인
 *   [4] 파일 이름 변경 (같은 폴더 안 move)
 *   [5] upload 폴더 목록 출력 (DirectoryStream)
 *   [6] upload 전체를 backup 으로 복사
 *   [7] temp 의 파일 삭제
 *   [8] 백업된 파일 내용 확인
 * ==================================================================
 */
public class Nio03_FileManage {

    public static void main(String[] args) throws IOException {

        // ==============================================================
        // [1] 폴더 3개와 파일 2개 준비
        // ==============================================================
        System.out.println("===== [1] 폴더와 임시 파일 준비 =====");
        
        Path tempDir = Path.of("temp");
        Path uploadDir = Path.of("uploads");
        Path backupDir = Path.of("backup");
        
        Files.createDirectories(tempDir);
        Files.createDirectories(uploadDir);
        Files.createDirectories(backupDir);
        
        System.out.println("temp / uploads / backup 폴더 생성 완료");
        
        Path tempReport = tempDir.resolve("report.txt");        
        Path tempNotice = tempDir.resolve("notice.txt");
        
        Files.writeString(tempReport, "8월 업무 보고서\n작성자 홍길동\n", StandardCharsets.UTF_8);
        Files.writeString(tempNotice, "8월 공지사항\n휴무일 안내\n", StandardCharsets.UTF_8);
        
        System.out.println("임시 원본파일 2개 생성 완료");
        System.out.println();
        
        // ===============================================================
        System.out.println("===== [2] 파일 복사 copy =====");
        
        Path uploadReport = uploadDir.resolve("report.txt");
        
        Files.copy(tempReport, uploadReport, StandardCopyOption.REPLACE_EXISTING);
        
        System.out.println("복사 완료: " + tempReport + " -> " + uploadReport);
        
        System.out.println("원본 파일 남아 있나?: " + Files.exists(tempReport));
        System.out.println("사본 생겼나?: " + Files.exists(uploadReport));
        System.out.println();
        
        // =================================================================
        System.out.println("===== [3] 파일 이동 move =====");
        
        Path uploadNotice = uploadDir.resolve("notice.txt");
        
        Files.move(tempNotice, uploadNotice, StandardCopyOption.REPLACE_EXISTING);
        
        System.out.println("파일 이동 완료: " + tempNotice + " -> " + uploadNotice);
        
        System.out.println("원본 파일 남아 있나?: " + Files.exists(tempNotice));
        System.out.println("사본 생겼나?: " + Files.exists(uploadNotice));
        System.out.println();
        
        // ==================================================================
        System.out.println("===== [4] 파일 이름 바꾸기 =====");
        
        Path renamed = uploadDir.resolve("notice_202608.txt");
        
        Files.move(uploadNotice, renamed, StandardCopyOption.REPLACE_EXISTING);
        
        System.out.println("파일 이름 변경: notice.txt -> notice_202608.txt");
        System.out.println();
        
        // ===================================================================
        System.out.println("===== [5] DirectoryStream 스트림 통로 이용 =====");
        
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(uploadDir)){
        	for(Path p : stream) {
        		System.out.println("파일명: " + p.getFileName() + " / 크기 " + Files.size(p) + "bytes");
        	}
        }
        System.out.println();
        
        // ================================================================
        System.out.println("===== [6] 전체 파일 백업 =====");
        
        int count = 0;
        
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(uploadDir)){
        	for (Path p : stream) {
        		Path target = backupDir.resolve(p.getFileName());
        		
        		Files.copy(p, target, StandardCopyOption.REPLACE_EXISTING);
        		
        		System.out.println("백업: " + p.getFileName());
        		
        		count++;
			}
        	System.out.println("백업한 파일 수: " + count);
        }
        
        // ==============================================================
        System.out.println("===== [7] 파일 삭제 =====");
        
        Path tempTarget = tempDir.resolve("report.txt");
        
        boolean isDeleted = Files.deleteIfExists(tempTarget);
        
        System.out.println("temp/report.txt 삭제됨?: " + isDeleted);
        System.out.println("삭제 후 존재?: " + Files.exists(tempTarget));
        System.out.println();
        
        // ==============================================================
        System.out.println("===== [8] 백업 파일 내용 확인 =====");
        
        Path backupReport = backupDir.resolve("report.txt");
        
        List<String> lines = Files.readAllLines(backupReport, StandardCharsets.UTF_8);
        
        for(String line : lines) {
        	System.out.println("report.txt 파일에서 읽어온 내용: " + line);
        }
        System.out.println();
        
        
        
    }   // main 끝

}   // 클래스 끝
