package mathtest;

public class MathTest {

	public static void main(String[] args) {
		int v1 = Math.abs(-5);
		System.out.println("-5의 절대값: " + v1);
		
		double v2 = Math.abs(-3.14);
		System.out.println("-3.14의 절대값: " + v2);
		
		System.out.println("===========================================");
		// ==============================================
		int v7 = Math.max(5, 9);
		System.out.println("5와 9의 최대값: " + v7);
		
		double v8 = Math.max(5.3, 2.5);
		System.out.println("5.3와 2.5의 최대값: " + v8);
		
		int v9 = Math.min(5, 9);
		System.out.println("5와 9의 최소값: " + v9);
		
		double v10 = Math.min(5.3, 2.5);
		System.out.println("5.3과 2.5의 최소값: " + v10);
		
		System.out.println("==============================================");
		// ==============================================
		double v11 = Math.floor(5.3);
		System.out.println("5.3의 내림값: " + v11);
		
		v11 = Math.floor(5.923);
		System.out.println("5.923의 내림값: " + v11);
		
		double v12 = Math.floor(-5.3);
		System.out.println("-5.3의 내림값: " + v12);
		
		v12 = Math.floor(-3.7);
		System.out.println("-3.7의 내림값: " + v12);
		
		System.out.println("===============================================");
		// ==============================================
		double v3 = Math.ceil(5.3);
		System.out.println("5.3의 올림값: " + v3);

		v3 = Math.ceil(5.923);
		System.out.println("5.923의 올림값: " + v3);
		
		double v4 = Math.ceil(-5.3);
		System.out.println("-5.3의 올림값: " + v4);
		
		v4 = Math.ceil(-3.7);
		System.out.println("-3.7의 올림값: " + v4);
		
		System.out.println("===============================================");
		// =================================================
		// 1 ~ 12 사이의 랜덤 값을 10번 출력
		System.out.println("=== 1 ~ 12 사이의 랜덤 값 10회 ===");
		for(int i = 0; i < 10; i++) {
			int t = (int)(Math.random() * 12) + 1;
			System.out.println(t);
		}
		
		System.out.println("===============================================");
		// ==================================================
		System.out.println("5의 2제곱: " + Math.pow(5, 2));
		
		System.out.println("Math.PI: " + Math.PI);
		
	}
}
