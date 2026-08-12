package niotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class IoVsNioCompare {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 3가지 방법을 사용해서 비교
		
		// [1] IO 스트림
		System.out.println("=====[1] IO 스트림 쓰기=====");
		
		FileOutputStream fos = new FileOutputStream("io_data.txt");
		
		fos.write(65);
		fos.write(66);
		fos.write(67);
		
		fos.close();		// 개발자가 직접 스트림을 닫아야함
		
		System.out.println("io_data.txt 저장 완료(IO 패키지 방식");
		System.out.println();
		
		System.out.println("=====[2] IO 스트림 읽기=====");
		
		FileInputStream fis = new FileInputStream("io_data.txt");
		
		int b;
		
		while((b = fis.read()) != -1) {
			System.out.println("IO read() = " + b);
		}
		
		fis.close();		// 개발자가 직접 스트림을 닫아야함
		
		System.out.println("io_data.txt 읽기 완료(IO 패키지 방식)");
		System.out.println();
		
		// =====================================================
		// [2] NIO Files 클래스
		System.out.println("=====[3] NIO Files 클래스 쓰기, 읽기=====");
		
		Path nioPath = Path.of("nio_files_data.txt");
		
		Files.writeString(nioPath, "ABC", StandardCharsets.UTF_8);
		
		System.out.println("nio_files_data_txt 저장 완료(NIO Files 클래스 방식)");
		
		String result = Files.readString(nioPath, StandardCharsets.UTF_8);
		
		System.out.println("NIO Files 클래스로 읽기 결과: " + result);
		System.out.println();
		
		// =========================================================
		// [3] NIO 채널 + 버퍼
		System.out.println("=====[4] NIO 채널 + 버퍼=====");
		
		Path chPath = Path.of("nio_channel_data.txt");
		
		FileChannel ch = FileChannel.open(chPath, StandardOpenOption.CREATE, 
				StandardOpenOption.READ, StandardOpenOption.WRITE);
		
		ByteBuffer writerBuf = ByteBuffer.allocate(10);
		
		writerBuf.put((byte)65);
		writerBuf.put((byte)66);
		writerBuf.put((byte)67);
		
		writerBuf.flip();
		
		int written = ch.write(writerBuf);
		
		System.out.println("FileChannel 채널 영역으로 파일에 쓴 byte 수 = " + written);
		System.out.println();
		
		
		
	}
}
