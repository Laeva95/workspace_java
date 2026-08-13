// 함수형 인터페이스 직접 선언 및 구현
// @FunctionalInterface
@FunctionalInterface
interface MathOperation {
	int operation(int a, int b);
}

public class Main {

	public static void main(String[] args) {
		
		// 1. 람다식 없이 생성
		MathOperation add = new MathOperation() {
			@Override
			public int operation(int a, int b) {
				return a + b;
			}
		};
		
		System.out.println(add.operation(10, 20));
		
		// 2. 람다식으로 생성
		MathOperation add2 = (a, b) -> a + b;
		
		System.out.println(add2.operation(10, 20));
		
		
		
	}
}
