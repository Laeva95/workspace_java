package stringtokenizertest;

import java.util.StringTokenizer;

public class StringTokenizerVsSplitExample {

	public static void main(String[] args) {
		
		String data = "홍길동/이수홍,박연수-김재배|최영훈";
		
		System.out.println("1) StringTokenizer 클래스 =====================");
		
		StringTokenizer st = new StringTokenizer(data, "/,-|");
		
		int totalCount = st.countTokens();
		
		System.out.println(totalCount);
		
		while (st.hasMoreTokens()) {
			
			String name = st.nextToken();
			
			System.out.println(name);
		}
		
		System.out.println("2) String.split() 메소드 =====================");
		
		String[] names = data.split("/|,|-|\\|");
			
		for(String s : names) {
			System.out.println(s);
		}
		
		
		
	}
}
