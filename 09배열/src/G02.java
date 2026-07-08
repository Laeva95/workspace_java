
public class G02 {

	public static void main(String[] args) {
		/*
		 * 배열 메모리 생성 방법 2
		 * 
		 * 		자료형[] 변수명 = { 값1, 값2, 값3, 값4, ... };
		 * 		자료형[] 변수명 = new 자료형[]{ 값1, 값2, 값3, 값4, ... };
		 * 
		 * */
		
		// 각 달의 날짜 수를 초기값으로 갖는 배열 메모리 생성
		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		// for문을 통해 모든 배열 요소 출력
		for(int i = 0; i < month.length; i++) {
			System.out.println(i + 1 + " month => " + month[i]);
		}
		
	}
}
