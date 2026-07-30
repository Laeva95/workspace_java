package sec08.exam02;


class LoginController{
	
	public static interface LoginListener{
		void onSuccess(String userId);
		void onFail(String reason);
	}
	
	// 이 예제에서는 가입된 회원이 1명이라고 가정하고 상수로 선언
	private static final String SAVED_ID = "hong";
	private static final String SAVED_PASSWORD = "1234";
	
	private LoginListener loginListener;
	
	public void setLoginListener(LoginListener loginListener) {
		this.loginListener = loginListener;
	}
	
	public void login(String id, String password) {
		
		System.out.println("[요청] POST / login id = " + id);
		
		// ID나 PASSWORD가 저장된 값과 다르다면 로그인 실패
		if(!SAVED_ID.equals(id)) {
			loginListener.onFail("존재하지 않는 아이디입니다.");
			return;
		}
		if(!SAVED_PASSWORD.equals(password)) {
			loginListener.onFail("잘못된 비밀번호입니다.");
			return;
		}
		
		// ID와 PASSWORD가 모두 저장된 값과 동일하다면 로그인 성공
		loginListener.onSuccess(id);
		
	}
	
}


public class LogInExample {

	public static void main(String[] args) {
		
		LoginController controller = new LoginController();
		
		controller.setLoginListener(new LoginController.LoginListener() {
			@Override
			public void onSuccess(String userId) {
				System.out.println("[응답 200] 로그인 성공! " + userId + "님, 메인 페이지로 이동합니다.");
			}
			@Override
			public void onFail(String reason) {
				System.out.println("[응답 401] 로그인 실패 - " + reason + " 로그인 요청하는 페이지를 다시 표시합니다.");
			}
		});
		
		
		controller.login("hong", "1234");
		controller.login("hong", "9999");
		controller.login("park", "1234");
		
	}
}
