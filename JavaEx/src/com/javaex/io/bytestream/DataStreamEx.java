package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	// 바이트 기반 스트림은 기본 데이터 타입을 저장할 수 없다.
	// DataInputStream, DataOutputStream을 이용하면 기본타입을 변환 저장
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "primitives.txt";
	
	public static void main(String[] args) {
		//exportPrimitives();
		importPrimitives();
	}

	private static void importPrimitives() {
		//main stream
		InputStream is = null;
		//sub stream
		DataInputStream dis = null;
		
		try {
			is = new FileInputStream(filename);
			dis = new DataInputStream(is);
			
			for(int i = 0; i < 2; i++) {	//load 2-pair data
				//the type must be called up in the order in which it was printed.
				String s = dis.readUTF();
				boolean b = dis.readBoolean();
				int val = dis.readInt();
				float f = dis.readFloat();
				
//				double d = dis.readDouble();	// -> Error
				System.out.printf("%s, %b, %d, %f%n", s, b, val, f);
			}
		} catch(FileNotFoundException e) {
			System.err.println("file not found");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
			}catch(Exception e) {
				
			}
		}
	}
	
	
	private static void exportPrimitives() {
		//main stream
		OutputStream os = null;
		//sub stream
		DataOutputStream dos = null;
		
		try {
			os = new FileOutputStream(filename);
			dos = new DataOutputStream(os);
			
			// normal type
			// String-> boolean -> int -> float
			dos.writeUTF("Hong");	//String print
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.3f);
			
			dos.writeUTF("Kim");
			dos.writeBoolean(false);
			dos.writeInt(30);
			dos.writeFloat(99.9f);
			
			System.out.println("Data output completed");
		} catch(IOException e) {
			
			
		} finally {
			try {
				dos.close();
			} catch(Exception e) {
				
			}
		}
	}
}
