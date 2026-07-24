// 부모 클래스
class AA{
	int i; 				// 접근 제어자를 작성하지 않으면 default 취급
	
	protected int pro;	// protected: 같은 패키지와 상속 받은 자식 클래스에서 접근 가능
	
	public int pub;		// public: 같은 패키지와 다른 패키지 모든 곳에서 접근 가능
	
	private int pri;	// private: 같은 클래스 내에서만 접근 가능
	
	public int getPri() { return pri; }				// getter
	public void setPri(int _pri) { pri = _pri; }	// setter
	
}

// 자식 클래스
class BB extends AA{
	/*
	 	AA 클래스의 변수, 메서드
	 	int i
	 	protected int pro;
	 	public int pub;
	 	private int pri;
	 	public int getPri() { return pri; }
	 	public void setPri(int _pri) { pri = _pri; }
	 */
	
	// BB 클래스만의 변수, 메서드
	void set() {
		i = 1;
		pro = 2;
		pub = 3;		// default, protected, public 접근 제어자 변수에 접근 가능
		
		// pri = 4;		// private 접근 제어자 변수에는 접근 할 수 없음
		setPri(4);		// setter 통해서 접근



}
	String get() {
		return i + ", " + pro + ", " + pub + ", " + getPri();
	}
}

public class Ex4 {

	public static void main(String[] args) {
		BB bb = new BB();
		
		// 변수에 값 저장
		bb.set();
		
		// 변수에 저장된 값 문자열로 출력
		System.out.println(bb.get());
		
	}
}
