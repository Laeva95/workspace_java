class SumTask implements Runnable{
	int max;
	public long result = 0;
	
	public SumTask(int max) {
		this.max = max;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= max; i++) {
			result += i;
		}
		
		System.out.println(Thread.currentThread().getName() + " 계산 완료");
	}
}

public class Thread03_Join {

	public static void main(String[] args) throws InterruptedException {
		SumTask task1 = new SumTask(100);
		Thread t1 = new Thread(task1, "계산기 - 1");
		
		SumTask task2 = new SumTask(1000);
		Thread t2 = new Thread(task2, "계산기 - 2");
		
		// 작업 스레드를 먼저 실행하고, 계산기 스레드 실행
		t1.start();
		t2.start();
		
		// 메인 스레드를 잠깐 정지하고, 계산기 스레드 먼저 실행
		// 계산기 스레드 완료 후 메인 스레드 재실행
		t1.join();
		t2.join();
		
		System.out.println("합계: " + task1.result);
		System.out.println("합계: " + task2.result);
		
		
		
	}
}
