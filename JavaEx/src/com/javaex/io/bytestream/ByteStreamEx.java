package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteStreamEx {

	public static void main(String[] args) {
		// 입력 소스
		byte input[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// 목적지
		byte output[] = null;
		
		System.out.println("Original:" + Arrays.toString(input));
		// Stream open
		InputStream bis = null;
		OutputStream bos = null;
		
		try {
			bis = new ByteArrayInputStream(input);
			bos = new ByteArrayOutputStream();
			
			// variable for input
			int data = 0;
			
			while((data = bis.read()) != -1) {//Returns -1 if there is no data to read
//				data = bis.read();	//1 byte read
				System.out.println("read Data : " + data);
				//
				bos.write(data);
			}
			
			// output to a target array
			output = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println("Output:" + Arrays.toString(output));
			
		} catch(IOException e) {
			// IO Exception handling
			e.printStackTrace();
		} finally {	//resources management
//			if(bos !=null)
//				bos.close();	//IO Exception occur
//			if(bis !=null)
//				bis.close();
			try {
				bos.close();
				bis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
