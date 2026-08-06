import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Collections03 {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>(6);
		
		list.add("하나");
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("다섯");
		list.add(6);
		
		System.out.println("======================================");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// Iterator 사용
		System.out.println("========================================");
		
		Iterator<Object> iterator = list.iterator();
		
		// iterator 를 이용해서 컬렉션 순회
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// itertator 사용시 주의점
		// 1. 1회용이므로 재사용 시 객체를 새롭게 생성해야함.
		System.out.println("다 쓴 iterator의 hasNext(): " + iterator.hasNext());
		
		Iterator<Object> iterator2 = list.iterator();
		
		System.out.println("새로 만든 iterator2의 hasNext(): " + iterator2.hasNext());
		
		// 2. hasNext() 를 이용해 다음 요소가 있는지 확인해야함
		
		System.out.println("========================================");
		
		for(Object o : list) {
			System.out.println(o);
		}
		
	}
}
