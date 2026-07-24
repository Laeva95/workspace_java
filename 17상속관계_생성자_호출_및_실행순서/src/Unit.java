
// 부모 클래스
public class Unit {
	// 객체 변수
	String name;
	int hp;
	int damage;
	
	// 이름, 체력, 공격력을 초기화하는 생성자
	public Unit(String name, int hp, int damage) {
		super();
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}
	// 이름, 체력을 초기화하는 생성자
	public Unit(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
		this.damage = 10;
	}
	// 이름을 초기화하는 생성자
	public Unit(String name) {
		super();
		this.name = name;
		this.hp = 100;
		this.damage = 10;
	}
	
	// 객체 메서드
	// 상대 유닛을 공격하는 메서드
	public void attackEnemy(Unit target) {
		// 상대 유닛의 체력이 0이하라면 공격 할 수 없음
		if(this.hp <= 0) {
			System.out.println(name + "은(는) 이미 파괴되어 공격 할 수 없습니다.");
			return;
		}
		// 현재 유닛의 체력이 0이하라면 공격 할 수 없음
		if(target.hp <= 0) {
			System.out.println(target.name + "은(는) 이미 파되되었습니다.");
			return;
		}
		
		// 상대 유닛을 공격하여 현재 유닛 공격력만큼 체력 차감
		target.hp -= damage;
		System.out.println(name + "이(가) " + target.name + "을(를) 공격합니다! (공격력: " + damage + ")");
		
		// 공격 받은 상대 유닛의 체력이 0이하가 되었다면 체력을 0으로 고정하고 파괴 메세지 출력
		if(target.hp <= 0) {
			target.hp = 0;
			System.out.println(target.name + "이(가) 파괴되었습니다.");
		}
	}
	
	// 현재 유닛의 상태를 출력하는 메서드
	public void status() {
		System.out.println("[유닛 상태] " + name + " - 체력: " + hp + ", 공격력: " + damage);
	}
}
