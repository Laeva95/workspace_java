package ex2;

class Account{
	
	private long balance;
	public Account () {}
	
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws  InsufficientException{
		if(balance < money) {
			// 개발자가 강제로 예외를 발생시키는 코드
			throw new InsufficientException("잔고 부족: " + (money - balance) + " 부족함");
		}
		balance -= money;
	}
}
 
class InsufficientException extends Exception{
	public InsufficientException() {}
	public InsufficientException(String msg) {
		super(msg);
		
	}
}

public class AccountExample {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.deposit(10000);
		
		System.out.println("예금액: " + account.getBalance());
		
		try {
			account.withdraw(30000);
		} catch (InsufficientException e) {
			e.printStackTrace();
		}
		
		System.out.println("예금액: " + account.getBalance());
		
		System.out.println("[자바 프로그램 마무리 코드]");
	}
}
