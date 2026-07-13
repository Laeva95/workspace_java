
public class Example7 {

	public static void main(String[] args) {
		int[] arr = {1, 3, 7, 3, 2, 3, 9, 3};
		
		countOccurrences(arr, 3);
		
	}
	
	// 정수 배열과 정수 하나를 매개변수로 전달받아서
	// 해당 정수가 배열에서 몇번 등장하는지를 출력하는 메서드
	public static void countOccurrences(int[] nums, int target) {
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == target)
				count++;
		}
		System.out.println(target + "의 등장 횟수: " + count + "회");
	}
}
