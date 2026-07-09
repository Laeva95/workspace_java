
public class Arr04 {

	public static void main(String[] args) {
		
		// 2차원 배열의 행 단위 합과 열 단위 합을 구하기
		int[][] score = {  // 국어  영어  수학
							{  85,  60,  70 },
							{  90,  95,  80 },
							{  75,  80, 100 },
							{  80,  70,  95 },
							{ 100,  65,  80 }
						};
		
		// 과목별 총점을 더해서 저장할 배열 생성
		int[] subject = new int[score[0].length];
		
		// 학생별 총점을 더해서 저장할 배열 생성
		int[] student = new int[score.length];
		
		// 과목을 저장할 배열
		String[] subsName = { "국어", "영어", "수학" };
		
		
		// 과목별 총점 구하기
		for(int x = 0; x < score[0].length; x++) {
			for(int y = 0; y < score.length; y++) {
				// x 열의 모든 값을 더해서 저장
				subject[x] += score[y][x];
			}
			System.out.println(subsName[x] + " 과목 총점 = " + subject[x]);
		}
		
		System.out.println("=========================================");
		
		// 학생별 총점 구하기
		for(int y = 0; y < score.length; y++) {
			for(int x = 0; x < score[y].length; x++) {
				// y행의 모든 값을 더해서 저장
				student[y] += score[y][x];
			}
			System.out.println(y + 1 + "번 학생 총점 = " + student[y]);
		}
		

	}
}
