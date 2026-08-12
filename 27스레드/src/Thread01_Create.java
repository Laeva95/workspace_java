class MyThread extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <= 3; i++) {
			System.out.println(this.getName() + " 실행: " + i);
		}
	}
}
class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread() + " 실행: " + i);
		}
	}
}
public class Thread01_Create {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.setName("상속 스레드");
		t1.start();				// 스레드를 만들고 run() 메소드를 실행시키는 명령어
		
		MyRunnable task = new MyRunnable();
		Thread t2 = new Thread(task);
		t2.setName("구현 스레드");
		t2.start();
		
		System.out.println("main 스레드 코드 실행");
		
	}
}
