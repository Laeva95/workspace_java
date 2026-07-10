
public class Example2 {

	public static void main(String[] args) {
		printMessage("안녕하세요.");			// "안녕하세요.\n"
		printMessage("반갑습니다.");			// "반갑습니다.\n"
	}
	
	// 매개변수로 전달받은 문자열을 출력하고 한줄 줄바꿈을 하는 기능
	public static void printMessage(String message) {
		// 매개변수 message 출력 후 한줄 줄바꿈
		System.out.println(message);	
	}
}
