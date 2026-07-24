package pb;		// 현재 클래스가 포함된 패키지 경로
import pa.A;	// 다른 패키지의 클래스를 사용하기 위한 명령어

// A 클래스를 상속받는 B 클래스
public class B extends A {
	
	void set() {
		// i = 1;  	// -> default 접근 제어자에 접근 할 수 없음
		
		pro = 2; 	// -> protected 접근 제어자에 접근 할 수 있음
		
		// pri = 3; // -> private 접근 제어자에 접근 할 수 없음
		
		pub = 4;	// -> public 접근 제어자에 접근 할 수 있음
		
	}
	
	public static void main(String[] args) {
		B b = new B();
		
		b.set();
		b.print();

	}
}
