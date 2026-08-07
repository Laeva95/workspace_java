class TestClass{
	private int member;

	public int getMember() {
		return member;
	}
	public void setMember(int member) {
		this.member = member;
	}
	
}
public class GenericTest01 {

	public static void main(String[] args) {
		TestClass obj01 = new TestClass();
		
		obj01.setMember(3);
		
		System.out.println("member에 저장된 값: " + obj01.getMember());
		
		// obj01.setMember(3.4);				int 자료형이 아니기 때문에 불가능
		// obj01.setMember("이해 할수 있다?");		int 자료형이 아니기 때문에 불가능
		
		System.out.println("member에 저장된 값: " + obj01.getMember());
	}
}
