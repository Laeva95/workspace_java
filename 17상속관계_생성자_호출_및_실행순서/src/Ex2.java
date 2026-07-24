class AA{
	public AA() {
		// super();
		System.out.println("AA 부모의 기본 생성자");
	}
	public AA(int x) {
		// super();
		System.out.println("AA 부모의 매개변수 생성자");
	}
}

class BB extends AA{
	public BB() {
		// super();
		System.out.println("BB 자식의 기본 생성자");
	}
	public BB(int x) {
		// super();
		System.out.println("BB 자식의 매개변수 생성자");
	}
}
public class Ex2 {

	public static void main(String[] args) {
		
		BB bb = new BB();
		
		System.out.println(bb);
		
		
	}
}
