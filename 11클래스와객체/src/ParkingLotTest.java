// 주차장 관리를 위한 주차장 설계도
// 총 자리 수와 현재 주차된 차량 수를 가지는 클래스
// 자리가 가득차면 더 이상 주차를 할 수 없고 차가 없으면 출차를 할 수 없음
public class ParkingLotTest {

	// 1. 데이터: 총 자리 수, 현재 주차된 차량 수
	// 클래스 변수 선언
	int totalSpots;
	int currentCars;
	
	// 2. 행동: 입차, 출차, 남은 자리 확인
	// 클래스 메서드 선언
	void enter() {
		// 남은 자리가 있다면 차량 입차 처리
		if(totalSpots == currentCars) {
			System.out.println("만차입니다. 입차 불가.");
		} else {
			currentCars++;
			System.out.println("입차 완료! 남은 자리: " + (totalSpots - currentCars) + "자리");
		}
		
	}
	void exit() {
		// 남은 차량이 있다면 차량 출차 처리
		if (currentCars <= 0) {
			System.out.println("주차된 차량이 없습니다.");
		} else {
			currentCars--;
			System.out.println("출차 완료! 남은 자리: " + (totalSpots - currentCars) + "자리");
		}
	}
	void checkAvailable() {
		// 남은 자리수를 출력하는 기능
		System.out.println("현재 남은 자리: " + (totalSpots - currentCars) + " / 총 " + totalSpots + "자리");
	}
	
	
	public static void main(String[] args) {
		ParkingLotTest p = new ParkingLotTest();
		
		// 변수 설정
		p.totalSpots = 2;
		p.currentCars = 0;
		
		/*
		 출력 예시
		 	입차 완료! 남은 자리: 1자리
			입차 완료! 남은 자리: 0자리
			만차입니다. 입차 불가.
			현재 남은 자리: 0 / 총 2자리
			출차 완료! 남은 자리: 1자리
			현재 남은 자리: 1 / 총 2자리
		 */
		p.enter();
		p.enter();
		p.enter();
		p.checkAvailable();
		p.exit();
		p.checkAvailable();
		
	}

	
	
}
