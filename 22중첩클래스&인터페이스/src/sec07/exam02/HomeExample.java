package sec07.exam02;

interface RemoteControl{
	void turnOn();
	void turnOff();
}

class Home implements RemoteControl{
	// 익명 구현 객체
	// [1] 전역 변수
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
	
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	public void use2() {
		// [2] 지역 변수
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("에어컨의 전원을 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("에어컨의 전원을 끕니다.");
			}
		};
		
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
}

public class HomeExample {
	
	public static void main(String[] args) {
		
		Home home = new Home();
		
		home.use1();
		
		home.use2();
		
		// [3] 매개 변수
		home.use3(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("보일러의 전원을 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("보일러의 전원을 끕니다.");
			}
		});
		
	}
}
