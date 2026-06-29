
public class Opr01_02 {
	public static void main(String[] args) {
		/*
		 * + 연산자는 숫자끼리는 덧셈을 하지만
		 * 	 문자열과 만나면 문자열과 숫자, 문자열과 문자열을 이어 붙이는 역할을 함
		 */
		
		String a = "Apple";
		String b = "Banana";
		
		String c = a + b;
		
		System.out.println(c);			// 출력: "AppleBanana"
		
		String str = "결과값 : ";	
		int n = 10;
		
		System.out.println(str + n);	// 출력: "결과값 : 10"
		
		System.out.println("결과값 : " + 10);	// 출력: "결과값 : 10"
		
		
		
		
		
	}
}
