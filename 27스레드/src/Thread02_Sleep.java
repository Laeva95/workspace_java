class DownloadTask implements Runnable{
	
	@Override
	public void run() {
		try {
			for(int i = 1; i <= 3; i++) {
				System.out.println(Thread.currentThread().getName() + "... " + i + "/3");
				Thread.sleep(1000);
			}
			System.out.println(Thread.currentThread().getName() + " 작업 완료!");
		} catch (InterruptedException e) {
			System.out.println("작업이 중단되었습니다.");
		}
	}
}

public class Thread02_Sleep {

	public static void main(String[] args) {
		// Thread.sleep(ms): ms 밀리초 만큼 스레드를 일시 정지 시킴
		// Thread.interrupt(): sleep을 통해 정지 시킨 스레드를 다시 실행 시킴
		Thread t1 = new Thread(new DownloadTask(), "파일다운로드 - A");
		Thread t2 = new Thread(new DownloadTask(), "파일다운로드 - B");
		t1.start();
		t2.start();
		
		System.out.println("main 스레드: 두 다운로드 스레드 시작");
	}
}
