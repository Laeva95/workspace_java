
public class For06 {

	public static void main(String[] args) {
		// 1부터 100까지의 숫자 중 소수를 모두 출력하고, 총합 구하기
		int sum = 0;
		int count = 0;
		
		// 1부터 100까지 반복
		for(int i = 2; i <= 100; i++) {
			
			// 소수인지 여부를 저장할 변수
			boolean isPrime = true;
			
			// i가 다른 숫자로 나누어 떨어지는지 확인하기 위해 반복
			// j는 2부터 i / 2까지만 반복
			for(int j = 2; j <= i / 2; j++) {
				// 나누어 떨어지는 값이 있다면 isPrime = false 후 반복문 종료
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			// isPrime = true 라면 i가 소수라는 뜻이므로 출력 후 sum에 더하고, count++;
			if(isPrime) {
				System.out.println(i);
				sum += i;
				count++;
			}
		}
		// 총합, 카운트 출력
		System.out.println("총합: " + sum + ", 카운트: " + count);
	}
}
