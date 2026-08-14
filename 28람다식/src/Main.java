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
		
		System.out.println(add.operation(8, 3));
		
		// 2. 람다식으로 생성
		MathOperation add2 = (a, b) -> a + b;
		
		System.out.println(add2.operation(8, 3));
		
		MathOperation substract = (a, b) -> a - b;
		
		System.out.println(substract.operation(8, 3));
		
		MathOperation multiply = (a, b) -> a * b;
		
		System.out.println(multiply.operation(8, 3));
		
		// 0 으로 나눌 수 없기 때문에 조건문으로 검사
		MathOperation divide = (a, b) -> {
			if(b == 0)  
				return throwException();
			else
				return a / b;
			};
		MathOperation divide2 = (a, b) -> b == 0 ? Main.throwException() : a / b;
		
		System.out.println(divide.operation(8, 3));
		System.out.println(divide.operation(8, 0));
		
	}
	static int throwException() {
		throw new ArithmeticException("0으로 나눌 수 없습니다.");
	}
}
