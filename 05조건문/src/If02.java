
public class If02 {
	
	public static void main(String[] args) {
		// if, else 문을 사용해서 해당 문자가 소문자인지 확인하는 예제
		char ch = 'J';
		
		// ch가 영문자 소문자인지 확인
		if(ch >= 'a' && ch <= 'z') {
			System.out.println(ch + "는 영문 소문자입니다.");
		} else {
			System.out.println(ch + "는 영문 소문자가 아닙니다.");
		}
		
	}
}
