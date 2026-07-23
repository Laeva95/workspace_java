// 변수 초기화와 지역 변수
public class InitTest {

	// 객체 변수
	int x;
	int y = x;		// x = 0 기본값으로 초기화되어 사용가능
	
	
	// 객체 메서드
	public void method1(int _y) {
		// 지역 변수
		// {} 중괄호 블럭 내부에서 선언된 변수
		// JVM의 스택 영역에 포함되며, 해당 메서드 실행 중에만 유효
		// 지역변수는 반드시 명시적 초기화 이후 사용가능
//		int i;
		
//		int j = i;	// i가 초기화되지 않아 사용 불가능. 에러 발생
	}
	
	// 클래스 변수
	// 명시적 초기화 가능
	static int[] arr = new int[10];
	
	static {
		// arr 배열의 각 칸을 1 ~ 10 사이의 랜덤 값으로 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
	}
	
	public static void main(String[] args) {
		// 객체 생성 없이 클래스 변수 arr 사용
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
