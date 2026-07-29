package Ex8;

//[1] Board 클래스
//게시글 하나의 정보를 담는 클래스
public class Board {
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
