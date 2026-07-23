class AAA{
	
	// 객체 변수
	int num;
	
	// 클래스 변수
	static int staticNum;
	
	// 기본 생성자
	public AAA() {}
	
	// 객체 메서드 1
	public void add(int value) {
		num += value;
		staticNum += value;
	}
	
	// 객체 메서드 2
	public int getNum() {
		return num;
	}
	
	// 객체 메서드 3
	public void setNum(int value) {
		num = value;
		staticNum = value;
	}
	
	// 클래스 메서드 1
	public static void staticAdd(int value) {
//		num += value;	->	객체 변수 num에 접근할 수 없음
		staticNum += value;
	}
	
	// 클래스 메서드 2
	public static int getStaticNum() {
		return staticNum;
	}

	// 클래스 메서드 3
	public static void setStaticNum(int value) {
		staticNum = value;
	}
	
}
public class Ex2 {

	public static void main(String[] args) {
		AAA aaa = new AAA();
		
		AAA.staticNum = 50;
		
		aaa.staticNum = 50;
		
		int result = AAA.getStaticNum();
		
		System.out.println(result);
		
		result = aaa.getStaticNum();
		
		System.out.println(result);
		
		// 객체 변수를 통해 정적 변수와 정적 메소드에 접근할 수 있지만 경고가 발생함
		
		/*
	        1️ 객체 변수 vs 클래스 변수
	           - 객체 변수(num): 객체마다 개별로 존재 (heap 영역)
	           - 클래스 변수(staticNum): 클래스당 하나만 존재 (Method Area)
	
	        2️ 객체 메소드 vs 클래스 메소드
	           - 객체 메소드:
	             ▸ static 키워드가 없음
	             ▸ 객체가 생성되어야 호출 가능
	             ▸ this 사용 가능 (자기 자신의 객체 변수에 접근)
	             ▸ 객체 변수와 클래스 변수 모두 접근 가능
	
	           - 클래스 메소드(static):
	             ▸ static 키워드 있음
	             ▸ 객체 생성 없이 클래스명으로 호출 가능
	             ▸ this 사용 불가능
	             ▸ 클래스 변수(static 변수)만 접근 가능, 객체 변수에는 접근 불가
	
	        3️ 메모리 구조 시각화 요약 (세로 방향 - 최종 상태)
		*/
		
	}
}
