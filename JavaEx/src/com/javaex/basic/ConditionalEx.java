package com.javaex.basic;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ifEx();
		//ifElseEx();
		//ifPractice();
		//switchEx();
		//switchEx2();
		//switchEx3();
		ifPractice02();
	}
	
	private static void ifPractice02() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요. ");
		int score = scanner.nextInt();
		
		/*
		if(score % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		*/
		System.out.println(score + "는" + (score % 3 == 0 ? "3의 배수입니다." : "3의 배수가 아닙니다."));
		
		scanner.close();
	}
	
	private static void prac2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");		
		int score = scanner.nextInt();
		String grade;
		if (score >=90) {
			grade = "A등급";
		} else if(score >=80) {
			grade = "B등급";
		} else if(score >=70) {
			grade = "C등급";
		} else if(score >=60) {
			grade = "D등급";
		} else {
			grade = "E등급";
		} 
		
		System.out.println("당신의 등급은 " + grade + "입니다.");
		scanner.close();
	}
	// java의 case 문에는 char, String도 점검할 수 있다.
	private static void switchEx3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("요일을 입력하세요.");
		String day = scanner.next();
		String message;
		
		switch (day) {
		case "SUN":
			message = "일요일";
			break;
		case "MON":case "TUE":case "WED":case "THU":
			message = "열공";
			break;
		case "FRI":
			message = "불금";
			break;
		case "SAT":
			message = "주말";
			break;
		default:
			message = "?";
		}
		System.out.println(day + "에는 " + message);
		scanner.close();
	}
	//
	private static void switchEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요. ");
		int month = scanner.nextInt();
		
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			System.out.println(month + "월은 31일 입니다.");
			break;
		case 4:case 6:case 9:case 11:
			System.out.println(month + "월은 30일 입니다.");
			break;		
		case 2:
			System.out.println(month + "월은 28일 입니다.");
		default:
			System.out.println("?");
		}
		
		scanner.close();
	}
	
	//switch case
	private static void switchEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목을 선택하세요. \n(1.자바\t2.C\t3.C++\t4.파이썬)");
		System.out.print("과목번호 : ");
		int code = scanner.nextInt();
		
		switch (code) {
		case 1:
			System.out.println("R101호 입니다.");
			break;
		case 2:
			System.out.println("R202호 입니다.");
			break;
		case 3:
			System.out.println("R303호 입니다.");
			break;
		case 4:
			System.out.println("R404호 입니다.");
			break;
		default:
			System.out.println("상담원에게 문의하세요.");			
		}
		
		scanner.close();
		// 이 뒤에서는 scanner의 메서드를 사용할 수 없다.
	}
	
	//연습문제
	private static void ifPractice() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요. \n(1.자바\t2.C\t3.C++\t4.파이썬)");
		System.out.print("과목번호 : ");
		int code = scanner.nextInt();
		
		if(code == 1) {
			System.out.println("R101호 입니다.");
		} else if (code == 2) {
			System.out.println("R202호 입니다.");
		} else if (code == 3) {
			System.out.println("R303호 입니다.");
		} else if (code == 4) {
			System.out.println("R404호 입니다.");
		} else{
			System.out.println("상담원에게 문의하세요.");
		}
		
		scanner.close();
	}
	private static void ifElseEx() {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("정수를 입력하세요 : ");
		int num = scanner.nextInt();	//정수 입력
		/*
		if(num > 0) {
			System.out.println("양수입니다.");
		} else if(num < 0){
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		*/
		
		if (num == 0) {
			System.out.println("0입니다.");
		} else {
			if(num > 0) {
				System.out.println("양수입니다.");
			} else {
				System.out.println("음수입니다.");
			}
		}
		
		scanner.close();		
	}
	
	private static void ifEx() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scanner.nextInt();
		if(score >= 60) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}
		
		
		scanner.close();
	}

}
