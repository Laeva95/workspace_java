
public class PasswordEncryptionExample {

	public static void main(String[] args) {
		// 왼쪽, 오른쪽 비트 시프트 연산자를 사용해서 비밀번호를 암호화하고 복호화하는 예제
//		char a = 'h';
		
//		System.out.println(a);
		
		String password = "myPassword123"; 	// 암호화 시킬 비밀번호

		int shift = 3;						// 비트 시프트 연산에 사용될 값

		String encryptedPassword = "";		// 암호화 한 비밀번호를 저장할 변수
		
		// 각 password 문자를 비트 시프트 연산을 통해 암호화
		for(int i = 0; i < password.length(); i++) {
			System.out.println(password.charAt(i));
			
			char encryptedChar = (char)(password.charAt(i) << shift);
			
			System.out.println(encryptedChar);
			
			encryptedPassword += encryptedChar;
		}
		
		System.out.println("암호화: " + encryptedPassword);	// 암호화된 코드 출력
		
		String decryptPassword = "";
		
		for(int i = 0; i < encryptedPassword.length(); i++) {
			char decryptChar = (char)(encryptedPassword.charAt(i) >> shift);
			
			decryptPassword += decryptChar;
		}
		
		System.out.println("복호화: " + decryptPassword);	// 복호화된 코드 출력
		
	}
}
