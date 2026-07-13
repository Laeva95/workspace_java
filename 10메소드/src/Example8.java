import java.util.*;
public class Example8 {

	public static void main(String[] args) {
		int[] arr = {5, 1, 9, 2, 9, 7, 3};
		
		System.out.println(findSecondNum(arr));
	}
	
	// 정수 배열에서 두번째로 큰 값을 찾아 출력하는 기능의 메소드 만들기
	public static int findSecondNum(int[] numbers) {
		// 가장 큰 값과 두번째로 큰 값을 저장할 변수 선언
		int first = numbers[0];
		int second = Integer.MIN_VALUE;			// int 중에 가장 낮은 값을 입력
		
		// nums[i]를 가장 큰 값, 두번째로 큰 값과 비교해서 더 크다면 저장
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] > first) {
				second = first;
				first = numbers[i];
			}
			else if(numbers[i] > second && numbers[i] != first)
				second = numbers[i];
		}
		// 두번째로 큰 값 반환
		return second;
	}
}
