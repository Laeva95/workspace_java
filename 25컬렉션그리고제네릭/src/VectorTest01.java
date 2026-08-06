import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		// 4개의 객체 요소를 저장 할 수 있는 Vector 클래스 객체 생성
		Vector vector = new Vector(4, 3); // 기본 4칸, 가득차면 3칸씩 추가
		
		System.out.println("capacity(): " + vector.capacity());	// 4 => vector의 현재 최대 용량을 알려주는 메소드
		
		System.out.println("size(): " + vector.size());		// 0 => vector의 현재 요소 개수를 알려주는 메소드
		
		for(int i = 0; i < 5; i++) {
			vector.add(i * 10);
		}
		
		System.out.println("capacity(): " + vector.capacity());	// 7 => 기본 4칸에 추가 3칸
		
		System.out.println("size(): " + vector.size());		// 5 => 반복문으로 요소 5개 추가됨
		
		for(int i = 0; i < vector.size(); i++) {
			System.out.print("   " + vector.get(i));
		}
		
		System.out.println();
		
		System.out.println(vector.lastElement());
		
		System.out.println(vector.firstElement());
		
		
	}
}
