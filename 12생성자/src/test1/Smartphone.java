package test1;

public class Smartphone {
	// 클래스 변수
	String brand;			// 브랜드
	String model;			// 모델
	int batteryCapacity;	// 배터리 용량
	
	
	// 생성자
	public Smartphone(String model) {
		// this() 메서드를 사용해 생성자 호출
		this("삼성", model);
	}
	public Smartphone(String brand, String model) {
		// this() 메서드를 사용해 생성자 호출
		this(brand, model, 4000);
	}
	public Smartphone(String brand, String model, int batteryCapacity) {
		// this 키워드를 사용해서 객체 메모리의 변수 값 초기화
		this.brand = brand;
		this.model = model;
		this.batteryCapacity = batteryCapacity;
	}
	
	
	public static void main(String[] args) {
		
		Smartphone phone01 = new Smartphone("갤럭시 S24");
		System.out.println(phone01.brand + ", " + phone01.model + ", " + phone01.batteryCapacity + "mAh");
		
		Smartphone phone02 = new Smartphone("애플", "아이폰 15");
		System.out.println(phone02.brand + ", " + phone02.model + ", " + phone02.batteryCapacity + "mAh");
		
		Smartphone phone03 = new Smartphone("구글", "픽셀", 4000);
		System.out.println(phone03.brand + ", " + phone03.model + ", " + phone03.batteryCapacity + "mAh");
	}
}
