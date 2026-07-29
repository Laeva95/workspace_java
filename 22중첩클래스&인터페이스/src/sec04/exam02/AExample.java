package sec04.exam02;

class A{
	A(){
		class B{
			
		}
		// 선언한 로컬 클래스는 즉시 객체 생성 가능
		B b = new B();
		System.out.println(b);
	}
	
	void method() {
		class B{
			
		}
		
		// 선언한 로컬 클래스는 즉시 객체 생성 가능
		B b = new B();
		System.out.println(b);
	}
}

public class AExample {

	public static void main(String[] args) {
		
		
		
		
	}
}
