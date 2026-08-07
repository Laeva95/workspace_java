import java.util.List;
import java.util.Vector;

public class Collections05 {

	public static void main(String[] args) {
		List vector = new Vector();
		
		vector.add("Apple");
		vector.add("banana");
		vector.add("oRANGE");
		
		String temp;
		
		for(int i = 0; i < vector.size(); i++) {
			Object obj = vector.get(i);
			temp = (String)obj;
			System.out.println(temp.toUpperCase());
		}
		
		
		
		
		
	}	
}
