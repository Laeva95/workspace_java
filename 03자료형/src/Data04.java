// 예제
/*
	변수를 선언할 때 사용한 자료형의 역할
*/

import java.io.Console;

public class Data04 {

	public static void main(String[] args) {
		/*
			자료형 역할 1
				변수 메모리에 저장될 값을 결정함
		*/
		
		int a = 1;
		
		double m = 2.4;
		
		boolean k = true;
		
		/*
			자료형 역할 2
				변수 메모리의 크기를 결정함
		*/
		
		byte b;
		
		b = 127;
		
		System.out.println(++b); 			// 출력: -128  /  오버플로우 발생
		
		short s = 128;
		
		System.out.println(s);				// 출력: 128
		
		s = 32767;
		
		System.out.println(++s); 			// 출력: -32768  /  오버플로우 발생
		
		int c = 1000000000;
		
		// int d = 123456l;					// long 자료형이 아니므로 에러 발생
		
		long l = 123456l;
		
	}
}
