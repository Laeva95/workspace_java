import java.io.*;
public class ReaderWriterTest03 {

	public static void main(String[] args) throws IOException {
		// 사용자가 키보드로 입력한 파일이름을 저장할 변수
		String fileName = null;
		
		// 파일에 저장할 내용을 한 줄씩 읽어서 담아둘 변수
		String buf = null;
		
		// 키보드로 입력받은 데이터를 한 줄씩 읽어서 저장할 BufferedReader 입력 스트림 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("파일 이름을 입력하세요: ");
		
		// 사용자가 엔터를 누르기 전까지 입력한 값을 읽어들임
		fileName = br.readLine();
		
		System.out.println("파일에 기록할 내용을 입력하세요.");
		
		// 사용자가 입력한 내용을 파일에 저장하기 위한 BufferedWriter 출력 스트림 생성
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		
		while((buf = br.readLine()) != null) {
			// 읽은 한 줄의 내용을 파일에 저장
			bw.write(buf);
			bw.newLine();		// 한 줄 줄바꿈 추가
		}
		br.close();
		bw.close();
		
	}
}
