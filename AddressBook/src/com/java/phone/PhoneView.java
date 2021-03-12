package com.java.phone;

import java.util.Scanner;

public class PhoneView {

	// field
	
	
	// constructor
	public PhoneView() {
		
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
				pr.phoneList();
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
				dm.dbInsert(name, mPhoneNum, PhoneNum);
				break;
			case 3:
				System.out.println("<3.삭제>");
				System.out.print(">번호:");
				int num = scanner.nextInt();
				System.out.println();
				dm.dbDelete(num);
				break;
			case 4:
				System.out.println("<4.검색>");
				System.out.print(">이름:");
				String find = scanner.next();
				pr.phoneListFilter(find);
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
	public void startView() {
		System.out.println("*******************************");
		System.out.println("        전화번호 관리 프로그램        ");
		System.out.println("*******************************");
	}
	
	public void selectView() {
		System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
		System.out.println("-------------------------------");
		System.out.print(">메뉴번호:");
	}
	
	public void listView() {
		PhoneRepository pr = new PhoneRepository();
		System.out.println("<1.리스트>");
		pr.phoneList();
	}
	
	public void registerView(Scanner sc) {
		
		DBModify dm =new DBModify();

		
		System.out.println("<2.등록>");
		System.out.print(">이름");
		String name = sc.next();
		System.out.print(">휴대전화:");
		String mPhoneNum = sc.next();
		System.out.print(">집전화:");
		String PhoneNum = sc.next();
		System.out.println();
		dm.dbInsert(name, mPhoneNum, PhoneNum);
	}
	
	public void deleteView(Scanner sc) {
		
		DBModify dm =new DBModify();
		
		System.out.println("<3.삭제>");
		System.out.print(">번호:");
		int num = sc.nextInt();
		System.out.println();
		dm.dbDelete(num);
	}
	
	public void searchView(Scanner sc) {
		
		PhoneRepository pr = new PhoneRepository();
		
		System.out.println("<4.검색>");
		System.out.print(">이름:");
		String find = sc.next();
		pr.phoneListFilter(find);
	}
	
	public void quitView() {
		System.out.println("<5.종료>");
		System.out.println("*****************************");
		System.out.println("           감사합니다           ");
		System.out.println("*****************************");
	}

}
