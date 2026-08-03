package stringtest;

public class Ex4 {

	public static void main(String[] args) {
		
		// 값을 변경할 원본 문자열
		String str = "Hello, World!";
		
		// 원본 문자열을 char 배열로 변환
		char[] strToChars = str.toCharArray();
		
		// 변경한 문자열을 저장할 StringBuilder 객체 생성
		StringBuilder sb = new StringBuilder();
		
		// 모든 char 배열을 돌면서 l을 제외한 값만 sb 변수에 저장
		for(char c : strToChars) {
			if(c == 'l') 
				continue;
			
			sb.append(c);
		}
		
		// 결과값 출력
		System.out.println("원본 문자열:" + str);
		System.out.println("수정된 문자열:" + sb);
		
	}
}
