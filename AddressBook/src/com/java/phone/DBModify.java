package com.java.phone;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class DBModify {
	//field
	private static String rootPath = System.getProperty("user.dir");
	private static String phoneDB = rootPath + "\\PhoneDB.txt";
	public List<Person> lst = new ArrayList<>();
	//constructor
	public DBModify() {
		
	}
	
	//methods
	public void DBInsert(String name, String mPhone, String Phone) {
		
		Writer writer = null;
		
		BufferedWriter bw = null;		
		Person person = new Person(name, mPhone, Phone);
		String form = name + "," + mPhone + "," + Phone;		
		lst.add(person);
		System.out.println(lst);
		try {
			writer = new FileWriter(phoneDB, true);
			bw = new BufferedWriter(writer);
			bw.write(form);
			bw.newLine();
		} catch(FileNotFoundException e) {
			System.err.println("file does not found");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.print(lst);
		System.out.println("[등록되었습니다.]");
	}
	
	public void DBDelete(int num) {	
		lst.remove(num);
		System.out.println(lst);
		System.out.println("[삭제되었습니다.]");
	}
	
	
}
