
// 날짜 정보를 저장하기 위한 클래스
class MyDate{
	
	int year = 2016;
	int month = 1;
	int day = 5;
	
}
public class Ex4 {

	public static void main(String[] args) {
		// 참조 자료형의 역할
		// 생성된 객체 메모리의 주소 번지를 기억해서 사용함
		
		// MyDate 타입의 객체 메모리 주소만 저장 가능
		MyDate d;
		d = new MyDate();
		
		// d와 같은 메모리 주소를 참조하는 t 변수 선언
		MyDate t;
		
		t = d;
		
		// 값 확인
		System.out.println("객체 메모리의 참조 변수로 접근한 객체 메모리의 객체 변수 값");
		System.out.println(d.year + "/" + d.month + "/" + d.day);
		System.out.println(t.year + "/" + t.month + "/" + t.day);
		
		// t 변수를 통해 값 변경
		t.year = 2001;
		t.month = 7;
		t.day = 9;
		
		// 값 확인
		System.out.println("객체 메모리의 참조 변수로 접근한 객체 메모리의 객체 변수 값");
		System.out.println(d.year + "/" + d.month + "/" + d.day);
		System.out.println(t.year + "/" + t.month + "/" + t.day);
		
		// 결론
		// => 두 변수가 같은 주소를 참조하고 있기 때문에 하나의 변수를 통해 값을 변경해도
		// 두 변수에서 모두 값이 바뀐 것을 확인할 수 있음
		
		
		int x;
		x = 7;
		
		int y;
		y = x;
		
		// x와 y 모두 7이 저장됨
		System.out.println("기본 자료형의 변수 값 출력");
		System.out.println("x => " + x);
		System.out.println("y => " + y);
		
		// y 변수 값 변경
		y = 20;
		
		// 값 확인
		System.out.println("x => " + x);
		System.out.println("y => " + y);
		
		// 결론
		// => 값을 변경한 y의 값만 변경되고 x의 값에는 영향을 주지 않음
		
	}
}
