
public class E03 {
	public static void main(String[] args) {
		// 2단부터 9단까지 구구단 출력하기
		int dan;
		int n;
		
		for(dan = 2; dan <= 9; dan++) {
			System.out.println("** " + dan + " 단 **");
			for(n = 1; n <= 9; n++) {
				System.out.println(dan + " X " + n + " = " + dan * n);
			}
		}
		
	}
}
