import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;	// 파일 경로 객체

public class PrintVsWriterCompare {

	public static void main(String[] args) throws IOException {
		// OutputStream vs Writer
		// OutputStream: int 를 바이트 1개로 취급
		// Writer: int를 char 문자 1개로 취급
		
	 	Path psPath = Path.of("ps_out.txt"); // PrintStream 경로
	 	Path pwPath = Path.of("pw_out.txt"); // PrintWriter 경로
		
	 	// ===========================================================
	 	// 같은 텍스트 데이터 5종을 두 통로로 각각 출력
	 	System.out.println("======= [1] 같은 데이터를 두 통로로 출력 =======");
		
		// PrintStream 출력 스트림 통로 객체 생성
	 	PrintStream ps = new PrintStream("ps_out.txt");
		
	 	// PrintWriter 출력 스트림 통로 객체 생성
	 	PrintWriter pw = new PrintWriter("pw_out.txt");
		
		ps.println(10);
		ps.println(3.14);
		ps.println('A');
		ps.println("가나");
		ps.println("Hello");
		
		pw.println(10);
		pw.println(3.14);
		pw.println('A');
		pw.println("가나");
		pw.println("Hello");
		
		ps.close();
		pw.close();
		
		
		// =============================================================
		// 생성된 두 파일의 크기를 비교
		System.out.println("======= [2] 두 파일의 크기를 비교 =======");
		
		long psSize = Files.size(psPath);
		long pwSize = Files.size(pwPath);
		
		System.out.println("PrintStream 파일 크기 = " + psSize);
		
		System.out.println("PrintWriter 파일 크기 = " + pwSize);
		
		byte[] psBytes = Files.readAllBytes(psPath);
		byte[] pwBytes = Files.readAllBytes(pwPath);
		
		boolean same = java.util.Arrays.equals(psBytes, pwBytes);
		
		System.out.println("두 파일의 바이트 값이 같은가?: " + same);
		
		System.out.println();
		
		// =================================================================
		// write() 차이 실증
		System.out.println("======= [3] write 실증 =======");
		
		PrintStream ps2 = new PrintStream("ps_w.txt");
		PrintWriter pw2 = new PrintWriter("pw_w.txt");
		
		ps2.write(44032);	// 바이트 계열
		pw2.write(44032);	// 문자 계열

		ps2.close();
		pw2.close();
		
		System.out.println(Files.size(Path.of("ps_w.txt")));
		System.out.println(Files.size(Path.of("pw_w.txt")));

		printHex("ps_w.txt");
		printHex("pw_w.txt");
		
	}
	public static void printHex(String str) throws IOException{
		byte[] bytes = Files.readAllBytes(Path.of(str));
		
		System.out.println(str + " 바이트: ");
		
		for(byte b : bytes) {
			System.out.println(" " + String.format("%02X", b & 0xFF));
		}
		System.out.println();
	}
}
