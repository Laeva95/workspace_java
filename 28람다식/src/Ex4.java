import java.util.stream.*;
import java.util.*;


public class Ex4 {

	public static void main(String[] args) {
		// distinct(): 스트림 통로에서 중복된 요소를 제거함
		List<String> items = Arrays.asList("apple", "banana", "apple", "orange");
		
		List<String> newItems = items.stream()
									.distinct()
									.collect(Collectors.toList());
		
		System.out.println(newItems);
		
		// sorted(): 스트림 통로에 있는 객체들을 오름차순 또는 Comparator 클래스에 따라 정렬
		List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 2);
		
		List<Integer> ascNumbers = numbers.stream()
										.sorted()
										.collect(Collectors.toList());
		List<Integer> descNumbers = numbers.stream()
										.sorted((a, b) -> b - a)
										.collect(Collectors.toList());
		
		System.out.println(ascNumbers);			// 매개변수 없으면 오름차순 정렬
		System.out.println(descNumbers);		// 함수형 인터페이스를 통해 내림차순 정렬
		
	}
}
