import java.util.Hashtable;

public class HashTableTest02 {

	public static void main(String[] args) {
		Hashtable<String, String> table = new Hashtable<String, String>();
		
		table.put("사과", "Apple");
		table.put("딸기", "Strawberry");
		table.put("포도", "Grape");
		
		String value = table.get("포도");
		
		if(value != null) {
			System.out.println("포도 key와 함께 연결되어 저장되었던 value: " + value);
		}
		
		
	}
}
