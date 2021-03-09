package com.javaex.io;

import java.io.File;
import java.io.IOException;


// File class
// file info 
// create & delete file, directory
public class FileEx {
	// 현재 프로젝트 내의 루트 디렉터리 위치
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	
	public static void main(String[] args) {
		
		// File 객체 생성
		File root = new File(rootPath);
		// 파일이 실제 존재하는지 확인
		System.out.println(rootPath + ":" + root.exists());	//파일이 실제 존재?
		// 만약 디렉터리가 존재하지 않으면
		if (!root.exists()) {
			root.mkdirs();
		}
		
		printInfo(root);
		
		// create file
		File file = new File(rootPath + "\\myFile.txt");	// 
		System.out.println("myFile.txt create");
		if(!file.exists()) {	// do not exist file
			try{
				file.createNewFile();	//create new file
			} catch (IOException e) {
				System.err.println("file does not created!");
			}
		}
		printInfo(root);
		
		// delete file
		System.out.println("=> delete myFile.txt ");
		file.delete();
		
		printInfo(root);
	}
	
	private static void printInfo(File file) {
		System.out.println("----------");
		// file -> directory -> file list print
		//		-> file -> file info print
		if(file.isDirectory()) {
			System.out.println("Directory:" + file.getName());
			// file list
			File[] files = file.listFiles();
			// list print
			for(File f:files) {
				System.out.print(f.isDirectory() ? "d " : "f ");
				System.out.println(f.getName() + ":" + f.length());	//file size
			}
		} else {
			System.out.println("File:" + file.getName() + ":" + file.length());
		}
		System.out.println("----------");
	}

}
