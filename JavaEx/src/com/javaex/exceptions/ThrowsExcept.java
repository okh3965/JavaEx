package com.javaex.exceptions;

import java.io.IOException;

public class ThrowsExcept {
	
	public  void excuteChecked() 
			throws IOException{	//내부 발생 예외를 호출한 메서드에서 처리할 수 있도록 허용
		System.err.println("강제 체크드 예외 발생");
		// 예외 발생
		throw new IOException("강제 예외");
		// IOException은 checked exception -> 반드시 예외 처리 필요
	}

	public  void excuteRuntime() {
		System.err.println("런타임 예외");
		throw new RuntimeException("런타임 익셉션");	//unchecked 예외 -> 예외 처리를 강조하지 않음.
	}
	
	public double divide(int num1, int num2) {
		double result;
		try {
			result = num1 / num2;
		} catch(ArithmeticException e) {
			// 예외 전환: 보다 구체적은 예외로 전환하는 것
			throw new CustomArithmeticException("사용자 정의 Exception", num1, num2);
		}
		return result;
	}
	
}
