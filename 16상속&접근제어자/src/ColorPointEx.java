// x, y의 한 점을 표현하는 Point 클래스와 이를 상속 받아 점에 색을 추가한 ColorPoint 클래스
class Point{
	// x, y 좌표를 저장할 변수
	private int x, y;
	
	// setter
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// x, y 좌표 출력
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
// Point 클래스를 상속 받는 ColorPoint 클래스
class ColorPoint extends Point{
	// 점의 색을 저장할 변수
	private String color;
	
	// setter
	public void setColor(String color) {
		this.color = color;
	}
	
	// 점의 x, y 좌표와 색상 출력
	public void showColorPoint() {
		System.out.print(color);
		
		// 부모 클래스의 showPoint() 메서드 호출
		super.showPoint();	
	}
}

public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
		
		// 자식 클래스 객체를 생성하면 부모 클래스를 포함해서 생성됨
		
	}
}
