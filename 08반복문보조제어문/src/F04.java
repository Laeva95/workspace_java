
public class F04 {

	public static void main(String[] args) {
		// for문에 세미콜론만 두번 적어도 문법적으로 문제가 없음
		// 하지만 조건식이 존재 하지 않기 때문에 무한 루프가 됨
		
		int n = 0;
		
		for(;;) {
			
			System.out.println("Fall Wonderland");
			
			if(++n >= 10) {
				break;
			}
			
		}

		System.out.println("The End");
		
	}
}
