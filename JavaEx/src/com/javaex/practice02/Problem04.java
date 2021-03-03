package com.javaex.practice02;

public class Problem04 {

	public static void main(String[] args) {
	
		int[] numbers = new int[6];
		for(int i = 0; i < 6; i++) {
			numbers[i] = getNum();
			for(int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) i--;
			}
		}
		for(int value:numbers) {
			System.out.printf("%d\t", value);
		}
	}
	
	private static int getNum() {
		double num = Math.random();
		int intValue = (int)(num * 45) + 1;
		return intValue;
	}

}
