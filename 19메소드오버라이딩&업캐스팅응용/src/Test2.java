// 부모 클래스
class Alphabet{
	public static void printAlphabet(Alphabet alphabet) {
		alphabet.display();
	}
	public void display() {
		System.out.println("I am the parent class:Alphabet");
	}
}

// 자식 클래스 1
class A1 extends Alphabet{
	@Override
	public void display() {
		System.out.println("I am class A1");
	}
}
// 자식 클래스 2
class B1 extends Alphabet{
	@Override
	public void display() {
		System.out.println("I am class B1");
	}
}
// 자식 클래스 3
class C1 extends Alphabet{
	@Override
	public void display() {
		System.out.println("I am class C1");
	}
}


public class Test2 {

	public static void main(String[] args) {
		// 업캐스팅으로 메소드를 호출
		// -> 실제 실행 시 자식 클래스의 메소드 실행됨
		Alphabet.printAlphabet(new A1());
		Alphabet.printAlphabet(new B1());
		Alphabet.printAlphabet(new C1());
		
	}
}
