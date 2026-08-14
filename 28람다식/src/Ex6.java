import java.util.Comparator;

public class Ex6 {

	public static void main(String[] args) {
		Comparator<Integer> recomparator = Comparator.reverseOrder();
		
		int result1 = recomparator.compare(10, 20);		// 앞 매개변수가 더 작으면 1 반환
		
		System.out.println(result1);
		
		int result2 = recomparator.compare(20, 10);		// 앞 매개변수가 더 크면 -1 반환
		
		System.out.println(result2);
		
		int result3 = recomparator.compare(10, 10);		// 앞 뒤 매개변수가 같으면 0 반환
		
		System.out.println(result3);
		
	}
}
