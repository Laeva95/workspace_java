package Ex8;
// 게시판 예제
// 구조: Controller -> Service -> Repository
// 저장: 데이터베이스 대신 배열 사용

// Controller: 요청을 받아서 어느 기능을 실행할지 결정
// Service: 업무 규칙을 처리함
// Repository: 데이터를 실제로 저장하고 꺼내는 역할

// Service는 Repository를 인터페이스 자료형으로 가지고 있음
// 이렇게 하면 저장 방식이 배열에서 데이터베이스로 변경되어도 코드를 고치지 않아도 작동함

// [1] Board 클래스
// 게시글 하나의 정보를 담는 클래스
class Board{
	private int id;			// 게시글 글 번호
	private String title;	// 게시글 제목
	private String content;	// 게시글 내용
	private String writer;	// 게시글 작성자
	
	// 게시글 하나의 정보를 초기화 시키는 생성자
	public Board(int id, String title, String content, String writer) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	// getter 메소드
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
	
	// setter 메소드
	public void setContent(String content) {
		this.content = content;
	}
}

// [2] BoardRepository 인터페이스
// 저장소가 지켜야 할 규칙을 결정
interface BoardRepository{
	// 상수를 통해 최대 크기를 설정
	int MAX_SIZE = 100;
	
	// 글을 추가하기 위한 추상 메소드
	// 성공적으로 글을 추가했는지 알기 위해 boolean 값을 반환
	boolean insert(Board board);
	
	// 모든 글을 조회하기 위한 추상 메소드
	Board[] selectAll();
	
	// 글 번호를 통해 특정 글 한건 상세 정보 조회
	Board selectOne(int boardId);
	
	// 글 번호를 통해 특정 글 한건 내용 수정
	boolean update(int boardId, String newContent);
	
	// 글 번호를 통해 특정 글 한건 삭제
	boolean delete(int boardId);
	
}

// [3] MemoryBoardRepository
// 배열에 저장하는 저장소 클래스
class MemoryBoardRepository implements BoardRepository{
	// 글을 저장할 배열
	private Board[] boards = new Board[MAX_SIZE];
	
	// 실제로 채워진 글의 개수
	private int count = 0;
	
	@Override
	public boolean insert(Board board) {
		
		return false;
	}

	@Override
	public Board[] selectAll() {
		
		return null;
	}

	@Override
	public Board selectOne(int boardId) {
		
		return null;
	}

	@Override
	public boolean update(int boardId, String newContent) {
		
		return false;
	}

	@Override
	public boolean delete(int boardId) {
		
		return false;
	}
	
}
public class BoardMain {

	public static void main(String[] args) {
		
		
		
		
	}
}
