package sec07.exam01;

// 부모 클래스
class A{
	int num;
	void print() {
		System.out.println("출력");
	}
	
}


public class CarExample {

	public static void main(String[] args) {
		
		new A() {
			@Override
			void print() {
				System.out.println("익명 객체의 메소드");
			}
		};
		
		
		
	}
}
