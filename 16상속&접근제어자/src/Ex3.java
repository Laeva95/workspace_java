// 두 클래스의 상속 관계에서 private 접근 제어자를 지정한 변수 또는 메서드 사용 실습

// 부모 클래스 A
// Object: 모든 클래스의 부모 역할을 하는 클래스
class A /* extends Object */{
	public int p;			// public 접근제어자를 사용하여 어디서든지 접근 가능
	
	private int n;			// private 접근 제어자를 사용하여 같은 클래스에서만 접근 가능
	
	public void setN(int _n) { n = _n; }	// private 변수에 접근하기 위한 setter
	public int getN() { return n; }			// private 변수에 접근하기 위한 getter
	
}

// 자식 클래스 B
// A 클래스의 멤버를 상속 받아 기능을 확장한 자식 클래스
class B extends A{
	//	public int p;			
	//	
	//	private int n;			
	//	
	//	public void setN(int _n) { n = _n; }	
	//	public int getN() { return n; }
	//  a 부모 클래스로부터 상속 받은 변수, 메서드가 눈에 보이지 않지만 실제로 존재함
	
	private int m;
	
	public void setM(int _m) { m = _m; }
	public int getM() { return m; }
	
	// B 객체가 가진 모든 변수 정보를 문자열로 반환
	public String toString() {
		return "m = " + m + ", p = " + p + ", n = " + getN();
	}
	
}

public class Ex3 {
	
	public static void main(String[] args) {

		B b = new B();
		// b.m  -> private 변수 m에 직접 접근할 수 없음
		b.setM(5);
		
		// b.n  -> private 변수 n에 직접 접근할 수 없음
		b.setN(10);
		
		b.p = 15;
		System.out.println(b.toString());
		
		A a = new A();
		a.setN(5);
		a.p = 10;
		
	}
}
