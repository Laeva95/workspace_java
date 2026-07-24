// 상속 관계에서 자식 객체 메모리 생성시 매개변수가 작성된 생성자 호출
// 부모 클래스의 기본 생성자 호출

// 부모 클래스
class F {
	// 기본 생성자
	public F() { System.out.println("부모 클래스 F의 기본 생성자"); }
	public F(int x) { System.out.println("부모 클래스 F의 매개 변수 생성자"); }
}
class G extends F{
	public G() {
		// super();
		System.out.println("자식 클래스 G의 기본 생성자 실행됨");
	}
	public G(int x) {
		// super();
		System.out.println("자식 클래스 G의 매개 변수 생성자");
	}
}
public class Ex3 {

	public static void main(String[] args) {
		
		G g = new G(5);
		
		System.out.println(g);
	}
}
