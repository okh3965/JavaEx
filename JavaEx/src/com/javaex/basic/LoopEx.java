package com.javaex.basic;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		//whileEx01();
		//whileGugu();
		//doWhileEx();
		//infLoop();
		//forGugu();
		//continueEx();
		//breakEx();
		//nestedFor();
		//nestedForStar();
		sixRandom();
	}
	
	private static void sixRandom() {
		for(int i = 1; i <= 6; i++) {
			//System.out.println(Math.random());
			System.out.println((int)(Math.random() * 45) + 1);
		}
		
		//while
	}
	
	private static void nestedForStar() {
		int rowCount = 5;
		for(int row = 1; row <= rowCount; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
		// while
		
	}
	
	private static void nestedFor() {
		for(int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for(int j = 1; j <=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
		//while
		
		
	}
	
	private static void breakEx() {
		int num = 1;
		while(true) {
			if(num%6 == 0 && num%14 == 0)break;
			num++;
		}
		
		System.out.println(num);
	}
	
	private static void continueEx() {
		Scanner scanner = new Scanner(System.in);
		for(int i = 1; i <= 20; i++) {
			if(i%2==0 || i%3==0) { continue; }
			System.out.println(i);
		}
	}
	
	private static void forGugu() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력하세요 ");
		int dan = scanner.nextInt();
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}
	
	private static void infLoop() {
		while(true) {
			System.out.println("Ctrl+C to Quit");
			
		}
	}

	// 최소 1회는 반드시 실행되는 반복문 작성
	private static void doWhileEx() {
		int total = 0;	// 합산 결과
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		do {
			System.out.print("정수를 입력하세요.[0이면 종료] : ");
			num = scanner.nextInt();
			total += num;
		}while(num != 0);
		
		System.out.println("합산값 " + total);
		
		scanner.close();
	}
	
	private static void whileGugu() {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		System.out.print("단을 입력하세요. ");
		int dan = scanner.nextInt();
		
		while(num++ <9) {
			System.out.println(dan + " * " + num + " = " + dan * num);
		}
		
		scanner.close();
	}
	
	private static void whileEx01() {
		int i = 0;
		while(i++ < 5) {	//반복 조건
			System.out.println("I like java" + i);
		}
	}
	
}