package com.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {

	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String source = rootPath + "img.jpg";
	static final String target = rootPath + "img_copy.jpg";
	
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(target);
			
			int data = 0;	// read 1byte, int casting
			
			System.out.println("copy start..");
			while((data = is.read()) != -1) {
				os.write(data);
			}
			System.out.println("copy end..");
		} catch(FileNotFoundException e) {
			System.err.println("file not found");
		} catch (IOException e) {
			System.err.println("copy fail");
		} finally {
			try {
				os.close();
				is.close();
			} catch(Exception e) {
				
			}
		}
		
	}

}
