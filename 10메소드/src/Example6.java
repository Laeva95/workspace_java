
public class Example6 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		sumArray(arr);
		
		
		
	}
	
	// 정수가 저장된 배열을 매개변수로 전달받아 배열 안의 모든 값을 더해서 출력하는 메서드
	public static void sumArray(int[] numbers) {
		int total = 0;
		for(int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		
		System.out.println("배열의 총합: " + total);
	}
}
