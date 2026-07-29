package sec06.exam03;
// 버튼을 클릭했을 때 발생하는 이벤트를 처리하는 객체를 중첩 인터페이스를 통해 구현

// 바깥 클래스
class Button{
	// 외부에서 접근이 불가능하도록 막고, 바깥 클래스 객체 생성 없이 사용하기 위한
	// 정적 중첩 인터페이스
	public static interface ClickListener{
		void onClick();		// 클릭하는 동작을 등록시키는 메소드
	}
	
	// 바깥 클래스의 객체 변수
	private ClickListener clickListener;	// 자식 객체들을 타입 관계없이 모두 전달받기 위한 업캐스팅
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	// 바깥 클래스의 객체 메소드
	// Button 객체가 클릭 되어 클릭 이벤트가 발생했을 때 이벤트를 처리하는 메소드
	public void click() {
		this.clickListener.onClick();
	}
}

public class ButtonExample {

	public static void main(String[] args) {
		
		// Button 객체 생성
		Button btnOK = new Button();
		Button btnCancle = new Button();
		
		// 로컬 중첩 클래스로 자식 클래스 생성
		// 중첩 인터페이스 내부의 추상 메소드를 강제로 재정의 해서 생성
		class OkListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Button btnOk = new Button() 버튼을 클릭했음!");		// click 이벤트 발생 시 호출
			}
		}
		
		class CancleListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Button btnCancle = new Button() 버튼을 클릭했음!");	// click 이벤트 발생 시 호출
			}
		}
		
		// Button 객체의 ClickListener 변수에 이벤트 처리 객체 등록
		btnOK.setClickListener(new OkListener());
		btnCancle.setClickListener(new CancleListener());
		
		// click 메소드 호출
		btnOK.click();
		btnCancle.click();
		
	}
}
