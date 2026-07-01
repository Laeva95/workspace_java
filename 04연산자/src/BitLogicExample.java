
public class BitLogicExample {
	public static void main(String[] args) {
		
		/*
		 * 45 & 25 비트 논리곱 연산 &
		 * 
		 * 45와 25를 2진수로 변환
		 * 45: 101101
		 * 25:  11001
		 * ------------
		 * &:  001001	= 9
		 * */
		System.out.println(Integer.toBinaryString(45));		// 101101
		System.out.println(Integer.toBinaryString(25));		// 11001
		
		System.out.println("45 & 25 = " + (45 & 25));		// 9
		
		/*
		 * 45 | 25 비트 논리합 연산 |
		 * 
		 * 45와 25를 2진수로 변환
		 * 45: 101101
		 * 25:  11001
		 * ------------
		 * |:  111101	= 61
		 * */
		
		System.out.println("45 & 25 = " + (45 | 25));		// 61
		
		/*
		 * 논리 부정 연산
		 * 
		 * 45의 부정 연산
		 * 	  00101101
		 * ---------
		 * ~: 11010010	= -46
		 * */
		
		System.out.println("~45 = " + ~45);					// -46
		
		
		// 비트 논리곱을 사용해서 Unsigned 정수 얻기
		byte data = -120;
		int unsignedInt1 = data & 255;
		
		System.out.println(unsignedInt1);
		
		// 자바 API를 이용해서 Unsigned 정수 얻기
		int unsignedInt2 = Byte.toUnsignedInt(data);
		
		System.out.println(unsignedInt2);
		
		byte test = (byte)unsignedInt1;
		
		System.out.println(test);
	}
}
