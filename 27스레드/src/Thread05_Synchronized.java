
class SafeCountService{
	int count = 0;
	
	public synchronized void increase() {
		count++;
	}
	
	public void increaseBlock() {
		synchronized (this) {
			count++;
		}
	}
}

class SafeIncreaseTask implements Runnable{
	SafeCountService service;
	public SafeIncreaseTask(SafeCountService service) {
		this.service = service;
	}
	@Override
	public void run() {
		for(int i = 1; i <= 1000000; i++) {
			service.increaseBlock();
		}
	}
}

public class Thread05_Synchronized {

	public static void main(String[] args) throws InterruptedException {
		
		SafeCountService service = new SafeCountService();
		
		SafeIncreaseTask task = new SafeIncreaseTask(service);
		
		Thread t1 = new Thread(task, "사람A");
		Thread t2 = new Thread(task, "사람B");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("예상 합계: 2000000");
		System.out.println("실제 합계: " + service.count);
		
	}
}
