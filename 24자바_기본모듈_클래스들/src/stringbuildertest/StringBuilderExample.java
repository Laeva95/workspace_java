package stringbuildertest;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder data = new StringBuilder("ABC");
		
		data.append("DEF");
		
		StringBuilder data2 = data.append("GHI");
		
		System.out.println(data == data2);
		
		System.out.println(data2);
		
		data2.delete(3, 4);
		
		System.out.println(data2);
		
		data2.insert(0, "G");
		
		System.out.println(data2);
		
		System.out.println("========================================");
		
		StringBuilder sb2 = new StringBuilder("안녕하세요").delete(0, 2).append(" 공부");
		
		System.out.println(sb2);
		
		
		
	}
}
