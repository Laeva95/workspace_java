package Ex3;

public class MultiIntefaceImplExample {

	public static void main(String[] args) {
		SmartTelevision s = new SmartTelevision();
		Searchable search = s;
		RemoteControl remote = s;
		
		remote.turnOn();
		
		search.search("https://www.naver.com");
		
		remote.turnOff();
		
		// 자신의 것이 아닌 메소드를 호출 할 수 없음
//		remote.search("ss");
//		search.turnOn();
//		search.turnOff();
		
		// 1. 모든 인터페이스를 구현한 구현 클래스로 3개의 메소드 호출 가능
		// 2. 구현 클래스 객체를 저장한 인터페이스 참조 변수들을 다운 캐스팅하여 3개의 메소드 호출 가능
		
	}
}
