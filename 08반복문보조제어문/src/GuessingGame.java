// 키보드에서 사용자가 입력을 받기 위한 Scanner 클래스 사용을 위해 불러옴
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// Scanner 객체 생성: 사용자가 키보드로 입력한 값을 읽어 오기 위해 필요한 객체
		Scanner sc = new Scanner(System.in);
		
		// Random 객체 생성: 랜덤 숫자를 생성할 때 사용하는 도구
		Random random = new Random();
		
		// random.nextInt(10): 0 ~ 9까지의 정수 중 하나를 무작위로 생성
		int targetNumber = random.nextInt(10) + 1;	// 1 ~ 10 사이의 무작위 정수
		
		int userNumber = 0;

		System.out.println("숫자 추측 게임에 오신 것을 환영합니다.");
		System.out.println("제가 생각한 1부터 10까지의 숫자 중 하나를 맞춰보세요.");
		
		do {
			System.out.print("예상하시는 숫자를 입력해주세요: ");
			
			// 사용자가 입력한 값을 읽어서 저장함
			userNumber = sc.nextInt();
			
			// 숫자가 큰지 작은지 확인
			if(userNumber < targetNumber) {
				System.out.println("더 큰 수를 입력해주세요.");
			}else if (userNumber > targetNumber) {
				System.out.println("더 작은 수를 입력해주세요.");
			}
			
			// 숫자가 똑같다면 반복문에서 벗어남
			if(userNumber == targetNumber) {
				break;
			}
			
		} while (userNumber != targetNumber);
		
		System.out.println("정답을 맞추셨습니다! 정답: " + targetNumber);
		
		// Scanner 객체 메모리 해제
		sc.close();
	}
}
