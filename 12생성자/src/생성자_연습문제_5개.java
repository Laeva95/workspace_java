// Student 클래스 작성
// 변수 name, age
// 기본 생성자 name = "무명", age = 0
// 매개변수 생성자
class Student {
	// 변수
	String name;
	int age;

	// 기본 생성자
	public Student() {
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
class BankAccount {
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
class Book {
	// 변수
	String title;
	String author;
	int price;

	// 기본 생성자
	public Book() {
		this("제목없음", "작자미상", 0);
	}

	// 매개변수 생성자
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

}

// Phone 클래스 작성
// 변수
// 기본 생성자
// 매개변수 생성자
class Phone {
	// 변수
	String model;
	int storage;

	// 기본 생성자
	public Phone() {
		this("미정", 128);
	}

	// 매개변수 생성자
	public Phone(String model) {
		this(model, 128);
	}

	public Phone(String model, int storage) {
		this.model = model;
		this.storage = storage;
	}
}

// Pizza 클래스 작성
// 변수
// 기본 생성자
// 매개변수 생성자
class Pizza{
	// 변수
	String name;
	String size;
	int price;
	
	// 기본 생성자
	public Pizza() {
		this("치즈피자", "M");
	}
	
	// 매개변수 생성자
	public Pizza(String name, String size) {
		this.name = name;
		this.size = size;
		if(size.equals("M")) {
			this.price = 15000;
		} else if(size.equals("L")) {
			this.price = 20000;
		}
	}
}
public class 생성자_연습문제_5개 {

	public static void main(String[] args) {
		System.out.println("\n===== 연습1 =====");

		// 학생 객체 만들기
		Student student01 = new Student();
		Student student02 = new Student("홍길동", 20);

		System.out.println(student01.name); // "무명"
		System.out.println(student01.age); // 0

		System.out.println(student02.name); // "홍길동"
		System.out.println(student02.age); // 20

		System.out.println("\n===== 연습2 =====");

		// 계좌 객체 만들기
		BankAccount bank01 = new BankAccount();
		BankAccount bank02 = new BankAccount("홍길동", 50000);

		System.out.println(bank01.owner); // "미지정"
		System.out.println(bank01.balance); // 0

		System.out.println(bank02.owner); // "홍길동"
		System.out.println(bank02.balance); // 50000

		System.out.println("\n===== 연습3 =====");

		// 책 객체 만들기
		Book book1 = new Book();
		Book book2 = new Book("자바의정석", "남궁성", 30000);
		
		System.out.println(book1.title);
		System.out.println(book1.author);
		System.out.println(book1.price);
		
		System.out.println(book2.title);
		System.out.println(book2.author);
		System.out.println(book2.price);
		
		System.out.println("\n===== 연습 4 =====");
		
		// 폰 객체 만들기
		Phone phone1 = new Phone();
		Phone phone2 = new Phone("갤럭시S26");
		Phone phone3 = new Phone("아이폰17", 512);
		
		System.out.println(phone1.model + " / " + phone1.storage + "GB");
		System.out.println(phone2.model + " / " + phone2.storage + "GB");
		System.out.println(phone3.model + " / " + phone3.storage + "GB");
		
		System.out.println("\n===== 연습 5 =====");
		
		// 피자 객체 만들기
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza("불고기피자", "L");
		Pizza pizza3 = new Pizza("페퍼로니피자", "M");
		
		System.out.println(pizza1.name);
		System.out.println(pizza1.size);
		System.out.println(pizza1.price);
		
		System.out.println(pizza2.name);
		System.out.println(pizza2.size);
		System.out.println(pizza2.price);
		
		System.out.println(pizza3.name);
		System.out.println(pizza3.size);
		System.out.println(pizza3.price);
	}
}
