
public class WepDevelopmentExample {
	
	// 게스트, 일반 사용자, 관리자 권한을 나타내는 정수를 저장
	public static final int GUEST_PERMISSION = 1;
	public static final int MEMBER_PERMISSION = 2;
	public static final int ADMIN_PERMISSION = 4;
	
	// 로그인 시 필요한 권한을 설정하는 상수
	// 일반 사용자 권한과 관리자 권한을 비트 합 연산자를 사용해 권한 설정
	public static final int LOGIN_PERMISSION = MEMBER_PERMISSION | ADMIN_PERMISSION;	// 6
	
	public static final int ADMIN_PAGE_PERMISSION = ADMIN_PERMISSION;

	public static void main(String[] args) {
		// 비트 논리 연산자 & | ^를 이용해서 
		// 관리자 페이지와 일반 사용자 페이지 권한에 대한 응용 예제
		int userPermission = LOGIN_PERMISSION;
		
		boolean isAdmin = (userPermission & ADMIN_PERMISSION) != 0;	// true
		
		if(isAdmin) {
			System.out.println("관리자 페이지에 접근 가능");
		}
		
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);

        char ch = 'A';
        ch = (char)(ch + 2);

        float f = 3f / 2f;
        long l = 3000l * 3000l * 3000l;

        float f2 = 0.1f;
        double d = 0.1;

        boolean result = (float)d==f2;

        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);
	}
}
