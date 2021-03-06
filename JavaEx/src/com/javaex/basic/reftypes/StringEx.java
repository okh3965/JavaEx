package com.javaex.basic.reftypes;

public class StringEx {

	public static void main(String[] args) {
		//stringTest();
		stringFormatEx();
	}
	
	private static void stringFormatEx() {
		// %s 문자열, %d 10진 정수, %n 개행
		String fruit = "사과";
		int total = 10;
		int eat = 3;
		
		System.out.println(total + "개의 " + fruit + "중에서 " + eat + "개를 먹었다.");
		
		// -> formatting
		String fmt = "%d개의 %s중에서 %d개를 먹었다%n";
		System.out.printf(fmt, total, fruit, eat);
		System.out.printf(fmt, 5, "오렌지", 2);
		System.out.printf("%d개의 %s중에서 %d개를 먹었다.", total, fruit, eat);
		
		//
		System.out.printf("현재이자율은 %f입니다.%n", 1.25f);
		fmt = "현재이자율은 %.2f입니다.%n";		// %.2f -> 소숫점 2째 자리까지 표기
		System.out.printf(fmt, 1.25f);
		
	}

	private static void stringTest() {
		String str;
		str = "Java";
		System.out.println("str: " + str);
		String str2 = "Java";
		System.out.println("str2: " + str2);
		String str3 = new String("Java");
		System.out.println("str3: " + str3);
		
		// 세 변수는 모두 Java라는 문자열을 담고 있다.
		System.out.println("str == str2 ?" + (str == str2));
		System.out.println("str == str3 ?" + (str == str3));
		
		// 참조 타입의 == , != -> 두 객체의 주소비교
		// 값의 비교 .equals() 메서드 사용
		System.out.println("str과 str2의 내용이 같은가 ?" + str.equals(str2));
		System.out.println("str과 str2의 내용이 같은가 ?" + str.equals(str3));

	}
}
