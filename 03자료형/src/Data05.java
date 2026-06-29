
public class Data05 {

	public static void main(String[] args) {
		/*
		 	자료형 변환
		 	1. 자동 형변환
		 		표현 범위가 작은 자료형이 큰 자료형으로 저장될 때 컴파일러가 자동으로 형변환함. 
		 		작은 자료형에서 큰 자료형으로 바뀌기 때문에 데이터 손실이 없음.
		 	2. 강제 형변환
		 		표현 범위가 큰 자료형을 작은 자료형으로 강제로 쪼개어 저장하는 형변환. 
		 		할당된 크기를 초과하면 데이터 손실이 발생할 수 있음.
		 */
		byte a = 1;
		short b = 128;
		int c = 32768;
		
		// 2byte 크기의 메모리에 1byte 크기의 자료를 저장하면 자동 형변환이 일어남
		b = a;
		
		System.out.println("자동 형변환 결과(b): " + b);
		
		// 2byte 크기의 메모리에 4byte 크기의 자료를 저장하려면 강제 형변환을 해야함
		b = (short)c;
		
		System.out.println("강제 형변환 결과(b): " + b);		// 오버 플로우 발생
		
	}
}
