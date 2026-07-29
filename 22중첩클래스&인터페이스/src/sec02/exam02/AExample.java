package sec02.exam02;
// 중첩 클래스에서도 변수, 메소드, 생성자 등을 사용 할 수 있음
class A{
	
	// 기본 생성자
	// 자바 컴파일러가 자동으로 추가함
//	public A() {}
	
	// 내부 클래스 작성
	class B{
		int field1 = 1;
		static int field2 = 2;
		
		B(){
			System.out.println("B 생성자 실행됨");
		}
		
		void method1() {
			System.out.println("B method1 실행됨");
		}
		static void method2() {
			System.out.println("B method2 실행됨");
		}
	}
	// 외부 클래스 메소드
	void useB() {
		// 내부 클래스 B 객체 생성 가능
		B b = new B();
		
		// 객체 멤버 사용 가능
		System.out.println(b.field1);
		b.method1();
		
		// 정적 멤버 사용 가능
		System.out.println(B.field2);
		B.method2();
	}
	
	
}

public class AExample {
	public static void main(String[] args) {
		A a = new A();
		
		a.useB();
		
	}
}
