
public class Ex2 {

	public static void main(String[] args) {
		// TV 클래스 변수에 new 키워드를 통해 메모리를 할당
		TV lgTv = new TV();
		
		// 생성한 객체의 변수 값 변경
		lgTv.channel = 7;
		lgTv.power = true;
		lgTv.color = new RGB(255, 255, 255);
		
		// 생성한 객체의 메서드 호출
		lgTv.power();
		lgTv.channelDown();
		
		System.out.println("현재 채널: " + lgTv.channel);
		
		lgTv.channelUp();
		
		System.out.println("현재 채널: " + lgTv.channel);
		
	}
}
/*
 	1. 객체
 	현실 세계의 속성 + 동작을 가진 모든 물건 또는 대상을 의미
 	
 	2. 객체의 구성
 	속성 + 동작 => 필드 + 메서드
 	
 	3. 객체 지향 프로그래밍(OOP)
 	현실 세계에 존재하는 사물과 대상, 그리고 그에 따른 동작을 그대로 실체화시키는 형태의 프로그래밍
 	
*/
// TV를 정의하는 클래스
class TV{
	RGB color;			// 색상 코드값
	boolean power;		// 전원 상태값
	int channel;		// 현재 채널값
	
	// 전원을 켜거나 끄는 메서드
	void power() {
		power = !power;
	}
	
	// 채널을 1 높이는 기능
	void channelUp() {
		channel++;
	}
	
	// 채널을 1 낮추는 기능
	void channelDown() {
		channel--;
	}
}


// TV 색상을 정의하는 RGB 컬러 클래스
class RGB{
	int r;
	int g;
	int b;
	public RGB(int r, int b, int g) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	public int getR() {
		return r;
	}
	public int getG() {
		return g;
	}
	public int getB() {
		return b;
	}
}
