import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class AutoSaveTask implements Runnable{
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				System.out.println("(데몬스레드) 자동 저장 실행");
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}

class HttpRequestTask implements Runnable{
	int requestNo;
	public HttpRequestTask(int requestNo) {
		this.requestNo = requestNo;
	}
	@Override
	public void run() {
		System.out.println("요청" + requestNo + " 처리 시작 - 담당: " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("요청" + requestNo + " 처리 완료");
	}
}

public class Thread07_DaemonPool {

	public static void main(String[] args) throws InterruptedException {
		Thread autoSave = new Thread(new AutoSaveTask(), "자동 저장 스레드");
		autoSave.setDaemon(true);
		autoSave.start();

		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		for(int i = 1; i <= 5; i++) {
			pool.execute(new HttpRequestTask(i));
		}
		
		pool.shutdown();
		
		Thread.sleep(3500);
		
		System.out.println("main 스레드 종료 -> 데몬 스레드 자동 종료");
	}
}
