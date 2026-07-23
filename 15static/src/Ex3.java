/*
 	변수의 초기화 시기와 실행 순서
 	
 	멤버 변수 초기화
 		멤버 변수의 값을 처음으로 입력하는 것
 	
 	멤버 변수 초기화 방법
 	 	1. 명시적 초기화
 	 	2. 생성자를 이용한 초기화
 	 	3. 초기화 블럭을 이용한 초기화
 	 		1> 클래스 초기화 블럭 static{}
 	 		2> 객체 초기화 블럭 {}
 */
public class Ex3 {
	// 1. 명시적 초기화
	int door = 4;
	
	static int num;
	
	// 2. 생성자를 이용한 초기화
	public Ex3() {
		System.out.println("생성자 초기화");
	}
	
	// 3. 클래스 초기화 블럭
	static {
		num = 10;
		System.out.println("호출 순서 알아보기");
		System.out.println("static{ 클래스 초기화 블럭 }");
	}
	
	// 4. 객체 초기화 블럭
	{
		System.out.println("{객체 초기화 블럭}");
	}
	public static void main(String[] args) {
		
		System.out.println("main 메서드 시작");
		
//		Ex3 ex = new Ex3();
		
		System.out.println("main 메서드 시작");
		
//		Ex3 ex2 = new Ex3();
		
	}
}
