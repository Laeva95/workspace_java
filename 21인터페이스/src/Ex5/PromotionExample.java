package Ex5;

// 최상위 부모 인터페이스 A
interface A{
	
}

// A 인터페이스를 구현한 클래스
class B implements A{
	
}

// A 인터페이스를 구현한 클래스
class C implements A{
	
}

// B 클래스를 상속받은 클래스
class D extends B{
	
}

// C 클래스를 상속받은 클래스
class E extends C{
	
}
public class PromotionExample {

	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 부모 인터페이스 자료형의 변수 생성 - 업 캐스팅
		// A가 최상위 인터페이스이므로 업 캐스팅이 가능함
		A a;
		
		a = b;
		a = c;
		a = d;
		a = e;
		
		System.out.println(a);
		
		// 명시적으로 자식 인터페이스 변수에 대입 - 다운 캐스팅
		// 다운 캐스팅은 반드시 명시적으로 이루어져야함
		E e2 = (E)a;
		
		System.out.println(e2);
		
		// 같은 부모 인터페이스를 상속 받더라도 직접 상속 관계가 아니라면 형변환 불가능
		// 명시적으로도 형변환 할 수 없음
//		b = (B)c;
		
	}
}
