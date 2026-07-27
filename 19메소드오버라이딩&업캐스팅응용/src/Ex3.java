// 오버라이딩된 부모클래스의 메소드 강제 호출 방법
class AA{
	public void print(int num) {
		System.out.println(num);
	}
}

class BB extends AA{
	@Override
	public void print(int num) {
		System.out.println(num + 1);
		super.print(num);
	}
	
	public void bInfo() {
		System.out.println("BB 클래스의 bInfo 메소드");
	}
}


public class Ex3 {

	public static void main(String[] args) {
		AA aa = new BB();
		
		aa.print(10);
		
		
		
	}
}
