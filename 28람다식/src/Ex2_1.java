import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Ex2_1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(65, 70, 80, 90, 85, 50, 40);
		
		// list.stream(): List를 Stream으로 변환
		// filter(): Stream의 요소를 조건으로 걸러냄
		// mapToInt(): Stream을 IntStream으로 변환
		// average(): IntStream의 요소 전체 평균을 반환
		// orElse(): IntStream의 요소 중 값이 존재하지 않는 요소가 있을 때 대체 값을 결정
		double average = list.stream()
							 .filter(score -> score >= 60)
							 .mapToInt(score -> score)
							 .average()
							 .orElse(0.0);
		
		System.out.println(average);
	}
}
