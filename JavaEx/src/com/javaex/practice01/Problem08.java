package com.javaex.practice01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {

		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("----------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("----------------------");
			System.out.print("선택>");
			int num = scanner.nextInt();
			int money;
			boolean flag = false;
			switch(num) {
			case 1:
				System.out.print("예금액>");
				money = scanner.nextInt();
				sum += money;
				break;
			case 2:
				System.out.print("출금액>");
				money = scanner.nextInt();
				sum -= money;
				break;		
			case 3:
				System.out.println("잔고액>" + sum);
				break;
			case 4:
				System.out.println("프로그램 종료");
				flag = true;
				break;
			default:
				System.out.println("다시입력해주세요.");
			}
			if(flag)break;
		}
	}

}
