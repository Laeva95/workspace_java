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
		
		// 3. 데이터 3개 출력
		System.out.println("번호\t제목\t\t\t작성자\t조회수");
		System.out.println("=================================================");
		for(BoardDTO dto : list) {
			System.out.println(dto.getNo() + "\t" + dto.getTitle() + "\t\t\t" 
		+ dto.getWriter() + "\t" + dto.getHit());
		}
		
		// 4. 글 상세보기
		int targetNo = 2;		// 사용자가 클릭한 글 번호
		
		System.out.println("==== " + targetNo + "번 글 상세보기 ===");
		
		for(BoardDTO dto : list) {
			if(targetNo == dto.getNo()) {
				dto.increaseHit();
				System.out.println("제목: " + dto.getTitle());
				System.out.println("작성자: " + dto.getWriter());
				System.out.println("조회수: " + dto.getHit());
			}
		}
		
		// 5. 글 수정하기
		System.out.println("=== 상세 보기 후 목록 다시 출력 ===");
		System.out.println("=================================================");
		for(BoardDTO dto : list) {
			System.out.println(dto.getNo() + "\t" + dto.getTitle() + "\t\t\t" 
		+ dto.getWriter() + "\t" + dto.getHit());
		}
	}
}
