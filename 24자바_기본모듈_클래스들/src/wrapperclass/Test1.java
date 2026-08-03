package wrapperclass;

public class Test1 {

	public static void main(String[] args) {
		
		Integer i1 = Integer.valueOf(10);
		Integer i2 = new Integer(10);
		
		System.out.println(i1.intValue());
		System.out.println(i2.intValue());
		
		Double d1 = new Double(3.14);
		Double d2 = Double.valueOf(3.14);
		
		System.out.println(d1.doubleValue());
		System.out.println(d2.doubleValue());
		
		
		
	}
}
