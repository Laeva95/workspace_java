
public class Car {
	String brand;				// 자동차의 브랜드를 저장할 변수
	String color;				// 자동차의 색상을 저장할 변수
	int currentSpeed;			// 자동차의 현재 속도를 저장할 변수
	int maxSpeed; 				// 자동차의 최대 속도를 저장할 변수
	
	// 차의 속도를 증가시키는 메서드
	void accelerate(int speed) {
		currentSpeed += speed;
		// 속도가 최고 속도를 넘겼다면 최고 속도로 설정
		if(currentSpeed > maxSpeed)
			currentSpeed = maxSpeed;
		
		System.out.println("현재 속도: " + currentSpeed);
	}
	
	// 차의 속도를 감소시키는 메서드
	void breaks(int speed) {
		currentSpeed -= speed;
		// 속도가 0보다 낮아졌다면 0으로 설정
		if(currentSpeed < 0)
			currentSpeed = 0;
		
		System.out.println("현재 속도: " + currentSpeed);
	}

	public static void main(String[] args) {
		// Hyundai 자동차 메모리 할당
		Car hyundai = new Car();
		
		// 기본 변수 설정
		hyundai.brand = "Hyundai";
		hyundai.color = "Red";
		hyundai.currentSpeed = 0;
		hyundai.maxSpeed = 100;
		
		// 속도 10 증가
		hyundai.accelerate(10);
		
		// 속도 10 감소
		hyundai.breaks(10);
		
		// ======================================================
		
		// Kia 자동차 메모리 할당
		Car kia = new Car();
		
		// 기본 변수 설정
		kia.brand = "Kia";
		kia.color = "Black";
		kia.currentSpeed = 0;
		kia.maxSpeed = 150;
		
		// 속도 10 증가
		kia.accelerate(10);
		
		// 속도 10 감소
		kia.breaks(10);

	}
}

