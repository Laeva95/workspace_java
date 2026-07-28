// 게시판 기능 구현
abstract class Board{
	
	protected String title, content, author, date;

	public Board(String title, String content, String author, String date) {
		this.title = title;
		this.content = content;
		this.author = author;
		this.date = date;
	}
	
	// 일반 메소드
	public void printInfo() {
		System.out.println("제목: " + this.title);
		System.out.println("작성자: " + this.author);
		System.out.println("작성일: " + this.date);
		System.out.println("내용: " + this.content);
	}
	
	// 추상 메소드
	// 글 추가
	public abstract void addPost();
	
	// 글 수정
	public abstract void updatePost(String newContent);
	
	// 글 삭제
	public abstract void deletePost(int num);
	
}

class NoticeBoard extends Board{
	// 생성자
	public NoticeBoard(String title, String content, String author, String date) {
		super(title, content, author, date);
		
	}
	
	// 추상 메소드 오버라이딩
	@Override
	public void addPost() {
		System.out.println("공지사항 게시판 새 글 추가 INSERT");
	}

	@Override
	public void updatePost(String newContent) {
		System.out.println("공지사항 게시판 글 하나 수정 UPDATE");
	}

	@Override
	public void deletePost(int num) {
		System.out.println("공지사항 게사판 글 하나 삭제 DELETE");
	}
}

class GeneralBoard extends Board{
	// 생성자
	public GeneralBoard(String title, String content, String author, String date) {
		super(title, content, author, date);
	}

	// 추상 메소드 오버라이딩
	@Override
	public void addPost() {
		System.out.println("자유게시판 새 글 추가 INSERT");
	}

	@Override
	public void updatePost(String newContent) {
		System.out.println("자유게시판 글 하나 수정 UPDATE");
	}

	@Override
	public void deletePost(int num) {
		System.out.println("자유게시판 글 하나 삭제 DELETE");
	}
	
}

public class Main {
	public static void main(String[] args) {
		Board notice = new NoticeBoard("제목", "내용", "작성자", "작성일");
		
		notice.printInfo();
		notice.addPost();
		notice.updatePost("글 수정");
		notice.deletePost(1);
		
		Board general = new GeneralBoard("제목", "내용", "작성자", "작성일");
		
		general.printInfo();
		general.addPost();
		general.updatePost("글 수정");
		general.deletePost(1);
	}
}
