// 자동차는 현재 속도와 남은 연료를 변수로 가짐
// 가속하면 속도가 오르고 연료가 줄어든다
// 연료가 부족하면 가속할 수 없음

// 현실의 자동차 객체 모델링

public class CarTest {
	String model;					// 자동차 모델
	double speed;					// 자동차 현재 속도
	double fuel;					// 자동차 남은 연료
	
	// 자동차 가속 메서드
	void accelerate(double amount) {
		// 사용량이 남은 연료보다 크다면 가속 실패
		if(amount > fuel)
			System.out.println("연료 부족! 가속 실패.");
		else {
			// 남은 연료가 충분하다면 속도 증가, 연료 감소, 속도 증가량 및 현재 속도 출력
			speed += amount * 10;
			fuel -= amount;
			System.out.println("속도 " + (amount * 10) + " 증가, 현재 속도: " + speed);
		}
	}
	
	// 자동차 상태 확인 메서드
	void checkStatus() {
		System.out.println("모델: " + model + " / 속도: " + speed + "km/h / 남은 연료: " + fuel + "L");
	}
	
	
	
	public static void main(String[] args) {
		
		// 객체 생성
		CarTest car = new CarTest();
		
		// 객체 데이터 저장
		car.model = "아반떼";
		car.speed = 0;
		car.fuel = 5.0;
		
		// 객체 메소드 호출
		car.accelerate(2);
		
		car.checkStatus();
		
		car.accelerate(3.1);
		
		car.accelerate(3);
		
		car.checkStatus();
		
		
	}
}
