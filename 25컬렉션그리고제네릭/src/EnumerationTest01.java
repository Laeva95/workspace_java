
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationTest01 {

	public static void main(String[] args) {
		// 기본 생성자를 통해 10칸 생성
		Vector vector = new Vector();
		
		// 0부터 4까지 5칸 입력
		for(int i = 0; i < 5; i++) {
			// i * 10 만큼 자동 박싱되어 입력
			vector.add(i * 10);
		}
		
		// vector 의 요소 개수만큼 반복
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		
		Enumeration enumeration = vector.elements();
		
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
	}
}
