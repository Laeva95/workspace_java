
public class Opr07 {
	public static void main(String[] args) {
		int a = 10, b = 10;
		// 증감 연산자
		
		// a 값 1 증가
		a++;
		
		System.out.println(a);
		
		// b 값 1 감소
		b--;
		
		System.out.println(b);
		
		// 전위 후위 증감 연산자 차이
		
		int c = 1;
		System.out.println(c++);// 출력: 1, c = 2
		
		System.out.println(c);	// 출력: 2
		
		System.out.println(++c);// 출력: 3, c = 3
		
		System.out.println(c);	// 출력: 3
		
	}
}
