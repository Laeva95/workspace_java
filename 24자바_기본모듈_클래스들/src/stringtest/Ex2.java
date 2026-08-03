package stringtest;

public class Ex2 {

	public static void main(String[] args) {
		
		String str5 = "JAVA_Study";
		
		System.out.println(str5.length());
		
		System.out.println(str5.charAt(0));
		System.out.println(str5.charAt(9));
		
		System.out.println("===========================================");
		
		String str1 = new String("Coffee");
		String str2 = new String("House");
		
		System.out.println(str1.equals(str2));
		
		String str3 = new String("House");
		
		System.out.println(str2.equals(str3));
		
		System.out.println("A".equals("B"));
		
		System.out.println("==============================================");
		
		String a = new String("AndroidJSPJAVA");
		
		System.out.println(a.substring(7, 10));
		
		System.out.println(a.substring(7));
		
		System.out.println(a);
		
		System.out.println("=============================================");
		
		String b = new String("   JA  VA    ");
		
		System.out.println(b.trim());
		
		System.out.println(b);
		
		System.out.println(b.strip());
		
		
	}
}
