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
