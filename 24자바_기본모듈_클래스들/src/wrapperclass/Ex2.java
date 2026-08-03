package wrapperclass;

public class Ex2 {

	public static void main(String[] args) {
		
		// 박싱
		// 기본 자료형의 데이터를 래퍼 클래스의 데이터로 포장하는 작업
		
		int n = 10;
		
		// 수동 박싱
		Integer value1 = new Integer(n);
		Integer value2 = Integer.valueOf(n);
		
		System.out.println(value1);
		System.out.println(value2);
		
		// 언박싱
		// 래퍼 클래스의 데이터를 다시 꺼내오는 작업
		
		// 수동 언박싱
		int n2 = value1.intValue();
		int n3 = value2.intValue();
		
		System.out.println(n2);
		System.out.println(n3);
		
		
		
		
	}
}
