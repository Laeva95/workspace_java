import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		System.out.println("HashMap에 저장된 key 개수 : " + map.size());
		
		System.out.println();
		
		String key = "홍길동";
		
		int value = map.get(key);
		
		System.out.println(key + " - " + value);
		System.out.println();
		
		Set<String> set = map.keySet(); // 모든 키를 Set에 담아서 반환
		
		Iterator<String> keyIterator = set.iterator();
		
		while(keyIterator.hasNext()) {
			String keyString = keyIterator.next();
			int valueInt = map.get(keyString); 
			System.out.println("key: " + keyString + ", value: " + valueInt);
		}
		
		System.out.println("=========================================================");
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
			
		}
		
		System.out.println();
		
		map.remove("홍길동");
		
		System.out.println(map.size() + "개");
		
		
		
		
		
	}
}
