/*
 	변수의 초기화 시기와 실행 순서
 	
 	객체 변수 초기화 순서
 		1. 객체 변수 자료형의 기본값으로 초기화
 		2. 명시적 초기화
 		3. 객체 초기화 블럭
 		4. 생성자
 */
public class Init {

	// 명시적 초기화
	static int cv = 1;
	
	// 객체 초기화 블럭
	{
		System.out.println(cv);
		cv = 2;
		System.out.println(cv);
	}
	
	// 생성자
	public Init() {
		cv = 3;
		System.out.println(cv);
	}
	public static void main(String[] args) {
		Init i = new Init();
		System.out.println(i);
	}
}
