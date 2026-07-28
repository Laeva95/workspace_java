package Ex6;

interface Vehicle{
	void run();
}
class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("Bus가 달립니다.");
	}
	// Bus 객체에만 작성된 객체 메서드
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
public class CastingExample {

	public static void main(String[] args) {
		Vehicle v = new Bus();
		
		// run() 메소드는 부모 인터페이스에서 선언되어 있으므로 호출 가능
		v.run();	// Bus 클래스의 run() 메소드가 호출됨
		
//		v.checkFare(); // 부모 인터페이스에서 선언되지 않은 메소드는 호출 불가능
		
		Bus bus = (Bus)v;
		
		bus.checkFare();	// 강제 형변환을 통한 다운 캐스팅 후 호출 가능
		
	}
}
