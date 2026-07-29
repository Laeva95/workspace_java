package sec02.exam01;

// 바깥 클래스
class A{
	// 중첩 클래스 - 인스턴스 멤버 중첩 클래스
	class B{
		void print() {System.out.println();}
	}
	
	// 멤버에서 중첩 클래스 객체 생성 가능
	B b = new B();
	
	public A(){
		// 생성자 내부에서도 중첩 클래스 객체 생성 가능
		B b = new B();
		b.print();
	}
	
	void method() {
		// 바깥 클래스 메소드 내부에서도 중첩 클래스 객체 생성 가능
		B b = new B();
		b.print();
	}
}

public class AExample {

	public static void main(String[] args) {
		// B 인스턴스 멤버 중첩 클래스에 대한 객체를 A 클래스 외부에서 생성하기
		// A를 먼저 생성한 후 B 생성
		A a = new A();
		
		A.B b = a.new B();		// 반드시 A 객체를 먼저 생성한 뒤, 그 객체 변수를 통해 생성 해야 함
//		A.B b = new A.B();		A 객체를 먼저 생성해야 하기 때문에 불가능
		b.print();
	}
}
