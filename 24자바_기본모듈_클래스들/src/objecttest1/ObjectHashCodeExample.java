package objecttest1;


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
		
		System.out.println("obj1.hashCode(): " + obj1.hashCode());
		
		System.out.println("------------------------------------");
		
		// ==============================================
		
		Student student1 = new Student(1, "홍길동");
		Student student2 = new Student(1, "홍길동");
		
		System.out.println("student1.hashCode() = " + student1.hashCode());
		System.out.println("student2.hashCode() = " + student2.hashCode());
		
		System.out.println("student1 == student2 = " + (student1 == student2));
		
		if(student1.hashCode() == student2.hashCode()) {
			if(student1.equals(student2)) {
				System.out.println("해시 코드가 같고 인스턴스 변수 값도 같으므로 동등 객체입니다.");
			}else {
				System.out.println("해시 코드는 같지만 인스턴스 변수 값이 다르므로 동등 객체가 아닙니다.");
			}
		}else {
			System.out.println("해시 코드가 다르므로 동등 객체가 아닙니다.");
		}
		
		System.out.println("---------------------------------------------");
		
		Student student3 = new Student(2, "김철수");
		
		System.out.println("student3.hashCode() = " + student3.hashCode());
		
		System.out.println("student1.equals(student3) = " + student1.equals(student3));
		
	}
}
