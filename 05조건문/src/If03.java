
public class If03 {

	public static void main(String[] args) {
		// if, else if, else 조건문을 사용해서 문자가 영문 소문자, 대문자, 그외 문자인지 확인하는 코드
		char ch = 'J';
		
		check(ch);
	}
	public static void check(char _ch) {
		if(_ch >= 'a' && _ch <= 'z') {
			// 매개변수 _ch가 소문자라면
			System.out.println(_ch + "는 영문 소문자입니다.");
		} 
		
		else if(_ch >= 'A' && _ch <= 'Z') {
			// 매개변수 _ch가 대문자라면
			System.out.println(_ch + "는 영문 대문자입니다.");
		} 
		
		else {
			// 매개변수 _ch가 소문자, 대문자에 포함되지 않는다면
			System.out.println(_ch + "는 영문자가 아닙니다.");
		}
	}
}
