package stringtest;

public class Ex5 {

	public static void main(String[] args) {
		
		String str = "Hello, World!";
		
		String str2 = str.replace("l", "");
		
		System.out.println("원본 문자열: " + str);
		
		System.out.println("수정된 문자열: " + str2);
		
		System.out.println("============================================");
		
		String test = "Hello, World!";
		
		test.replace("l", "");
		
		System.out.println(test);
		
		test = test.replace("l", "");
		
		System.out.println(test);
		
		System.out.println(str.replace("lo", ""));
		
		System.out.println(str.replace("L", ""));
		
		
		
	}
}
