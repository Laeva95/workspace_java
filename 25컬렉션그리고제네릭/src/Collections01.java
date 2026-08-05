import java.util.HashSet;
import java.util.Set;

public class Collections01 {

	public static void main(String[] args) {
		
		Set<Object> set = new HashSet<Object>();
		
		System.out.println("set에 저장된 요소 개수: " + set.size());		// 0
		
		set.add("하나");
		set.add(2);						// Integer 타입으로 자동 박싱되어 추가됨
		set.add(3.42);					// Double 타입으로 자동 박싱되어 추가됨
		set.add("넷");
		set.add("five");
		set.add(Integer.valueOf(6));	// 수동 박싱해서 추가
		
		System.out.println("set에 저장된 요소 개수: " + set.size());		// 6
		
		// Set 인터페이스의 자식 클래스 특성 1
		// 	객체 중복 저장 금지
		
		boolean result1 = set.add("여섯");	// 추가 가능하므로 true 반환

		boolean result2 = set.add("하나"); 	// 이미 존재하는 값이므로 추가 불가능 false 반환
		
		boolean result3 = set.add(2);		// 이미 존재하는 값이므로 추가 불가능 false 반환
		
		System.out.println("set에 저장된 요소 개수: " + set.size());		// 7
		
		System.out.println("result1: " + result1 + "\nresult2: " + result2 + "\nresult3: " + result3);
	
		// 특성 2
		// 	저장되는 순서 랜덤
		System.out.println(set.toString());	// [2, 6, 넷, 하나, 여섯, 3.42, five]
		
	}
}
