
public class Data06 {

	public static void main(String[] args) {
		/*
		  	실수 자료형
		  	float: 4byte 크기이며 끝에 f를 붙여 표현
		  	double: 8byte 크기이며 기본적으로 소수를 표현시 double 자료형으로 간주
		*/
		
		// int a = 23.7	// 컴파일 에러 발생. int 자료형에 소수를 저장할 수 없음
				
		/*
		 	float 자료형 주의사항
		*/
		
		// float b = 23.7;	// 컴파일 에러 발생. double 자료형이 float 자료형보다 크기 때문에 저장할 수 없음

		// 해결책 1. double 자료형에 저장하기
		double c = 23.7;
		
		System.out.println("double형 출력: " + c);
		
		// 해결책 2. float 값임을 명확하게 알려주기
		float d = 23.7f;
		
		System.out.println("float형 출력: " + d);
		
	}
}
