// 추상 클래스
abstract class Phone{
	String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	public abstract void call();
}

class SmartPhone extends Phone{
	public SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void call() {
		System.out.println("전화를 겁니다.");
	}
}


public class PhoneExample {

	public static void main(String[] args) {
		// 추상 클래스를 상속받은 자식 클래스는 객체를 생성할 수 있음
		SmartPhone s = new SmartPhone("철수");
		s.call();
	}
}