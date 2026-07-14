// 반려동물
// 배고픔(0~100): 먹이를 주면 배고픔이 줄어듬, 놀이를 하면 배고픔이 늘어남
class PetTest {
	String name; 		// 이름
	int hunger;			// 배고픔
	
	// 먹이주기 메서드
	void feed(int amount) {
		// 먹은 양이 배고픔보다 크다면
		hunger = hunger - amount < 0 ? 0 : hunger - amount;
		
		System.out.println(name + "는 밥을 먹었다! 배고픔: " + hunger);
		
	}
	// 놀아주기 메서드
	void play(int amount) {
		// 배고픔과 놀아준 합이 100을 넘길 경우
		hunger = hunger + amount > 100 ? 100 : hunger + amount;
		
		System.out.println(name + "는 신나게 놀았다! 배고픔: " + hunger);
	}
	// 상태 확인 메서드
	void checkStatus() {
		// 이름과 배고픔 수치 출력
		System.out.println(name + "의 현재 배고픔: " + hunger);
	}
	
}

// 자바 프로그램을 가동시키는 main 메서드를 포함하는 클래스
public class Main {

	public static void main(String[] args) {
		PetTest pet01 = new PetTest();
		
		pet01.name = "초코";
		pet01.hunger = 50;
		
		pet01.feed(20);
		pet01.feed(50);
		
		pet01.checkStatus();
		
		pet01.play(50);
		pet01.play(70);
		
		pet01.checkStatus();
		
		
	}
}

