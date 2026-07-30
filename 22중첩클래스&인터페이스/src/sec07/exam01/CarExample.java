package sec07.exam01;

class Tire{
	public void roll() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}

class Car{
	// 비교용 일반 객체 생성
	private Tire tire1 = new Tire();
	
	// 익명 객체 생성
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명1 객체 타이어가 굴러갑니다.");
		}
	};
	
	public void run1() {
		tire1.roll();
	}
	public void run2() {
		tire2.roll();
	}
	public void run3() {
		new Tire() {
			@Override
			public void roll() {
				System.out.println("익명2 객체 타이어가 굴러갑니다.");
			}
		}.roll();
	}
	public void run4(Tire tire) {
		tire.roll();
	}
}

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		car.run1();
		car.run2();
		car.run3();
		car.run4(new Tire() {
			@Override
			public void roll() {
				System.out.println("익명3 객체 타이어가 굴러갑니다.");
			}
		});
	}
}
