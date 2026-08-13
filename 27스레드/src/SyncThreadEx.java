import java.util.Stack;

class AutoMachine{
	Stack store = new Stack();
	public synchronized String getDrink() {
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return store.pop().toString();
	}
	public synchronized void putDring(String drink) {
		store.push(drink);
		this.notify();
	}	
	
}

class Producer implements Runnable{
	private AutoMachine machine;
	public Producer(AutoMachine machine) {
		this.machine = machine;
	}
	@Override
	public void run() {
		for(int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : 음료수No." + i + "공급");
			machine.putDring("음료수No." + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable{
	private AutoMachine machine;
	public Consumer(AutoMachine machine) {
		this.machine = machine;
	}
	@Override
	public void run() {
		for(int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + machine.getDrink() + " 구입");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class SyncThreadEx {

	public static void main(String[] args) {
		AutoMachine machine = new AutoMachine();
		
		new Thread(new Producer(machine), "정우 공급자 스레드").start();
		
		new Thread(new Consumer(machine), "길동 소비자 스레드").start();
		
	}	
}
