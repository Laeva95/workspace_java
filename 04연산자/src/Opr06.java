
public class Opr06 {
	public static void main(String[] args) {
		// char 문자 변수는 숫자 형태로 저장됨
		// 따라서 문자끼리 크기 비교가 가능함
		char ch = 'b';
		
		String s;
		
		boolean result = ch >= 'A' && ch <= 'Z';
		
		s = result ? "대문자입니다." : "소문자입니다.";
		
		System.out.println(s);
	}
}
