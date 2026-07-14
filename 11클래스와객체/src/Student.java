
public class Student {

	String name;			// 이름
	int age;				// 나이
	String studentId;		// 학생 id
	
	// 학생이 공부를 하는 메서드
	void study() {
		System.out.println(name + " 학생이 공부하고 있습니다.");
	}
	
	// 학생의 정보를 출력하는 메서드
	void prinfInfo() {
		// 이름, 나이, 학번을 출력
		System.out.println("이름: " + name + ", 나이: " + age + ", 학번: " + studentId);
	}
	
	public static void main(String[] args) {
		// 1. Student 변수 선언 후 메모리 할당
		Student student1 = new Student();
		
		// 2. 이름, 나이, 학번 값 설정
		student1.name = "영희";
		student1.age = 20;
		student1.studentId = "2025001";
		
		// 3. 정보 출력 메서드 호출	
		student1.prinfInfo();
		
		// 4. 공부 메서드 호출
		student1.study();
	
		
	}
}
