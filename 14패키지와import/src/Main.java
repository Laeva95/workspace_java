/*
 	import: 다른 패키지에 만들어놓은 자바 파일의 클래스를 현재 파일에서 사용하기 위해서
 			클래스를 불러와서 적용하는 예약어
 */
import com.example.utils.Calculator;

public class Main {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(5, 10));
		
	}
}
