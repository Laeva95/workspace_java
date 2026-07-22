// Scanner 클래스를 가져와서 사용하기
import java.util.Scanner;

public class ImportTest {

	public static void main(String[] args) {
		// java.lang 패키지에 포함된 클래스들은 import 없이 사용 가능
		// ex) String, System, Math ... 등
		String text = "Hello";
		
		System.out.println(text);
		
		System.out.println(Math.max(3, 7));
		
		
		// import 했으므로 Scanner 클래스 사용 가능
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		
		String name = sc.nextLine();
		
		System.out.println("입력한 이름: " + name);
		
		sc.close();
		
	}
}
