
public class Example3 {

	public static void main(String[] args) {
		
		greet();		// 출력: 안녕하세요
		for(int i = 0; i < 10; i++) {
			greet();	// 출력: 안녕하세요 * 10
		}
		
		
	}
	
	// 반환값과 매개변수가 없는 메서드
	public static void greet() {
		System.out.println("안녕하세요");
	}
	
}
