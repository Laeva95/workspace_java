
public class ArrayUtils {

	// 정수들이 저장된 배열을 하나 매개변수로 전달받아서
	// 배열에 저장된 값들의 합을 구해 반환하는 기능의 sum 메서드
	public int sum(int[] arr) {
		int total = 0;
		
		for(int i : arr) 
			total += i;
		
		return total;
	}
	
	// 실수들이 저장된 배열을 하나 매개변수로 전달받아서
	// 배열에 저장된 값들의 합을 구해 반환하는 기능의 sum 메서드
	public double sum(double[] arr) {
		double total = 0;
		
		for(double i : arr) 
			total += i;
		
		return total;
	}
	
	// 정수들이 저장된 배열 하나를 매개변수로 전달받아 합계를 계산한 뒤 출력하는 기능의 printSum 메서드
	public void printSum(int[] arr) {
		System.out.println("arr 매개변수 배열의 모든 정수들의 합: " + sum(arr));
	}
	
	// 실수들이 저장된 배열 하나를 매개변수로 전달받아 합계를 계산한 뒤 출력하는 기능의 printSum 메서드
	public void printSum(double[] arr) {
		System.out.println("arr 매개변수 배열의 모든 실수들의 합: " + sum(arr));
	}
	public static void main(String[] args) {
		// 객체메모리 생성
		ArrayUtils u = new ArrayUtils();
		
		// 정수 배열 생성
		int[] intArr = { 1, 2, 3, 4, 5 };
		
		// printSum 함수 호출
		u.printSum(intArr);
		
		// 실수 배열 생성
		double[] doubleArr = { 1.5, 2.5, 3.5 };
		
		// printSum 함수 호출
		u.printSum(doubleArr);
		
		
	}
}
