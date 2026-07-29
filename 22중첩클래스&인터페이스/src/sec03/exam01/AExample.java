package sec03.exam01;
// 정적 중첩 클래스

// 바깥 클래스
class A{
	// 내부 클래스
	static class B{
		
	}
	
	B b = new B();
	static B b2 = new B();
	
	
	public A(){
		B bb = new B();
		System.out.println(bb);
	}
	
	void method1() {
		B bb = new B();
		System.out.println(bb);
	}
	
	static void method2() {
		B bb = new B();
		System.out.println(bb);
	}
}


public class AExample {

	public static void main(String[] args) {
		// 정적 중첩 클래스 B는 바깥 클래스 A 객체를 생성하지 않고 객체를 생성 할 수 있음
		A.B b = new A.B();
		
		System.out.println(b);
		
		
	}
}
