class TestClass1{
	private Object member;

	public Object getMember() {
		return member;
	}
	public void setMember(Object member) {
		this.member = member;
	}
	
}
public class GenericTest02 {

	public static void main(String[] args) {
		TestClass1 obj01 = new TestClass1();
		
		obj01.setMember(3);
		
		System.out.println("member에 저장된 값: " + obj01.getMember());
		
		obj01.setMember(3.4);
		
		System.out.println("member에 저장된 값: " + obj01.getMember());
		
		obj01.setMember("이해 할수 있다?");		
		
		System.out.println("member에 저장된 값: " + obj01.getMember());
	}
}
