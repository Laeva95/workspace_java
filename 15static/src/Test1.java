// 클래스 내부 멤버변수 만들기

class Student{
	int num;
	static int staticNum;
	
	public Student() {
		
	}
	
	void add(int i) {
		num += i;
		staticNum += i;
	}
	
	void print(String str) {
		System.out.println("===== " + str + " 객체 =====");
		System.out.println("num: " + num);
		System.out.println("staticNum: " + staticNum);
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Student a = new Student();
		
		a.add(5);
		
		a.print("a");
		
		Student b = new Student();
		
		b.add(5);
		
		b.print("b");
		
		// 객체 변수의 값은 a, b 모두 5가 되지만
		// 정적 변수의 값은 누적되어 10이 됨
		
		/*
 		결론  :   객체 변수와  클래스 변수 차이점 적어보기 

		-> 객체 변수는  객체 메모리를 생성할때 마다  객체 메모리내부에 개별적으로 생성되는 메모리 공간
		
		-> 클래스변수는  생성된 각 객체 메모리들이 공용으로 사용하는 공용변수메모리이기때문에
		   자바프로그램이 시작되면 가장 처음  class Student가  JVM의 Methoed area 영역에 올라갈때 
		   class Student에 포함되어 같이 올라가는 변수 메모리 공간 
		 */
	}
}
