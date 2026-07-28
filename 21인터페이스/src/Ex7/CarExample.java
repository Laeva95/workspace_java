package Ex7;

interface Vehicle{
	void run();
}

class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}

class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}

class Driver {
	void drive(Vehicle vehicle) {
		System.out.println("운전을 시작합니다.");
		vehicle.run();
	}
}
public class CarExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		
		driver.drive(new Taxi());
		
		
		
	}
}
