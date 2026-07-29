package Ex8;

//[2] BoardRepository 인터페이스
//저장소가 지켜야 할 규칙을 결정
public interface BoardRepository{
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
