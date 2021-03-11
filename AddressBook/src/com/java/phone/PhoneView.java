package com.java.phone;

import java.util.Scanner;

public class PhoneView {

	// field
	
	
	// constructor
	public void PhoneView() {
		
	}
	
	//methods
	public void mainView() {
		PhoneRepository pr = new PhoneRepository();
		DBModify dm =new DBModify();
		Scanner scanner = new Scanner(System.in);
		System.out.println("*******************************");
		System.out.println("        전화번호 관리 프로그램        ");
		System.out.println("*******************************");
		while(true) {
			System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
			System.out.println("-------------------------------");
			System.out.print(">메뉴번호:");
			int menu = scanner.nextInt();
			switch(menu){
			case 1:
				System.out.println("<1.리스트>");
				pr.PhoneList(dm.lst);
				break;
			case 2:
				System.out.println("<2.등록>");
				System.out.print(">이름");
				String name = scanner.next();
				System.out.print(">휴대전화:");
				String mPhoneNum = scanner.next();
				System.out.print(">집전화:");
				String PhoneNum = scanner.next();
				System.out.println();
				dm.DBInsert(name, mPhoneNum, PhoneNum);
				break;
			case 3:
				System.out.println("<3.삭제>");
				System.out.print(">번호:");
				int num = scanner.nextInt();
				System.out.println();
				dm.DBDelete(num);
				break;
			case 4:
				System.out.println("<4.검색>");
				System.out.print(">이름:");
				String find = scanner.next();
				pr.PhoneListFilter(dm.lst, find);
				break;
			case 5:
				System.out.println("<5.종료>");
				System.out.println("*****************************");
				System.out.println("           감사합니다           ");
				System.out.println("*****************************");
				break;
			default:
				System.out.println("[다시입력해주세요]");
			}
			if(menu==5) {
				scanner.close();
				break;
				}
		}
		
	}

}
