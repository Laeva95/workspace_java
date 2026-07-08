
public class G01 {

	public static void main(String[] args) {
		/*
		 * 배열 메모리를 생성하는 문법
		 * 
		 * 		자료형[] 변수명 = new 자료형[배열크기];
		 * 
		 * */
			
		int[] score = new int[5];
		
		score[0] = 95;
		score[1] = 70;
		score[2] = 80;
		score[3] = 75;
		score[4] = 100;
		
		// for 반복문을 통한 배열의 모든 요소 출력
		for(int i = 0; i < score.length; i++){
			System.out.println("score[" + i + "] = " + score[i]);    		// index = 0부터 index = 4까지 모든 요소 출력
		}
		
	}
}
