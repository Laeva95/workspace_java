package wrapperclass;

public class Ex3 {

	public static void main(String[] args) {
		
		Integer num01 = new Integer(10);
		Integer num02 = new Integer("20");
		
		int n01 = num01.intValue();
		int n02 = num02.intValue();
		
		int sum = n01 + n02;
		
		System.out.println(Integer.toBinaryString(sum));
		
		System.out.println(Integer.toOctalString(sum));
		
		System.out.println(Integer.toHexString(sum));
		
		Integer num03 = new Integer(30);
		
		double d = num03.doubleValue();
		
		System.out.println(d);
		
		// parseInt(): 문자열 형태의 숫자를 정수 형태로 변환
		int int1 = Integer.parseInt("100");
		System.out.println(int1 + 100);
		
		
	}
}
