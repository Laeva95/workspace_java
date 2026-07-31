package objecttest1;

class Member{
	// 객체 변수
	public String id;
	// 기본 생성자
	public Member() {
		
	}
	// 매개변수 생성자
	public Member(String id) {
		this.id = id;
	}
}

public class ObjectEqualsExample {
	public static void main(String[] args) {
		
		// 서로 다른 객체 비교
		Member member1 = new Member();
		Member member2 = new Member();
		
		System.out.println("member1.equals(member2) = " + member1.equals(member2));
		
		System.out.println("member1 == member2 = " + (member1 == member2));
		
		// ==============================================================
		
		// 같은 객체를 가리키는 두 참조변수를 비교
		Member member3 = member1;
		
		System.out.println("member1.equals(member3) = " + member1.equals(member3));
		
		System.out.println("member1 == member3 = " + (member1 == member3));
		
		// ==============================================================
		
		Member member4 = new Member("hong");
		
		Member member5 = new Member("hong");
		
		System.out.println("member4.id.equals(member5.id) = " + member4.id.equals(member5.id));
		
		System.out.println("member4.id == member5.id = " + (member4.id == member5.id));
		
		// ==============================================================
		
		Object object1 = new Object();
		
		Object object2 = new Object();
		
		System.out.println("object1.equals(object2) = " + object1.equals(object2));
		
		// ==============================================================
		
		String str1 = new String("java");
		
		String str2 = new String("java");
		
		System.out.println("str1 == str2 = " + (str1 == str2));
		
		System.out.println("str1.equals(str2) = " + str1.equals(str2));
		
		
		
	}
}
