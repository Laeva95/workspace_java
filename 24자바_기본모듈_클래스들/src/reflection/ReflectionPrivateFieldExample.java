package reflection;

import java.lang.reflect.Field;

class Member{
	private String name;
	private int age;
	
	public Member() {}
}


public class ReflectionPrivateFieldExample {

	public static void main(String[] args) throws Exception{
		Member member = new Member();
		
		Class clazz = Member.class;
		
		Field nameField = clazz.getDeclaredField("name");
		
		nameField.setAccessible(true);
		
		nameField.set(member, "홍길동");
		
		Field ageField = clazz.getDeclaredField("age");
		
		ageField.setAccessible(true);
		
		ageField.set(member, 20);
		
		System.out.println("이름: " + nameField.get(member));
		System.out.println("나이: " + ageField.get(member));
	}
}
