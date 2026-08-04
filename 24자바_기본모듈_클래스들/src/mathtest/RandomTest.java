package mathtest;

import java.util.Random;
import java.util.Arrays;

public class RandomTest {

	public static void main(String[] args) {
		// 1. 랜덤 객체 생성
		Random ran = new Random(5);
		
		// 2. 번호를 담을 배열 생성
		int[] selectNumber = new int[6];
		
		// 3. 화면에 "선택한 번호" 안내 문구 출력
		System.out.print("선택한 번호: ");
		
		// 4. 로또 번호 6개를 랜덤으로 생성해서 배열에 저장
		for(int i = 0; i < selectNumber.length; i++) {
			selectNumber[i] = ran.nextInt(45) + 1;
		}
		
		// 생성한 번호를 오름차순 정렬 후 출력
		Arrays.sort(selectNumber);
		
		for(int num : selectNumber) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		// 5. 당첨 번호를 저장할 또 다른 배열 생성
		int[] winningNumber = new int[6];
		
		// 6. 랜덤 객체 생성
		Random ran2 = new Random(3);
		
		// 7. 화면에 "당첨 번호" 안내 문구 출력
		System.out.print("당첨 번호: ");
		
		// 8. 당첨 번호 6개를 랜덤으로 생성해서 배열에 저장
		for(int i = 0; i < winningNumber.length; i++) {
			winningNumber[i] = ran2.nextInt(45) + 1;
		}
		
		// 생성한 번호를 오름차순 정렬 후 출력
		Arrays.sort(winningNumber);

		for(int num : winningNumber) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		System.out.println("두 배열의 값이 같은가? " + Arrays.equals(selectNumber, winningNumber));
		
	}
}
