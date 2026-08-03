package stringtest;


public class Ex1 {

	public static void main(String[] args) {
		
		String s1 = "JAVA";
		
		String s2 = new String("programming");
		
		String s3 = new String(new char[] {'S', 't', 'r', 'i', 'n', 'g'});
		
		System.out.println(s1.toString());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("====================================================");
		
		// 동일한 리터럴 문자열을 저장한 변수는 같은 객체 주소를 가리킴
		String str3 = "JSP";
		String str4 = "JSP";
		
		if(str3 == str4) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.println("=====================================================");
		
		String str1 = new String("Java");
		String str2 = new String("Java");
		
		if(str1 == str2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.println(str1.equals(str2));
		
		System.out.println("=====================================================");
		
		String a = "Java";
		String b = new String("Java");
		
		System.out.println(a == b);
		
		System.out.println(a.equals(b));
		
		System.out.println("=====================================================");
		
		String origin = "JAVA";
		String changed = origin.concat("_Study");
		
		System.out.println(origin);
		System.out.println(changed);
		
		
		
		
		
		
		
	}
}
