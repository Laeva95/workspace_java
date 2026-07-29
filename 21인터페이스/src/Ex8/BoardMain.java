package Ex8;
// 게시판 예제
// 구조: Controller -> Service -> Repository
// 저장: 데이터베이스 대신 배열 사용

// Controller: 요청을 받아서 어느 기능을 실행할지 결정
// Service: 업무 규칙을 처리함
// Repository: 데이터를 실제로 저장하고 꺼내는 역할

// Service는 Repository를 인터페이스 자료형으로 가지고 있음
// 이렇게 하면 저장 방식이 배열에서 데이터베이스로 변경되어도 코드를 고치지 않아도 작동함

public class BoardMain {

	public static void main(String[] args) {
		// 1. 조립 단계
		// 저장소 객체를 만들어서 저장
		BoardRepository repository = new MemoryBoardRepository();
		
		// 서비스 객체를 만들어서 저장
		BoardService service = new BoardServiceImpl(repository);
		
		// 컨트롤러 객체를 만들어서 저장
		BoardController controller = new BoardController(service);
		
		// ---------------------------------------
		// 2. 글 등록
		controller.requestRegister(new Board(1, "첫 글", "내용입니다.", "홍길동"));
		
		controller.requestRegister(new Board(2, "인터페이스 질문", "default 메소드가 궁금합니다", "김철수"));
		
		controller.requestRegister(new Board(3, "", "제목이 공백입니다.", "이영희"));
		
		// ---------------------------------------
		// 3. 글 목록 조회
		controller.requestList();
	}
}
