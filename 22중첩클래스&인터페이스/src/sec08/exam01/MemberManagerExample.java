package sec08.exam01;

import sec08.exam01.MemberManager.Member;

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
		for(int i = 0; i < count; i++) {
			System.out.println(members[i].getId() + " | " + members[i].getName() + " | " + members[i].getAge());
		}
		
	}
}



public class MemberManagerExample {

	public static void main(String[] args) {
		Notifier notifier = new Notifier() {
			@Override
			public void send(String msg) {
				System.out.println("[SMS 발송] " + msg);
			}
		};	
		
		MemberManager manager = new MemberManager();
		
		manager.setValidator(new MemberManager.Validator() {
			@Override
			public boolean check(MemberManager.Member member) {
				
				if(member.getName() == null || member.getName().trim().length() == 0) {
					System.out.println("이름을 입력해주세요.");
					return false;
				}
				if(member.getAge() < 14) {
					System.out.println("14세 미만은 가입 할 수 없습니다.");
					return false;
				}
				
				return true;
			}
		});
		
		// =======================================================
		
		manager.setJoinListener(new MemberManager.JoinListener() {
			@Override
			public void onJoin(MemberManager.Member member) {
				notifier.send(member.getName() + "님, 가입을 환영합니다!(회원번호: " + member.getId() + ")");
			}
		});
		
		manager.join(new Member("김철수", 20));
		manager.join(new Member("박영희", 35));
		manager.join(new Member("이꼬마", 12));
		manager.join(new Member("     ", 30));
		
		manager.printAll();
	}
}
