// 은행 계좌 객체들을 모델링

// 계좌번호, 예금주, 잔액

// 입금, 출금, 잔액확인

public class BankAccountTest {

	// 계좌번호
	String accountNumber;
	
	// 예금주
	String owner;

	// 잔액
	double balance;
	
	
	// 입금
	// 돈을 입금하여 잔액을 증가시킴
	void deposit(double amount) {
		// 입금한 금액만큼 잔액에 증가
		balance += amount;
		
		// 입금 금액, 현재 잔액 출력
		System.out.println(owner + "님의 계좌에 " + amount + "원이 입금되었습니다.");
		System.out.println("현재 잔액: " + balance + "원");
	}
	
	// 출금
	// 돈을 출금하여 잔액을 감소시킴
	void withdraw(double amount) {
		// 잔액보다 많은 금액을 출금하려고 하면 실패
		if(balance < amount) {
			System.out.println("잔액 부족! 출금 실패.");
		}else {
			// 출금한 금액만큼 잔액에서 감소
			balance -= amount;
			
			// 출금 금액, 현재 잔액 출력
			System.out.println(owner + "님의 계좌에서 " + amount + "원이 출금되었습니다.");
			System.out.println("현재 잔액: " + balance + "원");
		}
	}
	
	// 잔액 확인
	// 현재 잔액 정보를 출력함
	void checkBalance() {
		System.out.println(owner + "닙의 현재 잔액: " + balance + "원");
	}
	
	public static void main(String[] args) {
		// 은행 계좌 객체 생성
		BankAccountTest account = new BankAccountTest();
		
		// 계좌 번호, 예금주, 초기잔액 설정
		account.accountNumber = "123-456-789";
		account.owner = "이영희";
		account.balance = 100000;
		
		// 계좌 메서드 사용
		account.deposit(50000);			// 50000원 입금
		account.withdraw(30000);		// 30000원 출금
		account.checkBalance();
		
		
	}
}
