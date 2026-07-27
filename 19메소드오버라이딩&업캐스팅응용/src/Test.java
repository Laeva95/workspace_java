// 업캐스팅을 하는 이유

// 부모 클래스
class 해장국{
	// 메소드
	public void 간맞추기() {
		System.out.println("소금치기");
	}
}

// 자식 클래스
class 뼈다귀해장국 extends 해장국{
	// 메소드
	@Override
	public void 간맞추기() {
		System.out.println("뼈다귀 해장국에는 들깨가루 넣기");
	}
	public void 뼈추가하기() {
		System.out.println("뼈추가!");
	}
}

// 자식 클래스
class 콩나물해장국 extends 해장국{
	// 메소드
	@Override
	public void 간맞추기() {
		System.out.println("콩나물 해장국에는 고춧가루 넣기");
	}
	public void 콩나물넣기() {
		System.out.println("콩나물추가!");
	}
}

// 취객 클래스
class 취객{
	public void 해장국_간맞추기(해장국 해장국) {
		해장국.간맞추기();
	}
}

public class Test {

	public static void main(String[] args) {
		취객 취객1 = new 취객();
		해장국 뼈다귀 = new 뼈다귀해장국();
		콩나물해장국 콩나물 = new 콩나물해장국();
		
		취객1.해장국_간맞추기(뼈다귀);		// 업캐스팅 된 자식 클래스를 매개변수로 전달
		취객1.해장국_간맞추기(콩나물);		// 업캐스팅 되지 않은 자식 클래스도 자동적으로 업캐스팅 되어 매개변수로 전달
		
	}
}
