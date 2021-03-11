package com.java.phone;

import java.util.Scanner;

public class PhoneView {

	// field
	
	
	// constructor
	public void PhoneView() {
		
	}
	
	//methods
	public void mainView() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*******************************");
		System.out.println("        전화번호 관리 프로그램        ");
		System.out.println("*******************************");
		while(true) {
			System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
			System.out.println("-------------------------------");
			System.out.print(">메뉴번호:");
			int num = scanner.nextInt();
			switch(num){
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("*****************************");
				System.out.println("           감사합니다           ");
				System.out.println("*****************************");
				break;
			default:
				System.out.println("[다시입력해주세요]");
			}
			if(num==5)break;
		}
		scanner.close();
	}

}
