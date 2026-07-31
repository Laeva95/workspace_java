package objecttest1;

import java.lang.annotation.Target;
import java.util.Objects;

class Student{
	
	private int no;
	private String name;
	
	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return this.no + this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(this.no == target.getNo() && this.name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
	
	
}

public class ObjectHashCodeExample {

	public static void main(String[] args) {

		// Object의 객체를 생성해서 hashCode() 메서드 호출
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		// 서로 다른 객체이므로 서로 다른 정수값 출력
		// 이 값은 고정된 값이 아니라 프로그램을 실행 할때마다 다른 값이 출력됨
		System.out.println("obj1.hashCode(): " + obj1.hashCode());
		System.out.println("obj2.hashCode(): " + obj2.hashCode());
		
		
		
		
		
	}
}
