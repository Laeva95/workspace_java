package Ex8;

//[3] MemoryBoardRepository
//배열에 저장하는 저장소 클래스
public class MemoryBoardRepository implements BoardRepository{
	// 글을 저장할 배열
	private Board[] boards = new Board[MAX_SIZE];
	
	// 실제로 채워진 글의 개수
	private int count = 0;
	
	// 글 하나를 추가하는 기능
	@Override
	public boolean insert(Board board) {
		// 배열이 가득 차서 더 이상 추가 할 수 없다면
		if(count >= MAX_SIZE) {
			count = MAX_SIZE;
			return false;
		}
		
		// 비어있는 첫 칸에 board 객체 추가
		boards[count] = board;
		
		// 위 배열에 채워진 칸의 다음 칸으로 이동하기 위해 index 위치 변경
		count++;
		
		// 배열에 저장을 성공했다면
		return true;
	}

	// boards 배열에 담긴 모든 글을 반환
	@Override
	public Board[] selectAll() {
		
		// 실제 글 개수만큼만 새로운 배열을 만들어서 반환
		Board[] result = new Board[count];
		
		// 배열의 각 칸을 글 목록으로 채워서 반환
		for(int i = 0; i < count; i++) {
			result[i] = boards[i];
		}
		
		return result;
	}
	
	// boards 배열 중 특정 id 값을 가진 글을 반환
	@Override
	public Board selectOne(int boardId) {
		int index = -1;
		
		for(int i = 0; i < selectAll().length; i++) {
			if(boards[i].getId() == boardId) {
				index = i;
			}
		}
		
		return index >= 0 ? boards[index] : null;
	}
	
	// boards 배열 중 특정 id 값을 가진 글의 내용을 수정
	@Override
	public boolean update(int boardId, String newContent) {
		
		// boardId 값을 갖는 글 조회
		Board found = selectOne(boardId);
		
		if(found == null) {
			// 찾은 글이 없다면 수정 하지 않고 false 반환
			return false;
		}
		// 찾은 글이 있다면 객체의 내용을 새 값으로 변경하고 true 반환
		found.setContent(newContent);
		
		return true;
	}

	// boards 배열 중 특정 id 값을 가진 글 하나를 삭제
	@Override
	public boolean delete(int boardId) {
		
		for(int i = 0; i < count; i++) {
			if(boards[i] != null && boards[i].getId() == boardId) {
				for(int j = i; j < count - 1; j++) {
					// 뒷 칸의 글을 한 칸씩 앞으로 당긴다
					boards[j] = boards[j + 1];
				}
				// 마지막 칸은 null로 채움
				boards[count - 1] = null;
				
				// 한 칸 삭제했으므로 count--;
				count--;
				
				return true;
			}
		}
		
		return false;
	}
	
}
