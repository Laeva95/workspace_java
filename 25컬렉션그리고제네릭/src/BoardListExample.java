import java.util.ArrayList;
import java.util.List;

class BoardDTO{
	private int no;
	private String title;
	private String writer;
	private int hit;
	
	public BoardDTO(int no, String title, String writer, int hit) {
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.hit = hit;
	}

	public int getNo() { return no; }
	public String getTitle() { return title; }
	public String getWriter() { return writer; }
	public int getHit() { return hit; }
	
	// 글 조회 시 조회수 1증가 메소드
	public void increaseHit () {
		hit++;
	}
}
public class BoardListExample {

	public static void main(String[] args) {
		// 1. 배열 생성
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		
		// 2. 데이터 3개 입력
		list.add(new BoardDTO(1, "첫번째 글", "kim", 5));
		list.add(new BoardDTO(2, "두번째 글", "lee", 5));
		list.add(new BoardDTO(3, "세번째 글", "kim", 5));
		
		
		
		
		
		
	}
}
