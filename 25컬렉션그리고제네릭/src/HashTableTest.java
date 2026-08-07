import java.util.Hashtable;
import java.util.Map;
import java.util.Enumeration;
public class HashTableTest {

	public static void main(String[] args) {
		Hashtable<String, String> table = new Hashtable<String, String>();
		
		table.put("사과", "Apple");
		table.put("딸기", "Strawberry");
		table.put("포도", "Grape");
		
		// 키를 이용해서 값 출력
		System.out.println(table.get("사과"));		// "apple"
		System.out.println(table.get("딸기"));		// "Strawberry"
		System.out.println(table.get("포도"));		// "Grape"
		
		// 모든 키 조회
		Enumeration<String> e = table.keys();
		
		while (e.hasMoreElements()) {
			String string = (String) e.nextElement();
			System.out.println("키: " + string + ", 값: " + table.get(string));
		}
		
		
		
		
		
		
		
		
		
	}	
}
