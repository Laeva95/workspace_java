
public class Arr01 {

	// main 메소드 기능: 자바 프로그램을 처음 실행하는 기능
	public static void main(String[] args) {
		// 학생 5명의 점수를 초기값으로 갖는 배열 생성
		int[] score = { 95, 70, 80, 75, 100 };
		
		// 점수 합계를 저장할 변수
		int sum = 0;
		
		// 반복문을 통해 점수 합계 저장
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		System.out.println(sum);			// 420
		
		// 평균 구하기
		double avg = sum / score.length;
		
		System.out.println(avg);			// 84.0
		
	}
}
