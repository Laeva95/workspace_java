import java.io.File;
import java.io.IOException;

public class FileTest02 {

	public static void main(String[] args) throws IOException {
		File fileDir = new File(".");
		
		String[] strs = fileDir.list();
		
		for(String s : strs) {
			System.out.println(s);
		}
		
		File file = new File("C:\\a\\d.txt");
		
		if(file.delete()) {
			System.out.println(file.getName() + "삭제 완료");
		}else {
			System.out.println(file.getName() + "삭제 실패");
		}
		
		System.out.println("=========================================");
		
		File file2 = new File("C:\\a\\b");
		
		// 해당 경로, 이름의 디렉터리 생성
		file2.mkdir();
		
		if(file2.isDirectory()) {
			System.out.println("b는 디렉터리입니다.");
		}else {
			System.out.println("b는 디렉터리가 아닙니다.");
		}
		
		file2 = new File("C:\\a\\c");
		
		// 해당 경로, 이름의 파일 생성
		file2.createNewFile();
		
		if(file2.isFile()) {
			System.out.println("c는 파일입니다.");
		}else {
			System.out.println("c는 파일이 아닙니다.");
		}
		
		File file3 = new File("C:\\c\\a");
		
		// 해당 경로, 이름의 상위 디렉터리를 포함한 디렉터리 생성
		file3.mkdirs();
		
		File file4 = new File("C:\\x\\y\\z");
		file4.mkdirs();
		
	}
}
