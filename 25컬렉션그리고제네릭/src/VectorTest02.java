import java.util.Enumeration;
import java.util.Vector;

public class VectorTest02 {

	public static void main(String[] args) {
		Vector vector = new Vector();
		
		System.out.println(vector.capacity());
		
		double[] arr = new double[] { 38.6, 9.2, 45.3, 6.1, 4.7, 1.6 };
		
		for(int i = 0; i < arr.length; i++) {
			vector.add(arr[i]);
		}
		
		for(int i = 0; i < vector.size(); i++) {
			System.out.print(vector.get(i) + "\t");
		}
		
		System.out.println();
		
		System.out.println("===================================================");
		
		double searchData = 6.1;
		
		if(vector.indexOf(searchData) != -1) {
			System.out.println(searchData + " 값이 존재합니다!");
		}else {
			System.out.println(searchData + " 값이 존재하지 않습니다!");
		}
		
		System.out.println("====================================================");
		
		double delData = 45.3;
		
		if(vector.remove(delData)) {
			System.out.println(delData + " 값을 삭제했습니다!");
		}else {
			System.out.println(delData + " 값이 존재하지 않습니다!");
		}
		
		System.out.println("====================================================");
		
		Enumeration enu = vector.elements();
		
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
			
		}
		
		
		
	}
}
