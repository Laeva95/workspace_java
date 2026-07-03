
public class Switch04 {

	public static void main(String[] args) {
		// 해당 문자가 영문자 모음인지를 확인하는 예제
		char ch = 'i';
		
		switch (ch) {
				// 'a' 또는 'A'라면 실행
			case 'a':
			case 'A':				
				System.out.println("해당 문자는 'A'입니다.");
				break;
				// 'e' 또는 'E'라면 실행
			case 'e':
			case 'E':
				System.out.println("해당 문자는 'E'입니다.");
				break;
				// 'i' 또는 'I'라면 실행
			case 'i':
			case 'I':
				System.out.println("해당 문자는 'I'입니다.");
				break;
				// 'o' 또는 'O'라면 실행
			case 'o':
			case 'O':
				System.out.println("해당 문자는 'O'입니다.");
				break;
				// 'u' 또는 'U'라면 실행
			case 'u':
			case 'U':
				System.out.println("해당 문자는 'U'입니다.");
				break;
			default:
				// 해당되는 조건이 없을 경우
				System.out.println("해당 문자는 영문 모음이 아닙니다.");
				break;
		}
	}
}
