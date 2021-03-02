package com.javaex.practice01;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		//problemOne();
		//problemTwo();
		//problemThree();
		//problemFour();
		problemFive();
	}
	
	private static void problemOne() {
		for(int i = 1; i <= 100; i++) {
			if(i%5 == 0 && i%7 == 0) {
				System.out.println(i);
			}
		}
	}
	
	private static void problemTwo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scanner.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		scanner.close();
	}
	
	private static void problemThree() {
		for (int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.printf("%d*%d=%d\t", j, i, j*i);
			}
			System.out.println();
		}
	}
	
	private static void problemFour() {
		for(int i = 0; i<10; i++) {
			for(int j = i+1; j<=i+10; j++) {
				System.out.printf("%d\t",j);
			}
			System.out.println();
		}
		
	}
	
	private static void problemFive() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num;
		int max= 0;
		for(int i = 0; i < 5; i++) {
			System.out.print("숫자 : ");
			num = scanner.nextInt();
			max = max > num ? max : num;
		}
		System.out.println("최대값은 " + max + "입니다.");
		
		scanner.close();
	}
}
