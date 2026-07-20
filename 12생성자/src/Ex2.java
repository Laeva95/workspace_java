/*
 	생성자(Constructor)
 	클래스가 객체로 생성될 때 자동으로 호출되는 특별한 메서드
 	생성하는 객체 메모리의 객체 변수 값들을 빠르게 초기화하는 역할
 	
 	
 	생성자 문법
 	public 클래스명(){
 		초기화 내용
 	}
 	반환 타입을 작성하지 않으며, 클래스명과 동일한 이름으로 작성해야 함
 	매개변수의 종류가 개수에 따라 여러 생성자를 작성할 수 있음
 	
 	
 	생성자 특징
 	클래스명과 동일한 이름을 가져야함
 	반환 타입을 작성하면 안됨
 	new 클래스명()을 통해 객체를 생성할 때 자동으로 호출됨
 	생성자는 매개 변수를 하나 이상 가질 수 있고, 하나도 갖지 않을 수 있음
 	
 	
 	생성자 종류
 	기본 생성자: 매개 변수 없이 변수 값을 초기화하는 생성자
 	매개 변수가 작성된 생성자: 객체를 만들 때 객체 변수들의 초기값을 직접 저장
 */

// 클래스 생성
class Car{
	
	// 클래스 변수 정의
	String brand;
	int speed;
	
	// 생성자 정의
	public Car() {
		// 클래스 변수 초기화
		brand = "미정";
		speed = 0;
	}
	public Car(String brand, int speed) {
		// 클래스 변수 초기화
		this.brand = brand;
		this.speed = speed;
	}
	
	// 클래스 메서드 정의
	
	
}


public class Ex2 {

	public static void main(String[] args) {
		Car car01 = new Car();				// 생성자 1을 사용
		
		System.out.println(car01.brand);	// 출력: "미정"		
		System.out.println(car01.speed);	// 출력: 0	
		
		Car car02 = new Car("BMW", 120);	// 생성자 2를 사용
		
		System.out.println(car02.brand);	// 출력: "BMW"
		System.out.println(car02.speed);	// 출력: 100
		
	}
}
