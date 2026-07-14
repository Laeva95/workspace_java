
// 도서관의 책 한권을 클래스로 설계
public class BookTest {

	String title;				// 책 제목
	String author;				// 책 저자
	boolean isRented;			// 책 대출 여부

	// 책을 빌리는 메서드
	void rent() {
		if(!isRented){
			isRented = true;
			System.out.println(title + " 책을 대출 했습니다.");
		}
		else {
			System.out.println("이미 대출 중입니다.");
		}
	}
	// 빌린 책을 반납하는 메서드
	void returnBook() {
		isRented = false;
		System.out.println(title + " 반납 완료");
	}
	// 책의 현재 상태를 출력하는 메서드
	void printStatus() {
		System.out.println("제목: " + title + ", 저자: " + author + ", 대출 상태: " + isRented);
	}
	
	public static void main(String[] args) {
		BookTest book = new BookTest();
		
		book.title = "자바의 정석";
		book.author = "남궁성";
		book.isRented = false;
		
		book.rent();
		book.rent();
		book.returnBook();
		book.printStatus();
		
		
	}
}
