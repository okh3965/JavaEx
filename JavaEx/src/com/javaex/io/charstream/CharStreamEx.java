package com.javaex.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {

	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "myFile.txt";
	
	public static void main(String[] args) {
		readTextEx();
//		writeTextEx();
	}
	
	private static void readTextEx() {
		Reader reader = null;
		
		try {
			reader = new FileReader(filename);	
			
			int data = 0;	//int(4) -> char(2)
			
			while((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			System.err.println("File not found");	
		} catch (IOException e) {
			
		} finally{
			try {
				reader.close();
			} catch (Exception e) {
				
			}
		}
	}
	
	private static void writeTextEx() {
		//	문자 기반 출력 스트림의 최고 조상은 Writer
		Writer writer = null;
		
		try {
			writer = new FileWriter(filename);
			
			System.out.println("File opened");
			writer.write("Bit Computer\r\n");
			writer.write("Java Programming\r\n");
			writer.write("2021. 03");
			System.out.println("File recorded");
			
			// clear inner buffer 
			writer.flush();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch(Exception e) {
				
			}
			
		}
	}

}
