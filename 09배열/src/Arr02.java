
public class Arr02 {

	public static void main(String[] args) {
		// 예제 5개의 실수 값 중에 최대 값 구하기
		double[] data = { 9.5, 7.0, 13.6, 7.5, 10.0 };
		double max = 0.0;
		
		max = data[0];
		
		// 배열의 각 요소와 비교해서 현재 max 값보다 크다면 max 값 변경
		for(int i = 1; i < data.length; i++) {
			if(max < data[i])
				max = data[i];
		}
		
		System.out.println("최대값 = " + max);
		
		
		
	}
}
