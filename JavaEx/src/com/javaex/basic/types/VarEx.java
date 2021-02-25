package com.javaex.basic.types;

public class VarEx {

	public static void main(String[] args) {
		// 변수 식별자 규정
		// 문자, 숫자, $, _의 조합으로 생성
		// 숫자로 시작하면 안됨
		// 예약어는 사용할 수 없다
		
		// 관례:
		// 		소문자로 작성, 단어의 조합일 경우, 뒷 단어의 첫글자는 대문자
		int myAge;	// int 타입 데이터를 담을 공간을 할당
		myAge = 48;	// 초기화, 할당
	
		System.out.println("내 나이는 : " + myAge);
		
		int v1 = 10, v2 = 20, v3 = 30;
		
		v1 = v2 = v3 = 40;
	}

}
