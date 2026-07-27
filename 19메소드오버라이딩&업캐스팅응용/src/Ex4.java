class Point2D{
	protected int x = 10;
	protected int y = 20;
}
class Point3D extends Point2D{
	// 부모 클래스와 똑같은 이름의 변수를 선언하면 부모 클래스의 변수가 상속되지 않음
	protected int x = 40;
	protected int y = 50;
	protected int z = 30;
	
	public void print() {
		System.out.println(super.x + ", " + super.y);	// 부모 클래스의 변수에 접근
		System.out.println(x + ", " + y + ", " + z);	// 자식 클래스의 변수에 접근
	}
	
}
public class Ex4 {

	public static void main(String[] args) {
		new Point3D().print();
		
		
		
	}
}
