
class A{
	// A 클래스의 기본 생성자
	public A() {
		System.out.println("A 부모 클래스 생성자 A 실행");
	}
}
class B extends A{
	// B 클래스의 기본 생성자
	public B() {
		System.out.println("B 부모 클래스 생성자 B 실행");
	}
}

class C extends B{
	// C 클래스의 기본 생성자
	public C() {
		System.out.println("C 자식 클래스 생성자 C 실행");
	}
}


public class Ex1 {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c + "생성 완료");
	}
}
