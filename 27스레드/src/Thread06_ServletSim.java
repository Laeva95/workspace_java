class BadLoginServlet{
	String loginId;
	
	public String service(String userId) {
		loginId = userId;
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return loginId + "님 환영합니다.";
	}
}
class GoodLoginServlet{
	public String service(String userId) {
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return userId + "님 환영합니다.";
	}
}

class LoginRequest implements Runnable{
	BadLoginServlet bad;
	GoodLoginServlet good;
	String userId;
	public LoginRequest(BadLoginServlet bad, GoodLoginServlet good, String userId) {
		this.bad = bad;
		this.good = good;
		this.userId = userId;
	}
	@Override
	public void run() {
		String badResult = bad.service(userId);
		String goodResult = good.service(userId);
		
		System.out.println("[" + userId + "의 로그인 요청]");
		System.out.println("잘못된 서블릿 : " + badResult + " / 올바른 서블릿 : " + goodResult);
		
		
		
	}
}
public class Thread06_ServletSim {

	public static void main(String[] args) throws InterruptedException {
		BadLoginServlet bad = new BadLoginServlet();
		GoodLoginServlet good = new GoodLoginServlet();
		
		Thread t1 = new Thread(new LoginRequest(bad, good, "홍길동"));
		Thread t2 = new Thread(new LoginRequest(bad, good, "이순신"));
		Thread t3 = new Thread(new LoginRequest(bad, good, "김유신"));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
	}
}
