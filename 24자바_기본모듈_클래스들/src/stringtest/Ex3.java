package stringtest;


class MemberDTO{
	private String name;
	private String address;
	
	public MemberDTO(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() { return name; }
	public String getAddString() { return address; }
	
	// 전체 주소에서 상세 주소만 잘라내는 메소드
	public String getDetailAddress() {
		if((address.lastIndexOf("/") == -1) || (address.lastIndexOf("/") + 1 >= address.length())) {
			return address;
		}
		return address.substring(address.lastIndexOf("/") + 1);
	}
	
	
}

public class Ex3 {

	public static void main(String[] args) {
		
		final int MEMBER_COUNT = 5;
		
		MemberDTO[] memberArray = new MemberDTO[MEMBER_COUNT];
		
		memberArray[0] = new MemberDTO("홍길동", "서울시 강남구 테헤란로 123/101호");
		memberArray[1] = new MemberDTO("김청수", "부산시 해운대구 해변로 456/202호");
		memberArray[2] = new MemberDTO("이영희", "대구시 수성구 수성로 789/303호");
		memberArray[3] = new MemberDTO("박지민", "인천시 남동구 남동대로 101/404호");
		memberArray[4] = new MemberDTO("최준호", "광주시 북구 북문로 112/505호");
		
		for(MemberDTO m : memberArray) {
			System.out.println("이름: " + m.getName() + ", 상세 주소: " + m.getDetailAddress());
			System.out.println("------------------------------------------------");
		}
		
		MemberDTO noDetail = new MemberDTO("정하나", "제주시 연동 999");
		System.out.println("이름: " + noDetail.getName() + ", 상세 주소: " + noDetail.getDetailAddress());

		// indexOf(), lastIndexOf() 메소드의 차이
		
		String text = "apple, banana, cherry, banana, date";
		
		System.out.println("indexOf(\"banana\") = " + text.indexOf("banana"));
		
		System.out.println("lastIndexOf(\"banana\") = " + text.lastIndexOf("banana"));
		
		System.out.println("lastIndexOf(\"melon\") = " + text.lastIndexOf("melon"));
		
	}
}
