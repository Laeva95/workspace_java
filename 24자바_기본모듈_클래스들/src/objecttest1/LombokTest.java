package objecttest1;

// Lombok 라이브러리가 자동으로 생성하는 메소드를 확인
public class LombokTest {

	public static void main(String[] args) {
		Member3 m1 = new Member3();
		
		m1.setMemberNo(1);
		m1.setMemberEmail("winter@test.com");
		m1.setMemberNickName("눈송이");
		
		System.out.println(m1.getMemberNo());
		System.out.println(m1.getMemberEmail());
		System.out.println(m1.getMemberNickName());
		
		System.out.println(m1.toString());
		
		Member3 m2 = new Member3(2, "admin@test.com", "1234", "철수", "010-1111-2222", "서울시", "img.png");
		Member3 m3 = new Member3(2, "admin@test.com", "1234", "철수", "010-1111-2222", "서울시", "img.png");
		
		System.out.println(m2);
		System.out.println(m3);
		
		System.out.println(m2 == m3);
		
		System.out.println(m2.equals(m3));

		System.out.println(m2.hashCode());
		
		System.out.println(m3.hashCode());
		
		m3.setMemberNickName("영희");
		
		System.out.println(m2.equals(m3));
		
	}
}
