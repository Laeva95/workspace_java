class Alphabet{
	public static void printAlphabet(Alphabet alphabet) {
		alphabet.display();
	}
	public void display() {
		System.out.println("I am the parent class:Alphabet");
	}
}

class A1 extends Alphabet{
	@Override
	public void display() {
		System.out.println("I am class A1");
	}
}

class B1 extends Alphabet{
	@Override
	public void display() {
		System.out.println("I am class B1");
	}
}

class C1 extends Alphabet{
	@Override
	public void display() {
		System.out.println("I am class C1");
	}
}


public class Test2 {

	public static void main(String[] args) {

		Alphabet.printAlphabet(new A1());
		Alphabet.printAlphabet(new B1());
		Alphabet.printAlphabet(new C1());
		
	}
}
