package ex1;

// 인터페이스
interface RemoteControl{
	// 상수
	// final 생략 가능
	final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	// public abstract 생략 가능
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드
	// 완전한 실행 코드를 가진 default 메소드를 선언하고 구현할 수 있음
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음을 해제합니다.");
			setVolume(MAX_VOLUME);
		}
	}
	
	// 정적 메소드
	static void changeBattery() {
		System.out.println("배터리를 교환합니다.");
	}
	
}

// 인터페이스를 구현 할 클래스
class Television implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV의 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV의 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// 인터페이스 내부의 상수를 이용할 수 있음
		// 전달 받은 볼륨을 최대값, 최소값과 비교하여 사이 값으로 올 수 있도록 변경
		if(volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		} else if(volume < MIN_VOLUME) {
			volume = MIN_VOLUME;
		}
		this.volume = volume;
		System.out.println("현재 Television 객체의 볼륨: " + this.volume);
	}
	
}

class Audio implements RemoteControl{
	private int volume;
	private int memoryVolume;
	@Override
	public void turnOn() {
		System.out.println("Audio의 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio의 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// 인터페이스 내부의 상수를 이용할 수 있음
		// 전달 받은 볼륨을 최대값, 최소값과 비교하여 사이 값으로 올 수 있도록 변경
		if(volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		} else if(volume < MIN_VOLUME) {
			volume = MIN_VOLUME;
		}
		this.volume = volume;
		System.out.println("현재 Audio 객체의 볼륨: " + this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		// 인터페이스의 디폴트 메소드는 반드시 재정의 할 필요는 없지만
		// 필요하다면 구현 클래스에서 재정의 가능함
		if(mute) {
			System.out.println("무음 처리합니다.");
			memoryVolume = volume;
			setVolume(0);
		} else {
			System.out.println("무음을 해제합니다.");
			setVolume(memoryVolume);
		}
	}
	
}

public class RemoteControlExample {

	public static void main(String[] args) {
		// 인터페이스를 구현한 구현 클래스 객체 생성
		RemoteControl rc1 = new Television();
		
		rc1.turnOn();
		rc1.setVolume(5);
		rc1.setVolume(RemoteControl.MAX_VOLUME + 10);
		rc1.turnOff();
		rc1.setMute(true);
		rc1.setMute(false);
		
		RemoteControl rc2 = new Audio();
		
		rc2.turnOn();
		rc2.setVolume(-10);
		rc2.setVolume(8);
		rc2.turnOff();
		rc2.setMute(true);
		rc2.setMute(false);
		
	}
}
