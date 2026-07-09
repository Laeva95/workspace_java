
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
		for(int y = 0; y < score.length; y++) {
			// 한 행의 모든 열 값 출력
			for(int x = 0; x < score[y].length; x++) {
				System.out.print("score[" + y + "][" + x + "] = " + score[y][x] + "\t");
			}
			// 한 행마다 줄바꿈 실행
			System.out.println();
		}
		/*
			== 출력 결과 ==
			score[0][0] = 10	score[0][1] = 90	score[0][2] = 70	
			score[1][0] = 60	score[1][1] = 80	score[1][2] = 65	
			score[2][0] = 55	score[2][1] = 60	score[2][2] = 85	
			score[3][0] = 90	score[3][1] = 75	score[3][2] = 95	
			score[4][0] = 60	score[4][1] = 30	score[4][2] = 80 
		*/
		
	}
}
