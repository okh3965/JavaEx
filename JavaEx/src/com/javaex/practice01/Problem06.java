package com.javaex.practice01;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scanner.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			if(num%2==0 && i%2==0) {
				sum += i;
			}
			else if(num%2==1 && i%2==1){
				sum += i;
			}
		}
		
		System.out.print("결과값 : " + sum);
		scanner.close();
	}
	
	

}
