package wrapperclass;

public class Ex5 {

	public static void main(String[] args) {
		
		// 자동 박싱, 언박싱
		// 개발자가 박싱, 언박싱 코드를 작성하지 않아도 컴파일러가 자동으로 작성해주는 기술
		int n1 = 10;
		
		int n2;
		
		Integer num1;
		
//		num1 = Integer.valueOf(n1);
		num1 = n1;
		
		System.out.println("자동 박싱");
		System.out.println("기본 자료형 n1의 값: " + n1);
		System.out.println("참조 자료형 num1의 값: " + num1);
		
		int value = num1;
		
		System.out.println("자동 언박싱");
		System.out.println("기본 자료형 value의 값: " + value);
		System.out.println("참조 자료형 num1의 값: " + num1);
		
		Integer it = 10;			// 자동 박싱
		
		int i = it;					// 자동 언박싱
		
		System.out.println(i);
		
		Double du = 3.14;			// 자동 박싱
		
		double b = du;				// 자동 언박싱
		
		System.out.println(b);
		
		// 자동 박싱, 언박싱을 통한 산술 연산
		Integer c1 = 10;
		Integer c2 = 20;
		
		c2 += 3;
		
		System.out.println(c2);
		
		c1++;
		
		int addResult = c1 + c2;
		
		System.out.println(addResult);
		
		int minResult = c1 - c2;
		
		System.out.println(minResult);
		
		
		
		
	}
}
