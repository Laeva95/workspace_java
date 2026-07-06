
public class E01_1 {

	public static void main(String[] args) {
		// for문과 if문을 사용해서 짝수의 합과 홀수의 합 구하기
		int n;
		int odd_tot, even_tot;	// 홀수의 합과 짝수의 합을 저장할 변수
		
		for(odd_tot = 0, even_tot = 0, n = 1; n <= 10; n++) {
			// n이 2로 나누어 떨어진다면 n은 짝수이므로 even_tot에 더함
			if(n % 2 == 0) {
				even_tot += n;
			}else {
			// n이 2로 나누어 떨어지지 않은다면 n은 홀수이므로 odd_tot에 더함
				odd_tot += n;
			}
		}
		
		System.out.println("odd_tot = " + odd_tot);		// 1 + 3 + 5 + 7 + 9 = 25
		System.out.println("even_tot = " + even_tot);		// 2 + 4 + 6 + 8 + 10 = 30
		
	}
}
