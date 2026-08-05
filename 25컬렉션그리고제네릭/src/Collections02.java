import java.util.ArrayList;
import java.util.List;

public class Collections02 {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		
		list.add("apple");		// 비어있는 첫 칸에 "apple" 추가
		list.add("banana");
		list.add("cherry");
		
		System.out.println("list 배열에 저장된 객체 개수: " + list.size());		// 3
		
		System.out.println("list: " + list);
		
		// 칸 수를 지정한 배열 생성
		// new ArrayList(2);
		List<Object> list2 = new ArrayList<Object>(2);
		
		list2.add("apple");		// 비어있는 첫 칸에 "apple" 추가
		list2.add("banana");
		list2.add("cherry");	// 칸이 가득 찼을 때에도 요소 추가 가능
		
		System.out.println("list2 배열에 저장된 객체 개수: " + list2.size());	// 3
		
		System.out.println("list2: " + list2);
		
		// =======================================================================
		System.out.println("=====================================================");
		
		List<Object> list3 = new ArrayList<Object>(2);
		
		list3.add(1);
		list3.add("안녕");
		list3.add(true);
		
		System.out.println("list3 배열에 저장된 객체 개수: " + list3.size());	// 3
		
		System.out.println("list3: " + list3);
		
		// ========================================================================
		System.out.println("======================================================");
		
		List<Object> list4 = new ArrayList<Object>();
		list4.add("사과");
		list4.add("포도");
		list4.add("수박");
		list4.add("포도");
		
		System.out.println("list4 배열에 저장된 객체 개수: " + list4.size());	// 4
		
		System.out.println("list4: " + list4);
		
		System.out.println("indexOf(\"포도\"): " + list4.indexOf("포도"));			// 1
		System.out.println("lastIndexOf(\"포도\"): " + list4.lastIndexOf("포도"));	// 3
		System.out.println("indexOf(\"멜론\"): " + list4.indexOf("멜론"));			// -1
		
		System.out.println("get(2): " + list4.get(2));								// "수박"
		
		Object old = list4.set(0, "딸기");
		
		System.out.println(old);		// 사과 => 바뀌기 전의 요소가 반환됨
		
		System.out.println(list4);
		
		list4.add(0, old);
		
		System.out.println(list4);
		
		Object old2 = list4.remove(1);	// 배열에서 해당 index 요소를 삭제하고 반환
		
		System.out.println(list4);
		System.out.println(old2);
		
		boolean b = list4.remove("포도");// 배열에서 해당 객체를 찾아서 삭제. 찾았다면 true 찾지 못했다면 false
		
		
		
	}
}
