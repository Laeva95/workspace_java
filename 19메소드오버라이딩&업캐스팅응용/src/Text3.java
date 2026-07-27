// 업캐스팅과 다운캐스팅을 하는 이유

class Character{
	// 모든 캐릭터의 공격하는 행동
	public void attack() {
		System.out.println("공격한다.");
	}
}

class Warrior extends Character{
	@Override
	public void attack() {
		System.out.println("검으로 공격한다.");
	}
	// 방어 기능의 행동
	public void raiseShield() {
		System.out.println("방패를 올린다.");
	}
}

class Mage extends Character{
	@Override
	public void attack() {
		System.out.println("마법으로 공격한다.");
	}
	// 주문을 시전하는 행동
	public void castSpell() {
		System.out.println("마법을 시전한다.");
	}
}

// 게임 흐름을 관리하는 시스템 클래스
class GameSystem{
	public void play(Character character) {
		character.attack();

		// 다운 캐스팅을 이용해 자식 클래스의 메소드 사용
		if(character instanceof Warrior) {
			Warrior w = (Warrior)character;
			w.raiseShield();
		}
		if(character instanceof Mage) {
			Mage m = (Mage)character;
			m.castSpell();
		}
	}
}

public class Text3 {

	public static void main(String[] args) {
		GameSystem game = new GameSystem();
		
		Character c = new Warrior();	
		
		game.play(c);				// Warrior 클래스의 메소드 실행
		
		c = new Mage();
		
		game.play(c);				// Mage 클래스의 메소드 실행
		
		
	}
}
