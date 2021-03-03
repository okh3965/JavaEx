package com.javaex.practice02;

public class Problem03 {

	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		c[4] = ',';
		String str = new String(c);
		System.out.printf("%s", str);
	}

}
