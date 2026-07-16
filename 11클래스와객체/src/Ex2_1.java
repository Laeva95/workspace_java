
// 원 객체들을 모델링
class Circle{
	
// 색, 반지름
	double radius;
	
// 반지름을 설정하는 기능
	void setRadius(double newRadius) {
		radius = newRadius;
	}
// 원의 면적을 구하는 기능	
	double calculateArea() {
		return radius * radius * 3.14;
	}
	
}

public class Ex2_1 {

	public static void main(String[] args) {
		
		// 객체 메모리 생성
		Circle circle = new Circle();
		
		// setRadius() 메서드를 통해 radius 값 변경
		circle.setRadius(5);
		
		System.out.println(circle.radius);				// 출력: 5.0
		
		// calculateArea() 메서드를 통해 원의 넓이 값 구하기
		System.out.println(circle.calculateArea());
		
		// 새로운 객체 메모리 생성
		Circle circle2 = new Circle();
		
		// setRadius() 메서드를 통해 radius 값 변경
		circle2.setRadius(3);
		
		System.out.println(circle2.radius);				// 출력: 3.0
		
		// calculateArea() 메서드를 통해 원의 넓이 값 구하기
		System.out.println(circle2.calculateArea());
		
	}
}
