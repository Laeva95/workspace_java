package reflection;

class Car{
	
}

public class GetClassExample {

	public static void main(String[] args) throws Exception{
		// 리플렉션: Class 라는 이름의 클래스 객체를 읽고 수정하는 행위
		// 하나의 클래스당 Class 객체가 하나만 만들어짐
		
		// 클래스 객체를 얻는 방법
		// 1. Class cl = String.class;
		// 2. Class cl = Class.forName("java.lang.String");
		// 3. Class cl = str.getClass();
		
		// Class clazz = Car.class;
		Class clazz = Class.forName("reflection.Car");	// => 런타임 예외 처리가 필요함
		// Class clazz = new Car().getClass();
		
		// getPackageName(): 패키지 이름을 반환하는 메소드
		System.out.println(clazz.getPackageName());
		
		// getSimpleName(): 클래스 이름을 반환하는 메소드
		System.out.println(clazz.getSimpleName());
		
		// getName(): 패키지 이름과 클래스 이름을 같이 반환하는 메소드
		System.out.println(clazz.getName());
		
	}
}
