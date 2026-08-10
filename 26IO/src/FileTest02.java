import java.io.File;

public class FileTest02 {

	public static void main(String[] args) {
		File fileDir = new File(".");
		
		String[] strs = fileDir.list();
		
		for(String s : strs) {
			System.out.println(s);
		}
		
		
		
	}
}
