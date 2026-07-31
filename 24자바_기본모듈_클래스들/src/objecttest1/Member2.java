package objecttest1;



public class Member2 {

	private final String id;
	private final String name;
	private final int age;
	
	public Member2(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() { return id; }

	public String getName() { return name; }

	public int getAge() { return age; }

	@Override
	public int hashCode() {
		
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		
		return false;
	}

	@Override
	public String toString() {
		
		return "Member[id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
