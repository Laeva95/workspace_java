package Ex8;

public class BoardServiceImpl implements BoardService {
	
	// Service 객체가 MemoryBoardRepository 객체를 포함하고 있음
	private BoardRepository repository;
	
	// 생성자 
	public BoardServiceImpl(BoardRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public void register(Board board) {
		printTitle("게시글 등록");
		
		// 입력받은 글의 제목이 유효한지 확인
		if(BoardService.isValidTitle(board.getTitle()) == false) {
			System.out.println("새 글 등록 실패: 글 제목을 입력해주세요.");
			
			return;
		}
		
		// 저장소에 저장을 요청
		// 성공했다면 글 번호, 제목을 출력
		if(repository.insert(board)) {
			System.out.println("새 글 등록 성공: " + board.getId() + "번 - " + board.getTitle());
		} else {// 저장소에 저장 요청이 실패했다면
			System.out.println("새 글 등록 실패: 저장 공간이 가득 찼습니다.");
		}
	}

	@Override
	public void showList() {
		printTitle("전체 목록");
		
		// 저장소에 저장된 모든 글 정보를 저장
		Board[] boards = repository.selectAll();
		
		// boards 에 저장된 글이 있는지 확인
		if(boards.length == 0) {
			System.out.println("등록된 글이 없습니다.");
			return;
		}
		
		System.out.println("총 " + boards.length + "건");
		
		for(Board b : boards) {
			System.out.println(b.getId() + " | " + b.getTitle() + " | " + b.getWriter());
		}
		
		
	}

	@Override
	public void showDetail(int boardId) {
		printTitle("상세 보기");
		
		repository.selectOne(boardId);
	}

	@Override
	public void modify(int boardId, String newContent) {
		
	}

	@Override
	public void remove(int boardId) {
		
	}

}
