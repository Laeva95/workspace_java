import java.io.*;

public class DataStreamTest2 {

	public static void main(String[] args) {
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
			
			System.out.println(dis.readChar());
			System.out.println(dis.readByte());
			System.out.println(dis.readShort());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
