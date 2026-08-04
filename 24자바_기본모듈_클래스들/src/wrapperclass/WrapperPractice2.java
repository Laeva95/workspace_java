package wrapperclass;

class HealthInfoEntity{
	// 변수
	Integer age;
	Integer height;
	Integer weight;
	Double bmi;
	
	// 생성자
	public HealthInfoEntity(Integer age, Integer height, Integer weight, Double bmi) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
	}
	
	// 메서드
	public void printData() {
		System.out.println("======== DB 저장 데이터 출력 =========");
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		System.out.println("체중: " + weight);
		System.out.println("bmi: " + bmi);
	}
}

class HealthInfoService{
	public static boolean isNumeric(String str) {
		if(str == null || str == "") {
			return false;
		}
		for(char cs : str.trim().toCharArray()) {
			if(!Character.isDigit(cs)) {
				return false;
			}
		}
		
		return true;
	}
	
	
}


public class WrapperPractice2 {

	public static void main(String[] args) {
		
		
		
		
		
		
		
	}
}
