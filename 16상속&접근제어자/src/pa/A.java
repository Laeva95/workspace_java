// 부모 A 클래스와 자식 B 클래스가
// 서로 다른 패키지에 위치하고 있을 경우 접근 제어자 확인

package pa;

public class A {
	// 접근 제어자 종류에 따른 변수 선언
	int i;
	protected int pro;
	private int pri;
	public int pub;
	
	// public 메서드 선언
	public void print() {
		System.out.print(i + ", " + pro + ", " + pri + ", " + pub);
	}
}
	