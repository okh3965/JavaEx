package com.java.phone;

public class PhoneApp {

	private static String rootPath = System.getProperty("user.dir");

	public static void main(String[] args) {
		System.out.println(rootPath);
		PhoneView pv = new PhoneView();
		
		pv.mainView();
	}

}
