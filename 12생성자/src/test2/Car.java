package test2;
/*
 	생성자 오버로딩
 	
 	매개변수의 개수, 자료형 등을 다르게 설정하여 생성자를 여러 개 작성하는 문법
 	
 	this. : 해당 객체 메모리에 접근함을 의미
 	
 	this(): 자기 자신의 다른 생성자를 호출하는 것을 의미하며, 첫 줄에 작성해야 함
*/
public class Car {
	// 변수 선언
	String company = "현대자동차";		// 자동차 제조사
	String model;					// 자동차 모델
	String color;					// 자동차 색상
	int maxSpeed;					// 자동차 최고 속력
	
	// 생성자 오버로딩
	public Car(String model) {									// 생성자 1
		this(model, "검정색");
	}
	public Car(String model, String color) {					// 생성자 2
		this(model, color, 250);
	}
	public Car(String model, String color, int maxSpeed) {		// 생성자 3
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public static void main(String[] args) {
		Car car01 = new Car("제네시스", "파란색", 300);
		Car car02 = new Car("소나타", "검정색");
		
	}
}
