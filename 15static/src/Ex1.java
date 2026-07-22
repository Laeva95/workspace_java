// 멤버 변수
// 클래스 안에 선언된 변수로 객체 변수와 클래스(static) 변수로 나뉨

// *JVM 메모리 3대 핵심 구조
// Method 영역: 클래스 정보, static 변수, 메서드 코드 저장
//				JVM이 바이트 코드를 읽을 때 가장 먼저 데이터가 적재되는 공간
// Stack 영역: 메서드 호출 시 프레임 저장, 지역 변수
//				메서드 호출 시 저장되는 공간이며 후입선출 구조로 되어있음
// Heap 영역: new 객체 생성 시 인스턴스 변수 저장
//			동적으로 생성되는 객체 등이 저장되는 공간. GC의 관리 대상
public class Ex1 {

	// 멤버 변수
	// 1. 객체 변수
	// JVM 메모리 영역 중에서 heap 영역에 올라가는 객체 메모리 내부의 개별적 공간을 가지는 변수
	int x;
	
	// 2. 클래스 변수
	// JVM이 처음 실행될 때 method 영역에 올라가며 객체 메모리를 생성하지 않고 사용할 수 있는 변수
	static int y;
	
	
	// 생성자
	public Ex1(int z) {
		x += z;		
		y += z;		
	}
	
	public static void main(String[] args) {
		Ex1 ex1 = new Ex1(10);
		
		System.out.println("객체 변수 x = " + ex1.x);
		System.out.println("클래스 변수 y = " + Ex1.y);
		
		Ex1 ex2 = new Ex1(10);
		
		System.out.println("객체 변수 x = " + ex2.x);
		System.out.println("클래스 변수 y = " + Ex1.y);
		
		Ex1 ex3 = new Ex1(10);
		
		System.out.println("객체 변수 x = " + ex3.x);
		System.out.println("클래스 변수 y = " + Ex1.y);
		
	}
}
