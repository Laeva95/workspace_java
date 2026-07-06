
public class E01 {

	public static void main(String[] args) {
		// for문과 if문을 사용해서 짝수의 합과 홀수의 합 구하기
		int n;
		int odd_tot, even_tot;	// 홀수의 합과 짝수의 합을 저장할 변수
		
		for(odd_tot = 0, n = 1; n <= 10; n += 2) {
			odd_tot += n;
		}
		for(even_tot = 0, n = 2; n <= 10; n += 2) {
			even_tot += n;
		}
		
		System.out.println(odd_tot);		// 1 + 3 + 5 + 7 + 9 = 25
		System.out.println(even_tot);		// 2 + 4 + 6 + 8 + 10 = 30
		
		
	}
}
