import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class FileTest01 {

	public static void main(String[] args) throws IOException{
		byte[] byteFileName = new byte[100];
		
		System.out.print("정보를 확인할 파일명을 입력하세요: ");
		
		// 입력한 문자열을 byteFileName 변수에 저장
		System.in.read(byteFileName);
		
		String fileName = null;
		
		// 저장한 byte[] 을 String으로 변환 후 앞뒤 공백 제거
		fileName = new String(byteFileName).trim();
		
		File file = new File(fileName);
		
		if(!file.exists()) {
			// 파일이 존재 하지 않으면 안내 메세지만 출력
			System.out.println(fileName + " -> 존재하지 않는 파일(경로)입니다!");
			System.out.println("입력한 상대 경로가 절대 경로로 어떻게 해석되는지 확인 : " + file.getAbsolutePath());
			
			return;
		}
		
		System.out.println(fileName + " 파일 상세 내용 출력 **************************");
		
		System.out.println(fileName + " 파일 실제 만들어져 있는 절대 경로 : " + file.getAbsolutePath());
		
		// lastModified(): 파일이 마지막으로 수정된 시간을 밀리초 정수로 반환
		// => 사람이 읽을 수 있는 날짜로 바꾸기 위해 new Date() 생성자에 넣어 변환함
		
		Date date = new Date(file.lastModified());
		
		System.out.println("파일이 마지막으로 수정된 날짜: " + date);
		
		// length(): 파일 크기를 byte 단위로 반환
		System.out.println("파일의 크기: " + file.length() + " byte");
		
		// getName(): 파일이 저장된 경로를 제외한 순수한 파일명만 반환
		System.out.println("파일의 이름: " + file.getName());
		
		// canRead(): 파일을 읽기 모드로 열어 읽을 수 있는지 여부를 반환
		System.out.println("파일의 내용을 읽을 수 있는지 여부: " + file.canRead());
		
		// isHidden(): 파일이 숨김 상태인지 여부를 반환
		System.out.println("파일이 숨김 상태인지 여부: " + file.isHidden());
		
		// getParent(): 이 파일이 들어있는 부모 디렉터리 경로 반환
		System.out.println("파일이 저장된 상위 디렉터리 이름: " + file.getParent());
		
	}
}
