package sec07.exam02;

interface RemoteControl{
	void turnOn();
	void turnOff();
}

class Home implements RemoteControl{
	// 익명 구현 객체
	private RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV의 전원을 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV의 전원을 끕니다.");
		}
	};
	
	@Override
	public void turnOn() {
		
	}

	@Override
	public void turnOff() {
		
	}
	
}

public class HomeExample {
	
	public static void main(String[] args) {
		
		
		
	}
}
