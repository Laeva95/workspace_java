// Student 클래스 작성
// 변수 name, age
// 기본 생성자 name = "무명", age = 0
// 매개변수 생성자
class Student{
	// 변수
	String name;
	int age;
	
	// 기본 생성자
	public Student(){
		name = "무명";
		age = 0;
	}
	
	// 매개변수 생성자
	public Student(String _name, int _age) {
		name = _name;
		age = _age;
	}
}


// BankAccount 클래스 작성
// 변수 owner, balance
// 기본 생성자 owner = "미지정", balance = 0
// 매개변수 생성자
class BankAccount{	
	// 변수
	String owner;
	int balance;
	
	// 기본 생성자
	public BankAccount() {
		owner = "미지정";
		balance = 0;
	}
	
	// 매개변수 생성자
	public BankAccount(String _owner, int _balance) {
		owner = _owner;
		balance = _balance;
	}
}


// Book 클래스 작성
// 변수 
// 기본 생성자 
// 매개변수 생성자
class Book{
	String title;
	String author;
}

public class 생성자_연습문제_5개 {

	public static void main(String[] args) {
		System.out.println("\n===== 연습1 =====");
		
		// 학생 객체 만들기
		Student student01 = new Student();
		Student student02 = new Student("홍길동", 20);
		
		System.out.println(student01.name);		// "무명"
		System.out.println(student01.age);		// 0
		
		System.out.println(student02.name);		// "홍길동"
		System.out.println(student02.age);		// 20
		
		System.out.println("\n===== 연습2 =====");
		
		// 계좌 객체 만들기
		BankAccount bank01 = new BankAccount();
		BankAccount bank02 = new BankAccount("홍길동", 50000);
		
		System.out.println(bank01.owner);		// "미지정"
		System.out.println(bank01.balance);		// 0
		
		System.out.println(bank02.owner);		// "홍길동"
		System.out.println(bank02.balance);		// 50000
		
		System.out.println("\n===== 연습3 =====");
		
		// 책 객체 만들기
		
		
	}
}
