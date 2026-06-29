
public class Opr08 {
	public static void main(String[] args) {
		int a = 10, b = 10;
		
		System.out.println(++a);		// 출력: 11
		
		System.out.println(a);			// 출력: 11
		
		System.out.println(b++);		// 출력: 10
		
		System.out.println(b);			// 출력: 11
		
		a = b = 10;		// b = 10, a = b 순서대로 연산해서 a, b 모두 10 저장
		
		int c = ++a;	// c = 11;
		
	}
}
