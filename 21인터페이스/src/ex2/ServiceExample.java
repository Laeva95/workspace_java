package ex2;

interface Service{
	// default 메소드
	// 인터페이스 내부에서 구현되어 구현 클래스에서 호출 가능한 메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1");
		
		// private 메소드 호출 가능
		privateMethod1();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2");
		
		// private 메소드 호출 가능
		privateMethod1();
	}
	
	// private 메소드
	// 인터페이스 내부에서 구현되어 인터페이스 내부에서 호출 가능한 메소드
	private void privateMethod1() {
		System.out.println("privateMethod1");
	}
	
	// static 메소드
	// 인터페이스 내부에서 구현되어 객체를 생성하지 않고 호출 가능한 메소드
	// 내부에서 static 키워드가 아닌 메소드를 호출 할 수 없음
	static void staticMethod1() {
		System.out.println("staticMethod1");
		
		// private static 메소드 호출 가능
		privateStaticMethod1();
	}
	
	// private static 메소드
	// 인터페이스 내부에서 구현되어 객체를 생성하지 않고 인터페이스 내부에서 호출 가능한 메소드
	// 내부에서 static 키워드가 아닌 메소드를 호출 할 수 없음
	private static void privateStaticMethod1() {
		System.out.println("privateStaticMethod1");
	}
	
}

class ServiceIm implements Service{
	// 추상 메소드가 없다면 재정의하지 않아도 됨
}

public class ServiceExample {

	public static void main(String[] args) {
		
		Service s = new ServiceIm();
		
		// default 메소드 호출
		s.defaultMethod1();
		s.defaultMethod2();
		
		// static 메소드 호출
		Service.staticMethod1();
		
		// private 메소드는 호출 할 수 없음
		
	}
}
