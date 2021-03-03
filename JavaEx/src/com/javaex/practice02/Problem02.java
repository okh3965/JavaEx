package com.javaex.practice02;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		int values[] = new int[5];
		double average = 0;
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			values[i] = scanner.nextInt();
			average += values[i];
		}
		scanner.close();
		average /= 5;

		System.out.println("평균은 " + average + " 입니다.");
	}
	

}
