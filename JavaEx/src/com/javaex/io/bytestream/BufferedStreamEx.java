package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {

	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String source = rootPath + "img.jpg";
	static final String target = rootPath + "img_buffered_copy.jpg";
	
	public static void main(String[] args) {
		// main stream open
		InputStream is = null;
		OutputStream os = null;
		
		// sub stream open : filtered stream
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(target);
			
			bis = new BufferedInputStream(is);
			bos = new BufferedOutputStream(os);
			
			// buffer create
			byte[] data = new byte[1024];	//1KB
			int size = 0;	// the length of the received data
			
			System.out.println("copy start");
			while((size = bis.read(data)) != -1) {
				System.out.println(size + "byte copied");
				bos.write(data);
			}
			System.out.println("copy end");
		} catch(FileNotFoundException e) {
			System.err.println("file not found");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 보조스트림은 주스트림으로부터 입출력 기능을 수행하므로
				// 보조스트림을 닫으면 주스트림도 닫힌다.
				bis.close();
				bos.close();
			} catch(Exception e) {
				
			}
		}
		
		
	}

}
