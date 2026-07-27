// 자바의 다형성 중 업캐스팅

// 부모 클래스
class Tv{
	boolean power;
	int channel;
	
	// 전원을 키거나 끄는 메서드
	public void power() {
		power = !power;
	}
	
	// 현재 채널 번호를 1 증가
	public void channelUp() {
		channel++;
	}
	
	// 현재 채널 번호를 1 감소
	public void channelDown() {
		channel--;
	}
}

// 자식 클래스
class CaptionTv extends Tv{
	String text;
	
	// 화면에 자막을 출력
	public void caption() {
		System.out.println("자막 내용을 출력하는 자식 클래스의 기능");
	}
}


public class Ex1 {

	public static void main(String[] args) {
		// 업캐스팅: 부모클래스의 참조 변수 하나만 만들어서 여러 자식객체 메모리의 주소를 저장
		Tv t1 = new CaptionTv();
		
		// 부모클래스의 변수, 메서드에 접근 가능
		t1.power = true;
		t1.channel = 1;
		
		t1.power();
		t1.channelUp();
		t1.channelDown();
		
		// 자식클래스의 변수, 메서드에 직접 접근 불가능
//		t1.text = "캡션TV";
//		t1.caption();
		
		
	}
}
