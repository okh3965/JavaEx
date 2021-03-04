package com.javaex.practice02;

public class Problem04 {

	public static void main(String[] args) {
		// 6개의 중복되지 않은 정수난수(1 ~ 45)
		int[] numbers = new int[6];
		
		//while 사용
		int idx = 0;
		while (idx < numbers.length) {
			int choice = (int)(Math.random() * 45) + 1; 
			// 중복 데이터 체크
			boolean isDuplicated = false;
			
			if(idx != 0) {
				for(int i = 0; i < idx; i++) {
					if(numbers[i] == choice) {
						isDuplicated = true;
						break;
					}
				}
			}
			
			if(!isDuplicated) {
				//중복되지 않을 떄 코드 수행
				numbers[idx] = choice;
				idx++;	
			}
			
		}
		
		
		/*
		//for 사용
		for(int i = 0; i < 6; i++) {
			numbers[i] = getNum();
			for(int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) i--;
			}
		}
		*/
		
		//출력
		for(int value:numbers) {
			System.out.printf("%d\t", value);
		}
		System.out.println();
	}
	
	private static int getNum() {
		double num = Math.random();
		int intValue = (int)(num * 45) + 1;
		return intValue;
	}

}
