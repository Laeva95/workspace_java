// Super 클래스 작성
class Super{
	// public 접근제어자 사용
	// 4바이트 크기의 정수를 저장할 num1 변수 선언 후 10 저장
	public int num1 = 10;
	
	// protected 접근제어자 사용
	// 4바이트 크기의 정수를 저장할 num2 변수 선언 후 20 저장
	protected int num2 = 20;
	
	// default 접근제어자 사용
	// 4바이트 크기의 정수를 저장할 num3 변수 선언 후 30 저장
	int num3 = 30;
	
	// private 접근제어자 사용
	// 4바이트 크기의 정수를 저장할 num4 변수 선언 후 40 저장
	private int num4 = 40;
	
	// public 접근제어자 사용
	// num4 변수에 저장된 40을 반환하는 getNum4 메서드 선언
	public int getNum4() {
		return num4;
	}
	
	// public 접근제어자 사용
	// num3 변수에 저장된 30을 반환하는 getNum3 메서드 선언
	public int getNum3() {
		return num3;
	}
}

// Sub 클래스 작성
class Sub extends Super{
	// private 접근제어자 사용
	// 4바이트 크기의 정수를 저장시킬 num5 변수 선언
	private int num5;
	
	// public 접근제어자 사용
	// num1, num2, num3, num4, num5 변수에 저장된 값들을 각각 얻어 출력 후 줄바꿈하는
	// 기능의 print 메서드 선언
	public void print() {
		System.out.println("num1 = " + super.num1);
		System.out.println("num2 = " + super.num2);
		System.out.println("num3 = " + super.getNum3());
		System.out.println("num4 = " + super.getNum4());
		System.out.println("num5 = " + this.num5);
	}
}

public class Test2 {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.print();

		
		/*
		 	출력 결과
		 	
		 	num1 = 10
		 	num2 = 20
		 	num3 = 30
		 	num4 = 40
		 	num5 = 0
		*/
		/*
		 	Heap 메모리 영역
			┌────────────────────────┐
		 	│	sub 객체	Super 영역	 │
		 	│						 │
		 	│public int num1 = 10 	 │
		 	│protected int num2 = 10 │
		 	│default int num3 = 10 	 │
		 	│private int num4 = 10 	 │
		 	│public int getNum4() 	 │
		 	├────────────────────────┤
		 	│	sub 객체 Sub 영역		 │
		 	│						 │
		 	│private int num5 = 0	 │
		 	│public void print()	 │
			└────────────────────────┘
		*/	
	}
}
