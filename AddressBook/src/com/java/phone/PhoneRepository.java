package com.java.phone;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneRepository {
	//field
	private static String rootPath = System.getProperty("user.dir");
	private static String phoneDB = rootPath + "\\PhoneDB.txt";

	// constructor
	public void PhoneRepository() {
		
	}
	
	//methods
	public void PhoneList() {
		System.out.println("pl");
		Reader reader = null;
		BufferedReader br = null;
		
		try {
			reader = new FileReader(phoneDB);
			br = new BufferedReader(reader);
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch(FileNotFoundException e) {
			System.err.println("file does not found");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
