import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListTest01 {

	public static void main(String[] args) {
		// LinkedList 클래스는 List, Queue, Deque 인터페이스를 구현하고 있음
		Queue queue = new LinkedList();		// 업 캐스팅 활용
		
		queue.offer("1");
		queue.offer("2");
		queue.offer("3");
		queue.offer("4");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		System.out.println(queue.isEmpty());
		
		System.out.println("=================================");
		// =============================================
		// ArrayList의 삭제 동작
		// 삭제된 뒤의 요소들이 앞으로 하나씩 복사되어 이동함
		
		List<Integer> list = new ArrayList<Integer>(2);
		
		list.add(10);						// 자동 박싱
		list.add(20);
		list.add(30);
		
		System.out.println("ArrayList: ");

		for(int i : list) {					// 자동 언박싱
			System.out.println(i + " ");
		}
		
		list.remove(1);
		
		System.out.println("===================================");
		// ================================================
		// LinkedList의 삭제 동작
		// 삭제된 값과 연결 되어 있던 앞 뒤 요소들을 서로 연결함
		
		List<Integer> list2 = new LinkedList<Integer>();
		
		list2.add(40);
		list2.add(50);
		list2.add(60);
		
		System.out.println("LinkedList: ");

		for(int i : list2) {					// 자동 언박싱
			System.out.println(i + " ");
		}
		
		list2.remove(1);
	}
}
