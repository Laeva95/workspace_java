package ex1;


public class ExceptionHandlingExample4 {

	public static void main(String[] args) {
		// 문자열을 저장할 배열
		String[] array = {"100", "1oo"};
		
		// 배열에 저장된 문자열 2개를 차례로 얻어서 반복해서 얻어 숫자로 변환
		for (int i = 0; i <= array.length; i++) {
			try {
				System.out.println(Integer.parseInt(array[i]));
			} catch (NumberFormatException e) {
				e.printStackTrace();
				
				System.out.println("array[" + i + "] 위치에 저장된 \"" + array[i] + "\" 값을 숫자로 변환 할 수 없습니다.");
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				
				System.out.println("array 배열에는 " + (i + 1) + "번째 값이 존재하지 않습니다.");
			}
		}
		
		
		System.out.println("마무리 코드 실행");
	}
}
