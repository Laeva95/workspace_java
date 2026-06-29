
public class Data07 {

	public static void main(String[] args) {
		
		/*
		 * 컴퓨터는 문자를 직접 저장하지 못하고 이진수의 숫자를 통해 저장함
		 * 대문자 'A' -> 정수 65
		 * 소문자 'a' -> 정수 97
		 * 숫자 0    -> 정수 48
		 * */
		
		char x = 'A';			// 65 = 0100 0001 저장
		
		// 출력 형식 지정자: %c 문자, %d 10진수, \n 줄바꿈 
		System.out.printf("문자 %c의 유니코드 정수 번호는 -> %d 입니다.\n", x, (int)x);
	
		x = '0';
		System.out.printf("문자 %c의 유니코드 정수 번호는 -> %d 입니다.\n", x, (int)x);
		
		
	}
}
