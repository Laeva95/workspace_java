package Ex4;

// 부모 인터페이스 1
interface InterfaceA{
	void methodA();
	default void methodAA() {
		System.out.println("디폴트메소드 실행");
	}
}

// 부모 인터페이스 2
interface InterfaceB{
	void methodB();
}

// 자식 인터페이스
interface InterfaceC extends InterfaceA, InterfaceB{
	void methodC();
}

class InterfaceImpl implements InterfaceC{
	// InterfaceA와 InterfaceB를 상속받은 InterfaceC를 구현하는 클래스
	// methodA, methodB, methodC를 모두 구현해야함
	@Override
	public void methodA() {
		System.out.println("A 실행");
	}

	@Override
	public void methodB() {
		System.out.println("B 실행");
	}

	@Override
	public void methodC() {
		System.out.println("C 실행");
	}
	
}

public class ExtendsExample {

	public static void main(String[] args) {
		InterfaceImpl im = new InterfaceImpl();
		
		im.methodA();
		im.methodB();
		im.methodC();
		
		// 업캐스팅 가능
		InterfaceA imA = im;
	
		imA.methodAA();
		
		
		
	}
}
