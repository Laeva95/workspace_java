
// 자바 프로그램 시작점
public class UnitTest {

	public static void main(String[] args) {
		Marine marine = new Marine("마린");
		
		Zergling zergling = new Zergling("저글링", 80);
		
		Tank tank = new Tank("시즈탱크", 150, 35);
		
		marine.attackEnemy(zergling);
		tank.attackEnemy(zergling);
	}
}
