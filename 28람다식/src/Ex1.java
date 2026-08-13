import java.util.function.Function;		// apply()
import java.util.function.Predicate;	// test()
import java.util.function.Consumer;		// accept()

// 람다식: 함수형 인터페이스를 구현한 익명 메소드


public class Ex1 {

	public static void main(String[] args) {
		// Function 함수형 인터페이스 구현
		// 제네릭으로 매개변수 타입, 반환 타입 결정
		Function<Integer, String> inToString = (i) -> { return "숫자: " + i; };
		
		// 구현한 람다식 익명 메소드 사용
		// Function.apply()
		System.out.println(inToString.apply(5));
		System.out.println();
		
		// Predicate 함수형 인터페이스 구현
		// 제네릭으로 매개변수 타입 결정
		Predicate<String> isEmpty = t -> t.isEmpty();
		
		// 구현한 람다식 익명 메소드 사용
		// Predicate.isEmpty()
		System.out.println(isEmpty.test(""));
		System.out.println();
		
		// Consumer 함수형 인터페이스 구현
		// 제네릭으로 매개변수 타입 결정
		Consumer<String> print = t -> System.out.println(t);
		
		// 구현한 람다식 익명 메소드 사용
		// Consumer.accept()
		print.accept("Hello, World!");
	}
}
