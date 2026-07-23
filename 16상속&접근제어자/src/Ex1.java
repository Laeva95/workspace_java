// 부모 클래스를 상속 받는 자식 클래스를 정의하는 예
class Parent{
	public void parentPrn() {
		System.out.println("Parent 부모 클래스의 메서드는 상속됨");
	}
}

// extends 클래스명: 해당 클래스를 상속 받음을 명시
class Child extends Parent{
	
	// 자식 클래스의 고유 메서드
	public void childPrn() {
		System.out.println("Child 자식 클래스의 메서드는 Parent 부모 클래스에서 사용할 수 없음");
	}
}

public class Ex1 {

	public static void main(String[] args) {
		Child c = new Child();
		
		// 부모 클래스의 메서드 호출 가능
		c.parentPrn();
		c.childPrn();
		
		Parent p = new Parent();
		
		p.parentPrn();
//		p.childPrn();	-> 자식 클래스의 메서드 호출 불가능
		
	}
}
