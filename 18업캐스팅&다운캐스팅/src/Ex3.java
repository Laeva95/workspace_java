// 업캐스팅 단점 보완 -> 다운캐스팅
class A{
	int a, b;
}
class B extends A{
	int c;
}


public class Ex3 {

	public static void main(String[] args) {
		// 업캐스팅으로 참조 변수 생성
		A r = new B();
		
		r.a = 10;
		r.b = 20;
//		r.c = 30;
		
		// 다운캐스팅을 통해 자식클래스에 접근 가능
		if(r instanceof B) {
			B b = (B)r;
			b.c = 30;
			b.a = 100;
		}
	}
}
