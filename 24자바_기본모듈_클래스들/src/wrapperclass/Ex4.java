package wrapperclass;

public class Ex4 {

	public static void main(String[] args) {
		// 수동 박싱 두 방법이 어떻게 메모리를 다르게 사용하는지 확인
		
		// 1. new 연산자가 실행 될때마다 새로운 Integer 객체가 생성됨
//		Integer iValue1 = new Integer(10);
//		Integer iValue2 = new Integer(10);
		
		// 2. Integer.valueOf() 메서드 사용
		// 캐싱: 이미 같은 값을 가진 객체가 있다면 그 객체를 재활용함.
		Integer iValue1 = Integer.valueOf(10);
		Integer iValue2 = Integer.valueOf(10);
		
		// 두 객체의 주소가 같은지 확인
		System.out.println(iValue1 == iValue2);			// true
		
		
		
	}
}
