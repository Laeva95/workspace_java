
public class For04 {

	public static void main(String[] args) {
		// 구구단 2단부터 9단까지 출력
		for(int i = 0; i <= 9; i++) {
			
			for(int j = 2; j <= 9; j++) {
				// i가 0이면 현재 단수 출력 후 continue 키워드를 통해 아래 코드를 무시
				// "\t" : 탭 키를 한번 누른 효과로 문자열 줄맞추기에 적합
				if(i == 0) {
					System.out.print("<--" + j + "단-->\t");
					continue;
				}
				
				// i = 현재 단 수, j = 곱할 수
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			}
			// 한줄 줄바꿈
			System.out.println();
		}
		
	}
}
