package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {

	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "thieves.txt";
	
	public static void main(String[] args) {
		//main stream
		Reader reader = null;
		//sub stream
		BufferedReader br = null;
		
		try {
			reader = new FileReader(filename);
			br = new BufferedReader(reader);
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				// line tokenize
				StringTokenizer st = new StringTokenizer(line,	//string to cut
														" ");		//delimiter(default \t\r\n)
				while(st.hasMoreTokens()) {
					String token = st.nextToken();	// get token & move to next token
					System.out.print(token + " ");
				}
				System.out.println();
			}
		} catch(FileNotFoundException e) {
			System.err.println("file not found");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
			
		
		
	}

}
