import java.util.ArrayList;
import java.util.Vector;

class GenericClass<T>{			// T: 아직 결정되지 않은 자료형
								// 객체가 생성될 때 어떤 자료형인지 결정됨
	private T member;
	
	public void setMember(T member) { this.member = member; }
	
	public T getMember() { return member; }
								// getter, setter 에도 T 키워드를 사용 할 수 있음
}

class Product<K, V>{
	private K kind;
	private V model;
	
	public K getKind() { return kind; }
	public void setKind(K kind) { this.kind = kind; }
	
	public V getModel() { return model; }
	public void setModel(V model) { this.model = model; }
}

public class GenericTest04 {

	public static void main(String[] args) {
		System.out.println("================================");
		
		// 제네릭 클래스의 T가 Double 로 변경됨
		GenericClass<Double> obj01 = new GenericClass<Double>();
		
		obj01.setMember(3.5);
		
		System.out.println(obj01.getMember());
		
		System.out.println("================================");
		
		// 제네릭 클래스의 T가 Integer 로 변경됨
		GenericClass<Integer> obj02 = new GenericClass<Integer>();
		
		obj02.setMember(10);
		
		System.out.println(obj02.getMember());
		
		System.out.println("================================");

		Vector<String> obj04 = new Vector<String>();
		
		obj04.add("문자열1");
		obj04.add("문자열2");
		
		System.out.println("Vector 에 저장된 객체 수: " + obj04.size());
		System.out.println("Vector 의 전체 칸 개수: " + obj04.capacity());
		
		ArrayList<Integer> obj05 = new ArrayList<>();
		
		obj05.add(3);
		obj05.add(4);
		obj05.add(Integer.valueOf(5));
		
	}
}
