
class TestClass2{
	private Object member;
	
	public void setMember(Object member) { this.member = member; }
	
	public Object getMember() { return member; }
}

public class GenericTest03 {

	public static void main(String[] args) {
		TestClass2 obj01 = new TestClass2();
		
		obj01.setMember("apple");
		
		Object obj = obj01.getMember();			// obj = "apple";
		
		String temp = (String)obj;
		
		System.out.println(temp.toUpperCase());
		
	}
}
