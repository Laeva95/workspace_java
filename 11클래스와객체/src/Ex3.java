
// 생성된 객체 메모리의 주소 번지들을 배열 메모리의 각 칸에 저장해서 사용
// 철수
// 이름, 나이
// 행동

class Person{

	String name;
	int age;
	
	// 자신의 이름을 반환
	public String getName() {
		return name;
	}
	
	
}

public class Ex3 {	
	public static void main(String[] args) {
		// 기본 자료형
		// byte, short, int, long, float, double, char, boolean
		
		// 참조 자료형
		// 클래스 자료형, 인터페이스 자료형
		
		// 1. 기본 자료형 배열
		int[] array;
		
		array = new int[3];
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		
		
		// 2. 참조 자료형 배열
		Person[] persons;
		
		persons = new Person[10];
		
		for(int i = 0; i < persons.length; i++) {
			persons[i] = new Person();
			persons[i].age = 30 + i;
			System.out.println(persons[i].age);
		}
		
		
		
	}
}
