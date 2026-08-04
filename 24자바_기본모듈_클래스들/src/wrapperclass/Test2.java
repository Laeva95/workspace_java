package wrapperclass;

public class Test2 {

	public static void main(String[] args) {
		
		// parseXxx("문자열"):문자열로 된 값을 해당 래퍼 클래스의 값으로 변환
		int i = Integer.parseInt("123");
		boolean b = Boolean.parseBoolean("true");
		float f = Float.parseFloat("3.141592");
		
		
		// toString(): 해당 래퍼 클래스 객체의 값을 문자열로 반환
		String s1 = Integer.toString(123);
		
		String s2 = Integer.toHexString(123);
		
		String s3 = Character.toString('c');
		
		String s4 = Boolean.toString(true);
		
		System.out.println(i);					// 123
		
		System.out.println(b);					// true
		
		System.out.println(f);					// 3.141592
		
		System.out.println(i + 1);				// 124
		
		System.out.println("================================");
		
		System.out.println(s1);					// 123
		
		System.out.println(s2);					// 7b
		
		System.out.println(s3);					// c
		
		System.out.println(s4);					// true
		
		System.out.println(s1 + 1);				// 1231

		
	}	
}
