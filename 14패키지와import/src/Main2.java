/*
 	import: 다른 패키지에 만들어놓은 자바 파일의 클래스를 현재 파일에서 사용하기 위해서
 			클래스를 불러와서 적용하는 예약어
 */
//import com.example.utils.Calculator;

// 해당 패키지의 모든 클래스 가져오는법
import com.example.utils.*;

public class Main2 {

	public static void main(String[] args) {
//		Main main = new Main();
//		Main2 main2 = new Main2();
		
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(5, 10));
		
	}
}
