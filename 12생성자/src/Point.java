
public class Point {
	// x, y 좌표를 변수 값으로 갖는 점 클래스
	int x;
	int y;
	
	
	// 기본 생성자
	// x = 2, y = 2
	public Point() {
		x = 2;
		y = 2;
		System.out.println("[기본 생성자]Point 기본 생성자 호출됨");
	}
	
	// 매개변수 1개 생성자
	public Point(int _x) {
		x = _x;
		y = 0;
	}
	
	// 매개변수 2개 생성자
	public Point(int _x, int _y) {
		x = _x;
		y = _y;
	}
	
	
	// 메서드
	// y 객체 변수 값을 매개 변수로 받아서 변경시키는 메서드
	public void setY(int _y) {
		y = _y;
	}
	
	// y 객체 변수 값을 반환하는 메서드
	public int getY() {
		return y;
	}
	
	// x 객체 변수 값을 매개 변수로 받아서 변경시키는 메서드
	public void setX(int _x) {
		x = _x;
	}
	
	// x 객체 변수 값을 반환하는 메서드
	public int getX() {
		return x;
	}
	
	// 현재 x 객체 변수 값과 y 객체 변수 값을 얻어 출력하는 메서드
	public void printCoordinates() {
		System.out.println("출력 x, y: " + x + ", " + y);
	}
	
	public static void main(String[] args) {
		// 기본 생성자
		Point point01 = new Point();
		
	    //System.out.println("객체 변수 x = " + point01.x);
		System.out.println("객체 변수 x = " + point01.getX());
		
	    //System.out.println("객체 변수 y = " + point01.y);
		System.out.println("객체 변수 y = " + point01.getY());
		
		point01.printCoordinates();
		
		point01.setX(10);
		
		point01.setY(20);
		
		point01.printCoordinates();
		
		System.out.println("========================");
		
		// ==================================================
		
		// 
		
		
	}
}
