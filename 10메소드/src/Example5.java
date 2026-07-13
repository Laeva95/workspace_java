
public class Example5 {

	public static void main(String[] args) {
		// 가변 길이 매개변수를 사용해서 합계를 구하는 메서드
		// 가변 길이 매개변수란? 
		// 메서드의 매개변수 개수를 미리 정하지 않고 메서드를 호출할 때 원하는 값을 넘길 수 있게 해주는 매개변수
		
		
		System.out.println(sum(1,2,3));
		
		System.out.println(sum(10,20,30,40,50));
		
		System.out.println(sum());
		
	}
	// 여러 정수를 가변길이 매개변수 numbers로 전달받아 모두 더한 값을 반환
	public static int sum(int... numbers) {
		for(int i = 1; i < numbers.length; i++) {
			numbers[0] += numbers[i];
		}
		return numbers.length == 0 ? 0 : numbers[0];
	}
}
