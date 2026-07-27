// 메소드 오버라이딩
// 부모 클래스의 메소드를 자식 클래스에서 재정의하여 사용하는 것
// 자식 클래스에서 부모 클래스와 동일한 이름의 메소드를 정의해서
// 부모 클래스의 기능을 사용하지 않고 자식 클래스만의 기능을 사용하기 위함

class A{
	public void print(int num) {
		System.out.println(num);
	}
}

class B extends A{
	// @Override: 하단의 메소드가 오버라이딩 되었음을 컴파일러에게 알려주는 기호
//	@Override
//	public void print(int num) {
//		System.out.println(num + 1);
//	}
	@Override
	public void print(int num) {
		// TODO Auto-generated method stub
		super.print(num + 1);
	}
	
	public void bInfo() {
		System.out.println("B 자식 클래스의 bInfo 메소드");
	}
	
}

public class Ex1 {

	public static void main(String[] args) {
		// 자식 클래스 객체 생성
		B b = new B();
		
		b.bInfo();
		b.print(10);
		
		// 부모 클래스 객체 생성
		A a = new A();
		a.print(10);
		
	}
}
