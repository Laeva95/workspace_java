/*
 	DataOutputStream
 		자바의 기본 자료형을 저장하기 위한 스트림
 	
 	DataInputStream
 		DataOutputStream 을 통해 저장한 기본 자료형을 읽어들이는 스트림
 
 */

import java.io.*;

public class DataStreamTest1 {

	public static void main(String[] args) {
		char c = 'a';
		byte b = 10;
		short s = 20;
		int i = 100;
		float f = 3.14f;
		double d = 1.5;
		
		String str = "hello";
		
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
			
			dos.writeChar(c);
			dos.writeByte(b);
			dos.writeShort(s);
			dos.writeInt(i);
			dos.writeFloat(f);
			dos.writeDouble(d);
			dos.writeUTF(str);
			
			dos.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
