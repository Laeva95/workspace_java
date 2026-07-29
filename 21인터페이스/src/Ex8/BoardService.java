package Ex8;

// [4] BoardService 인터페이스
// 업무 규칙을 결정. 무엇을 검사하고 무엇을 출력할지 결정
public interface BoardService {
	// 글 작성
	void register(Board board);
	
	// 글 목록 보기
	void showList();
	
	// 글 보기
	void showDetail(int boardId);
	
	// 글 수정
	void modify(int boardId, String newContent);
	
	// 글 삭제
	void remove(int boardId);
	
	// default 메소드
	// 위 다섯 기능이 모두 같은 글 제목 줄을 출력하게 구현
	default void printTitle(String title) {
		// 아래에 있는 private 메소드를 호출
		line();
		
		System.out.println("[" + title + "]");
		
		line();
	}
	
	// private 메소드
	// 인터페이스 내부에서만 사용되며 구현 클래스에 상속되지 않음
	private void line() {
		System.out.println("------------------------------------------------");
	}
	
	// static 메소드
	// 객체 생성 없이 인터페이스 명으로 호출 가능한 메소드
	static boolean isValidTitle(String title) {
		// title 이 빈 문자열이라면 false
		if(title == null) {
			return false;
		}
		
		// trim() 메소드를 통해 빈 공백 제거한 제목이 빈 문자열인지 확인
		if(title.trim().length() == 0) {
			return false;
		}
		
		return true;
		
	}
}
