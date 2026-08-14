// 람다식을 Stream API에서 활용하여 데이터 필터링 및 변환 예시
import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex2 {

	public static void main(String[] args) {
		
		// [1] 데이터 준비
		// Arrays.asList(): 매개변수로 전달 한 값들을 포함하는 고정 크기의 List 배열 반환
		List<Integer> scores = Arrays.asList(65, 70, 80, 90, 85, 50, 40);
		
		// [2] 문제 목표
		// 60점 이상만 걸러내고 그 점수들의 평균을 계산
		// stream(): 스트림 통로 객체 반환
		Stream<Integer> stream = scores.stream();
		
		// 변환 연산 - IntegerStream 통로를 IntStream 통로로 변환
		// filter(): 매개변수로 익명 메소드를 구현해서 true 값만 반환
		// mapToInt(): IntegerStream 통로와 내부 Integer를 IntStream, int로 변환
		stream = stream.filter(score -> score >= 60);
		IntStream stream2 = stream.mapToInt(score -> score.intValue());
		
		// 결과 산출
		// average(): 스트림의 평균 값을 계산하는 메소드. Optional 객체로 값을 반환
		// orElse(): Optional 객체에 값이 있다면 해당 값을 반환하고 값이 없다면 매개변수를 반환
		double average = stream2.average().orElse(0.0);
		
		System.out.println("60점 이상인 사람들의 평균 점수: " + average);
		
		System.out.println((65+70+80+90+85) / 5);
		
		
		
		
		
	}
}
