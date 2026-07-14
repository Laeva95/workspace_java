// 학교에서 학생 한명의 정보를 관리
// 이름, 학번, 국어/영어/수학 점수를 저장하고, 평균을 계산해서 출력
public class StudentTest {
	
	String name;				// 학생 이름
	String studentId;			// 학생 학번
	int kor, eng, math;			// 학생 국어, 영어, 수학 성적
	
	// 학생 성적 평균을 출력하는 메서드
	void calcAverage() {
		double avg = (kor + eng + math) / 3.0;
		System.out.println(name + "님의 평균 점수: " + avg + "점");
	}
	
	// 학생 정보를 출력하는 메서드
	void printInfo() {
		System.out.println("학번: " + studentId + ", 이름: " + name);
	}
	

	public static void main(String[] args) {
		
	    StudentTest st = new StudentTest();
		
	    // 멤버 변수 설정
	    st.name = "김민준";
	    st.studentId = "2026001";
	    st.kor = 90;
	    st.eng = 85;
	    st.math = 95;
	    
	    // 메서드 호출
	    st.printInfo();
	    st.calcAverage();
	    
	    
	}
}
