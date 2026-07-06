
public class F10 {

	public static void main(String[] args) {
		int i;
		int a;
		
		for(a = 1; a < 10; a++) {
			for(i = 1; i <= 10; i++) {
				if(i % 3 == 0) {
					break;			// 가장 가까운 반복문 탈출
				}
				
				System.out.print("	i: " + i);
			}
			System.out.println("	a: " + a);
		}
		
		System.out.println("---------------------------------------------\n");
		
		// 레이블 명 지정
		exit_for:
		for(a = 1; a < 10; a++) {
			for(i = 1; i <= 10; i++) {
				if(i % 3 == 0) {
					break exit_for;		// 레이블 명을 통해 해당 레이블 전체를 벗어남
				}
				
				System.out.print("	i: " + i);
			}
			System.out.println("	a: " + a);
		}
	}
}
