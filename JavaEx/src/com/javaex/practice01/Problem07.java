package com.javaex.practice01;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String yesOrno = new String();
		do {
			System.out.println("========================");
			System.out.println("    [숫자맞추기게임 시작]");
			System.out.println("========================");
	
			double num = Math.random();
			int intValue = (int)(num * 100) + 1;	//num *(최대 - 최소 +1) + 최소
			
			while(true) {
				System.out.print(">>");
				int guess = scanner.nextInt();
				if(guess == intValue)break;
				else if(guess > intValue) {
					System.out.println("더 낮게");
				}
				else {
					System.out.println("더 높게");
				}
			}
			System.out.print("게임을 종료하시겠습니까?(y/n) >>");
			yesOrno = scanner.next();
			
		}while(yesOrno.equals("n"));
		System.out.println("========================");
		System.out.println("    [숫자맞추기게임 종료]");
		System.out.println("========================");
		scanner.close();
	}

}
