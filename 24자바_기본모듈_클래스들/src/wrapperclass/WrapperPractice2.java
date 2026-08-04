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
		// 매개변수가 null 이거나 "" 공백인지 확인
		if(str == null || str == "") {
			return false;
		}
		// 매개변수에 숫자가 아닌 값이 있는지 확인
		for(char cs : str.trim().toCharArray()) {
			if(!Character.isDigit(cs)) {
				return false;
			}
		}
		return true;
	}
	
	public static Integer toInteger(String str) {
		if(!isNumeric(str)) {
			return null;
		} else {
			return Integer.parseInt(str.trim());
		}
	}
	
	public static Double calculateBMI(Integer height, Integer weight) {
		// 키나 몸무게가 null 이라면 null 반환
		if(height == null || weight == null) {
			return null;
		}
		// 키를 100.0으로 나누어서 저장
		double meter = height / 100.0;
		// 키나 몸무게가 0 이하라면 잘못된 데이터이므로 null 반환
		if(meter <= 0 || weight <= 0) {
			return null;
		}
		return weight / (meter * meter);
	}
	
	public static HealthInfoEntity createHealthInfo(String age, String height, String weight) {
		// 매개변수가 null 값인지 확인 후 trim() 메소드로 앞뒤 빈 공백 제거
		age 	= age 	 == null ? null : age.trim();
		height	= height == null ? null : height.trim();
		weight 	= weight == null ? null : weight.trim();
		
		// 입력한 매개변수를 문자열에서 숫자로 변환
		Integer a = toInteger(age);
		Integer h = toInteger(height);
		Integer w = toInteger(weight);
		
		Double bmi = calculateBMI(h, w);
		
		HealthInfoEntity dto = new HealthInfoEntity(a, h, w, bmi);
		
		System.out.println("DB 저장 가정 -> INSERT INTO 테이블명 VALUES(a, h, w, bmi);");
		dto.printData();

		return dto;
	}
}


public class WrapperPractice2 {

	public static void main(String[] args) {
		String ageInput = "32";
		String heightImput = "175";
		String weightInput = "60";
		
		HealthInfoEntity dto = HealthInfoService.createHealthInfo(ageInput, heightImput, weightInput);
		
	}
}
