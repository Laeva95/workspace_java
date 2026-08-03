package wrapperclass;
class intWrapper extends Object{
	private int num;
	
	public intWrapper(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "" + num;
	}
}

public class Ex1 {

	public static void showData(Object obj) {
		System.out.println(obj.toString());
	}
	
	public static void main(String[] args) {
		
		int num = 3;
		
		intWrapper wrap = new intWrapper(3);
		
		showData(num);
		
		showData(wrap);
		
		showData(new intWrapper(7));
		
	}
}
