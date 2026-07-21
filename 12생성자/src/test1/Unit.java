package test1;

// 스타크래프트
// 마린, 저글링, 탱크

public class Unit {

	// 클래스 변수
	String name;
	int hp;
	int damage;
	
	// 생성자
	public Unit(String name) {
		this(name, 100, 10);
	}
	public Unit(String name, int hp) {
		this(name, hp, 10);
	}
	public Unit(String name, int hp, int damage) {
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}
	
	// 클래스 메서드
	public void attack(Unit target) {
		if(hp <= 0) {
			System.out.println(name + "은(는) 공격할 수 없는 상태입니다.");
			return;
		}
		if(target.hp <= 0) {
			System.out.println(target.name + "을(를) 공격할 수 없는 상태입니다.");
			return;
		}
		// 공격 받은 유닛의 hp를 공격한 유닛의 damage만큼 감소
		target.hp -= damage;
	
		System.out.println(name + "이(가) " + target.name + "을(를) 공격합니다. 공격력: " + damage);
		
		System.out.println(target.name + "의 hp: " + target.hp);
			
		// 공격 받은 유닛의 체력이 0 이하가 되었다면 사망 처리
		if(target.hp <= 0) {
			target.hp = 0;
			System.out.println(target.name + "이(가) 파괴되었습니다.");
		}
	}
	public void status() {
		System.out.println("[유닛 상태] 이름: " + name + ", hp: " + hp + ", damage: " + damage);
	}
	
	
	public static void main(String[] args) {
		Unit marine = new Unit("마린");
		Unit zergling = new Unit("저글링", 80);
		Unit tank = new Unit("시즈탱크", 150, 35);
		
		marine.status();
		zergling.status();
		tank.status();
		
		System.out.println();
		
		marine.attack(zergling);
		zergling.attack(marine);
		
		System.out.println();
		
		tank.attack(zergling);
		tank.attack(zergling);
		
		tank.attack(marine);
		tank.attack(marine);
		tank.attack(marine);
		
		marine.status();
		zergling.status();
		tank.status();
		
	}
}
