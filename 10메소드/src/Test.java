
public class Test {

	public static void main(String[] args) {

	}
	
	// 문제 1번
	public static int sum(int a, int b) {
		// a와 b를 더해서 출력
		return a + b;
	}
	
	// 문제 2번
	public static void printLoop(String str, int n) {
		// n회만큼 반복해서 str 출력
		for(int i = 0; i < n; i++) {
			System.out.println(str);
		}
	}
	
	// 문제 3번
	public static boolean isEven(int number) {
		return number % 2 == 0;		// 2로 나누어 떨어지면 짝수이므로 true
	}
	
	// 문제 4번
	public static int maxOfThree(int a, int b, int c) {
		int max = a > b ? a : b;	// a와 b 중에 큰 값을 max에 대입
		max = max > c ? max : c;	// max와 c 중에 큰 값을 max에 대입
		
		return max;
	}
	
	// 문제 5번
	public static int absoluteValue(int num) {
		// num이 0보다 크거나 같으면 그대로, 작으면 -를 곱해서 반환
		return num >= 0 ? num : -num;
	}
	
	// 문제 6번
	public static int sumUpTo(int n) {
		int sum = 0;
		// 1부터 n까지 반복문을 통해 누적
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		// 누적한 값을 반환
		return sum;
	}
	
	// 문제 7번
	public static int countChar(String text, char target) {
		int count = 0;
		for(int i = 0; i < text.length(); i++) {
			// text의 i번째 인덱스 문자와 target 문자가 같다면 count + 1
			if(text.charAt(i) == target) 
				count++;
		}
		return count;
	}
	
	// 문제 8번
	public static double calculateAverage(int[] arr) {
		double sum = 0;
		// sum 변수에 arr 배열 요소의 합을 누적함
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		// 누적된 값을 arr 배열 요소의 개수로 나누어서 평균 반환
		return sum / arr.length;
	}
	
	// 문제 9번
	public static long factorial(int n) {
		long answer = 1;
		// 1부터 n까지 곱하여 누적
		for(int i = 1; i <= n; i++) {
			answer *= i;
		}
		
		return answer;
	}
	
	// 문제 10번
	public static boolean isPrime(int num) {
		
		// 2부터 num - 1까지 반복문으로 검사
		for(int i = 2; i < num; i++) {
			// 만약 num 을 i 로 나눈 값이 0이라면 소수가 아니므로 false
			if(num % i == 0) {
				return false;
			}
		}
		// 끝까지 나누어 떨어지는 값이 없다면 true
		return true;
	}
}
