
public class Opr02 {
	public static void main(String[] args) {
		// 관계 연산자 >, >=, <, <=, ==, !=
		int a = 10, b = 4;
		boolean test;			// 기본값 false
		
		test = a > b;
		
		System.out.println(a + " > " + b + " = " + test);	// true
		
		test = a < b;
		
		System.out.println(a + " < " + b + " = " + test);	// false
		
		test = a + b > a - b;
		
		System.out.println(test);							// true
		
	}
}
