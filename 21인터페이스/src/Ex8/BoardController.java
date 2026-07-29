package Ex8;
// [6] BoardController
// 클라이언트의 글 기능 중 하나의 요청을 받아서 Service 에게 넘기는 역할
public class BoardController {
	// Controller 가 Service 를 포함하고 있음
	private BoardService service;
	
	// 생성자
	public BoardController(BoardService service) {
		this.service = service;
	}
	
	// 글 목록 조회 요청을 service 에게 전달
	public void requestList() {
		service.showList();
	}
	
	// 새 글 등록 요청을 service 에게 전달함
	public void requestRegister(Board board) {
		service.register(board);
	}
	
	// 특정 글 상세 조회 요청을 service 에게 전달
	public void requestDetail(int boardId) {
		service.showDetail(boardId);
	}
	
	// 특정 글 수정 요청을 service 에게 전달
	public void requestModify(int boardId, String newContent) {
		service.modify(boardId, newContent);
	}
	
	// 특정 글 삭제 요청을 service 에게 전달
	public void requestRemove(int boardId) {
		service.remove(boardId);
	}
	
}
