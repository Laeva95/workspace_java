
public class F01 {

	public static void main(String[] args) {
		int n;
		
		for(n = 1; n <= 10; n++) {
			System.out.print("	" + n);
		}
		
		System.out.println();
		
		for(n = 1; n <= 10; n++) {
			if(n % 3 == 0) {
				break;
			}
			System.out.print("	" + n);
		}
		
		
		
	}
}
