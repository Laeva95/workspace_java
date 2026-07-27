// 업캐스팅 이해

// 부모클래스
class Parent{
	public void parentPrn() {
		System.out.println("부모 클래스 메서드");
	}
}

// 자식클래스
class Child extends Parent{
	public void childPrn() {
		System.out.println("자식 클래스 메서드");
	}
}

public class Ex2 {

	public static void main(String[] args) {
		// 기본 자료형 형변환
		int a = 10;
		
		long b = 20l;
		
		// 크기가 작은 자료형에 큰 자료형을 저장하려면 강제 형변환이 필요
		a = (int)b;
		b = a;
		
		// 참조 자료형 형변환
		Child c = new Child();
		
		Parent p = new Child();
		
		// 업캐스팅 단점: 부모 클래스의 변수, 메서드에만 접근 가능
		c.childPrn();
//		p.childPrn();
		
		// 업캐스팅의 단점을 보완하기 위해 다운캐스팅 필요
		if(p instanceof Child) {
			((Child) p).childPrn();
		}
	}
}
