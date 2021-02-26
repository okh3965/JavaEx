package com.javaex.basic.types;

// 정수 데이터 타입 연습
// byte(1) < short(2) < int(4 : 정수형의 기본타입) < long(8)
public class intLongEx {

	public static void main(String[] args) {
		int intVar = 2021;
		// 타입의 범위를 넘어가는 값을 할당할 수 없다.
		
		int intVar2;
		//intVar2 = 1111111111111111;
		
		long longVar = 2021;
		long longVar2 = 123456789012345L;	//숫자 끝에 L or l 추가
		
		// short type
		short s1 = 100;
		short s2 = 200;
		
		//short result = s1 + s2;	// int로 변환되어 연산 -> 결과 int
		int result = s1 + s2;
		System.out.println(s1 + "+" + s2 + "=" + result);
		
		int bin, oct, hex;
		
		bin = 0b1100;	// 0b 접두어 -> 2진수
		oct = 072;		// 0 접두어 -> 8진수
		hex = 0xFF;		// 0x 접두어 -> 16진수

		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}
	
	

}