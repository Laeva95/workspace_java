// 상속 기능을 사용하지 않고 Poind2D_Before, Point3D_Before 클래스 설계
// 중복되는 기능을 상속으로 해결

// 상속을 사용하지 않은 경우
class Point2D_Before{
	private int x;
	private int y;
	
	// getter, setter
	public int getX() { return x; }
	public int getY() { return y; }
	
	public void setX(int _x) { x = _x; }
	public void setY(int _y) { y = _y; }
	
}
class Point3D_Before{
	private int x;
	private int y;
	private int z;
	
	// getter, setter
	public int getX() { return x; }
	public int getY() { return y; }
	public int getZ() { return z; }
	
	public void setX(int _x) { x = _x; }
	public void setY(int _y) { y = _y; }
	public void setZ(int _z) { z = _z; }
}

class Point2D{
	private int x;
	private int y;
	
	// getter, setter
	public int getX() { return x; }
	public int getY() { return y; }
	
	public void setX(int _x) { x = _x; }
	public void setY(int _y) { y = _y; }
}
class Point3D extends Point2D{
	private int z;
	
	// getter, setter
	public int getZ() { return z; }
	
	public void setZ(int _z) { z = _z; }
}

public class Ex2 {

	public static void main(String[] args) {
		// 상속 받기 전의 클래스 객체 생성
		System.out.println("===== Before =====");
		
		Point3D_Before before = new Point3D_Before();
		
		before.setX(10);
		before.setY(20);
		before.setZ(30);
		
		System.out.println("Before X: " + before.getX() + " , Y: " + before.getY() + " , Z: " + before.getZ());
		
		// 상속 받은 후의 클래스 객체 생성
		System.out.println("===== After =====");
		
		Point3D after = new Point3D();
		
		after.setX(100);
		after.setY(200);
		after.setZ(300);
		
		System.out.println("After X: " + after.getX() + " , Y: " + after.getY() + " , Z: " + after.getZ());
	}
}
