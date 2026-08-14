// Stream API 메소드
import java.util.stream.*;
import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		// 1. filter(), collect()
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		List<Integer> newNumber = numbers.stream()						// 리스트를 스트림으로 변환
										.filter(n -> n > 2)				// 2보다 큰 값
										.filter(n -> n % 2 == 0)		// 2의 배수
										.collect(Collectors.toList());	// 스트림을 리스트로 변환
				
		for(int i : newNumber) {
			System.out.println(i);
		}
		
		// 2. map()
		List<String> names = Arrays.asList("Alice", "Bob", "Chrlie");
		
		List<Integer> nameLengths = names.stream()
										.map(s -> s.length())
										.collect(Collectors.toList());
		
		for(int i : nameLengths) {
			System.out.println(i);
		}
		
		
		
	}
}
