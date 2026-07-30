package sec08.exam01;
// 알림 발송 부모 클래스
class Notifier{
	public void send(String msg) {
		System.out.println("[알림] " + msg);
	}
}

class MemberManager{
	
	private Member[] members = new Member[100];
	private int count = 0;
	private int nextId = 1;
	private Validator validator;
	private JoinListener joinListener;
	
	public static class Member{
		private int id;
		private String name;
		private int age;
		
		public Member(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public void setId(int id) { this.id = id; }
		public int getId() { return this.id; }
		public String getName() { return this.name; }
		public int getAge() { return this.age; }
	}
	
	public static interface Validator{
		boolean check(Member member);
	}
	public static interface JoinListener{
		void onJoin(Member member);
	}
	
	public void setValidator(Validator validator) {
		this.validator = validator;
	}
	public void setJoinListener(JoinListener joinListener) {
		this.joinListener = joinListener;
	}
	
	public void join(Member member) {
		if(this.validator.check(member) == false) {
			System.out.println("가입 실패 : 가입 조건(이름 입력, 14세 이상)을 만족하지 않습니다.");
			return;
		}
		
		member.setId(nextId);
		nextId++;
		
		members[count] = member;
		count++;
		
		joinListener.onJoin(member);
	}
	
	public void printAll() {
		System.out.println("-------------------------------");
		System.out.println("[회원 목록] 총 " + count + "명");
		for(Member m : members) {
			System.out.println(m.getId() + " | " + m.getName() + " | " + m.getAge());
		}
		
	}
}



public class MemberManagerExample {

	public static void main(String[] args) {
		
		
		
	}
}
