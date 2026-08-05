package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// 리플렉션으로 분석할 대상 클래스

class Car2{
	// 필드
	private String model;
	private String owner;
	
	// 생성자
	public Car2() {}
	public Car2(String model) {
		this.model = model;
	}
	public Car2(String model, String owner) {
		this.model = model;
		this.owner = owner;
	}
	
	// 메소드
	public String getModel() { return model; }
	public void setModel(String model) { this.model = model; }
	public String getOwner() { return owner; }
	public void setOwner(String owner) { this.owner = owner; }
	
}

// 리플렉션 실행 클래스
public class ReflectionExample {
	private static void printParameters(Class[] parameters) {
		System.out.print("매개변수: ");
		for (int i = 0; i < parameters.length; i++) {
			String name = parameters[i].getName().substring(parameters[i].getName().lastIndexOf(".") + 1);
			
			System.out.print(name);
			
			if(i < parameters.length - 1) {
				System.out.print(", ");
			}
		}
	}

	public static void main(String[] args) {
		// 클래스 객체를 가져오는 방법
		Class<Car2> cl = Car2.class;
		
		// 클래스 객체의 생성자를 가져오는 방법
		Constructor[] cons = cl.getDeclaredConstructors();		
		
		System.out.println("[생성자 정보]");
		
		for (Constructor c : cons) {
			System.out.print(c.getName() + "(");
			
			Class[] params = c.getParameterTypes();
			printParameters(params);
			System.out.println(")");
		}
		
		System.out.println();

		// ========================================
		// 클래스 객체의 필드 정보
		Field[] fls = cl.getDeclaredFields();
		
		System.out.println("[필드 정보]");
		
		for(Field f : fls) {
			System.out.println(f.getType().getName() + " " + f.getName());
		}

		System.out.println();
		
		// ==========================================
		// 클래스 객체의 메소드 정보
		Method[] ms = cl.getDeclaredMethods();
		
		System.out.println("[메소드 정보]");
		
		for(Method m : ms) {
			System.out.print(m.getName() + "(");
			
			Class[] params = m.getParameterTypes();
			
			printParameters(params);
			System.out.println(")");
		}
		
	}
}
