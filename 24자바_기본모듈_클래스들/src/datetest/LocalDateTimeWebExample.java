package datetest;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


// 게시글 작성 이후 24시간 이내에만 수정 가능
// LocalDateTime 을 이용해서 현재 시간과 작성 시간을 비교

public class LocalDateTimeWebExample {
	
	// 정적 내부 클래스
	static class Board{
		int boardNo;
		String title;
		String content;
		LocalDateTime createdAt;
		
		public Board(int boardNo, String title, String content) {
			this.boardNo = boardNo;
			this.title = title;
			this.content = content;
			this.createdAt = LocalDateTime.now();
		}
	}
	
	// 정적 내부 클래스 2
	static class BoardService{
		// 작성 시간이 24시간 이내인지 확인
		boolean canEdit(Board board) {
			LocalDateTime now = LocalDateTime.now();
			
			LocalDateTime createdTime = board.createdAt;
			
			long hours = createdTime.until(now, ChronoUnit.HOURS);
			
			return hours < 24;
		}
	}

	public static void main(String[] args) {
		Board board = new Board(1, "LocalDateTime 예제", "웹 개발 응용");
		board.createdAt = board.createdAt.minusHours(23);		// 테스트를 위해 23시간 이전으로 설정
		
		BoardService service = new BoardService();
		
		boolean result = service.canEdit(board);
		
		if(result) {
			System.out.println("게시글 수정 가능");
		}else {
			System.out.println("게시글 수정 불가능");
		}
		
		LocalDateTime now = LocalDateTime.now();
		
		LocalDateTime future = now.plusDays(1);
		
		LocalDateTime past = now.minusDays(1);
		
		System.out.println(future.isAfter(now));
		
		System.out.println(past.isBefore(now));
		
		System.out.println("현재와 미래의 날짜 차이: " + now.until(future, ChronoUnit.DAYS) + "일");
		
	}
}
