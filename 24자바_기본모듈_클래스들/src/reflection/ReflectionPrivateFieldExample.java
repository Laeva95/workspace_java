package reflection;

import java.lang.reflect.Field;

class Member{
	private String name;
	private int age;
	
	public Member() {}
}


public class ReflectionPrivateFieldExample {

	public static void main(String[] args) throws Exception{
		// member 객체 생성
		Member member = new Member();
		
		// Member 클래스 객체 생성
		Class clazz = Member.class;
		
		// name 변수 가져오기
		Field nameField = clazz.getDeclaredField("name");
		
		nameField.setAccessible(true);
		
		nameField.set(member, "홍길동");
		
		// age 변수 가져오기
		Field ageField = clazz.getDeclaredField("age");
		
		ageField.setAccessible(true);
		
		ageField.set(member, 20);
		
		System.out.println("이름: " + nameField.get(member));
		System.out.println("나이: " + ageField.get(member));
	}
}
