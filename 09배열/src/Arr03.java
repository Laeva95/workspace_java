
public class Arr03 {

	public static void main(String[] args) {
		
		// 2차원 배열 전체 메모리를 선언한 후 각 칸에 값을 대입하고, 출력하는 프로그램
		
		// 2차원 배열 생성
		int[][] score = new int[5][3];
		
		// 2차원 배열의 행에 대한 열의 위치 칸에 값 저장 문법
		score[0][0] = 10;
		score[0][1] = 90;
		score[0][2] = 70;
		score[1][0] = 60;
		score[1][1] = 80;
		score[1][2] = 65;
		score[2][0] = 55;
		score[2][1] = 60;
		score[2][2] = 85;
		score[3][0] = 90;
		score[3][1] = 75;
		score[3][2] = 95;
		score[4][0] = 60;
		score[4][1] = 30;
		score[4][2] = 80;
		
		// 2중 for 반복문으로 모든 값 출력
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.println("score[" + i + "][" + j + "] = " + score[i][j]);
			}
		}

		
		
		
	}
}
