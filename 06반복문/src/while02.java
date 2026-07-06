
public class while02 {

	public static void main(String[] args) {
		// 1부터 10 사이의 짝수의 합 구하기
		
		// 초기식 count, 합을 저장할 sum 변수
		int count = 0;
		int sum = 0;
		
		// count가 10 이하일때 반복 실행
		while(count <= 8) {
			// count 2 증가
			count += 2;
			
			// 0부터 2씩 증가한 값들 저장
			sum += count;
		}
		
		System.out.println("sum = " + sum);
	}
}
