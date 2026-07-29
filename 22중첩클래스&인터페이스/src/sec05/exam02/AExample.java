package sec05.exam02;

// 중첩 클래스 내부에서 바깥 클래스 객체 메모리에 접근
// 바깥 클래스
class A{
	// A 클래스의 객체 멤버
	String field = "A-Field";
	void method() {System.out.println("A-Method");}
	
	// 내부 클래스
	class B{
		// B 클래스의 객체 멤버
		String field = "B-Field";
		void method() {System.out.println("B-Method");}
		
		// 바깥 클래스, 내부 클래스의 객체 멤버 접근
		void print() {
			System.out.println(A.this.field);
			System.out.println(this.field);
			
			A.this.method();
			this.method();
		}
	}
	
	void useB() {
		B b = new B();
		b.print();
	}
}

public class AExample {

	public static void main(String[] args) {
		
		A a = new A();
		a.useB();
		
		
	}
}
