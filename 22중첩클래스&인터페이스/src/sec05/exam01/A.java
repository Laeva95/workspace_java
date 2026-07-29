package sec05.exam01;


// 정적 멤버 중첩 클래스는 바깥 객체가 없어도 사용 가능 해야하므로
// 바깥 클래스의 객체 변수와 객체 메소드를 사용 할 수 없음

// 바깥 클래스
public class A {
	// 바깥 클래스 A의 객체 변수와 객체 메소드
	int field1;
	void method1() {
		
	}
	
	// 바깥 클래스 A의 정적 변수와 정적 메소드
	static int field2;
	static void method2() {
		
	}
	
	static class B{
		void method() {
			// 일반 객체 멤버 접근 불가능
//			A.this.field1 = 10;
//			A.this.method1();
			
			// 정적 멤버 접근 가능
			A.field2 = 10;
			A.method2();
		}
	}
	
	
}
