import java.nio.file.Path;	// 파일 경로 객체

public class PrintVsWriterCompare {

	public static void main(String[] args) {
		// OutputStream vs Writer
		// OutputStream: int 를 바이트 1개로 취급
		// Writer: int를 char 문자 1개로 취급
		
	 	Path psPath = Path.of("ps_out.txt"); // PrintStream 경로
	 	Path pwPath = Path.of("pw_out.txt"); // PrintWriter 경로
		
	 	// ===========================================================
	 	// 같은 텍스트 데이터 5종을 두 통로로 각각 출력
	 	System.out.println("======= [1] 같은 데이터를 두 통로로 출력 =======");
		
		
		
		
		
		
	}
}
