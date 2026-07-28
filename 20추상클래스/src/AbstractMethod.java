// 자식들이 가지고 있는 공통 메소드를 추출하여 추상 메소드 작성
abstract class Animal{
	
	// 일반 메소드
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메소드
	public abstract void sound();
}

class Dog extends Animal{
	
	// 부모 클래스의 추상 메소드를 반드시 오버라이딩해야함
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	
	@Override
	public void sound() {
		System.out.println("냐옹");
	}
}

public class AbstractMethod {
	public static void animalSound(Animal animal) {
		animal.sound();
	}

	public static void main(String[] args) {	
		animalSound(new Dog());
		animalSound(new Cat());
	}
}
