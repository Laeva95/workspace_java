class GymMember{
	// 헬스장 회원 정보
	String name;				// 회원 이름
	String membership;			// 회원권 종류
	int ptCount;				// 남은 pt 횟수
	
	// 남은 pt 횟수를 감소시키는 메서드
	void usePT() {
		// 사용량이 0보다 작거나 같으면 무효
		if(ptCount <= 0) {
			System.out.println("남은 pt 횟수가 부족합니다. 추가 결제가 필요합니다.");
		}else {
			// 사용량이 0보다 크다면 1회 차감
			ptCount--;
			System.out.println(name + "님 pt 횟수를 1회 사용합니다. 남은 pt 횟수는 " + ptCount + "회 입니다.");
		}


	}
	// 남은 pt 횟수를 증가시키는 메서드
	void chargePT(int count) {
		// 충전량이 0보다 작거나 같으면 무효
		if(count <= 0)
			return;
		
		// 충전량만큼 더해줌
		ptCount += count;
		System.out.println(name + "님 pt 횟수를 " + count + "회 만큼 충전합니다. 남은 pt 횟수는 " + ptCount + "회 입니다.");
	}
	// 현재 멤버 상태를 출력하는 메서드
	void printStatus() {
		// 이름, 회원권, 남은 pt 횟수 출력
		System.out.println("이름: " + name + " / 회원권: " + membership + " / 남은 pt 횟수: " + ptCount);
	}
	
}
public class GymMemberTest {

	public static void main(String[] args) {
		// 객체 m 생성
		GymMember m = new GymMember();
		
		// 객체 데이터 설정
		m.name = "정우성";
		m.membership = "3개월";
		m.ptCount = 1;
		
		// 객체 메서드 사용
		/*	출력 예시
		 	정우성님 pt 횟수를 1회 사용합니다. 남은 pt 횟수는 0회 입니다.
			남은 pt 횟수가 부족합니다. 추가 결제가 필요합니다.
			정우성님 pt 횟수를 5회 만큼 충전합니다. 남은 pt 횟수는 5회 입니다.
			이름: 정우성 / 회원권: 3개월 / 남은 pt 횟수: 5
		*/
		m.usePT();
		m.usePT();
		m.chargePT(5);
		m.printStatus();
		
	}
}
