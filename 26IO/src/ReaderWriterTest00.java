import java.io.*;
public class ReaderWriterTest00 {

	public static void main(String[] args) throws IOException {
		int data = -1;
		
		Reader reader = new InputStreamReader(System.in);
		
		while(true) {
			data = reader.read();
			
			if(data == -1) {
				break;
			}
			
			System.out.println((char)data);
		}
		
	}
}
