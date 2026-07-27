// 메소드 오버라이딩
class DObject{
	public DObject dObject;
	
	public DObject() {
		// 참조 변수를 초기화
		dObject = null;
	}
	
	public void draw() {
		System.out.println("도형을 그린다");
	}
	
}

class Line extends DObject{
	@Override
	public void draw() {
		System.out.println("선을 그린다");
	}
}

class Circle extends DObject{
	@Override
	public void draw() {
		System.out.println("원을 그린다");
	}
}

public class Ex2 {

	public static void main(String[] args) {
		Line line = new Line();
		
		line.draw();					// 오버라이딩 된 메소드 호출
		
		DObject circle = new Circle();
		
		circle.draw();					// 오버라이딩 된 메소드 호출
		
		
		
		
		
	}
}
