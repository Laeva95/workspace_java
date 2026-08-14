import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Ex5 {

	public static void main(String[] args) {
		/*
			스트림
				일반 스트림: 디스크의 파일이나 키보드처럼 프로그램 밖과 데이터를 주고 받는 통로
				데이터 스트림: 메모리에 있는 배열, 컬렉션 객체들이 흘러가는 통로
		*/
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		// Integer 데이터를 읽어 들일 데이터 스트림 생성
		Stream<Integer> stream = numbers.stream();
		
		// filter() 메소드를 이용해서 조건식이 참인 요소들만 추출해서 stream 에 저장
		stream = stream.filter(num -> num % 2 == 0);	
		
		// collect() 메소드를 이용해서 새로운 리스트를 생성해서 새로운 변수에 저장
		List<Integer> evenNumbers = stream.collect(Collectors.toList());
		
		System.out.println(evenNumbers.toString());
		
		List<Integer> evenNumbers2 = numbers.stream()
											.filter(num -> num % 2 == 0)
											.collect(Collectors.toList());
		
		
	}
}
