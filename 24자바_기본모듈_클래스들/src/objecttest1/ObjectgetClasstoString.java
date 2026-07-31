package objecttest1;

class Point extends Object{
	
	int x, y;
	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
}

class Point2{
	
	int x, y;
	
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


public class ObjectgetClasstoString {

	public static void main(String[] args) {
		
		Point2 q = new Point2(10, 20);
		
		System.out.println("q = " + q.toString());
		
		System.out.println("q = " + q.getClass().getName() + "@" + Integer.toHexString(q.hashCode()));
		
		Point p = new Point();
		
		System.out.println(p.getClass());						// class objecttest1.Point
		System.out.println(p.getClass().getName());				// objecttest1.Point
		System.out.println(p.getClass().getSimpleName());		// Point
		
		p.x = 10;
		p.y = 20;
		
		System.out.println(p.toString());
		System.out.println(p);
		
		Point p2 = new Point(30, 40);
		
		System.out.println(p2);
		
		System.out.println("---------------------------------------------");
		
		// toString() 메소드가 자동으로 호출되는 다른 경우
		// 문자열 + 로 연결할 때
		String s1 = "좌표는 " + p2 + " 입니다";
		
		System.out.println(s1);
		
		// String.valueOf() 메서드 인자값으로 전달 될 때
		System.out.println(String.valueOf(p2));
		
		
	}
}
