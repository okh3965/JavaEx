package com.javaex.practice02;

public class Problem05 {

	public static void main(String[] args) {
		int scoreboard[][] = {
				{ 80, 75, 90, 95, 78 },
				{ 92, 88, 89, 92, 70 },
				{ 78, 80, 85, 86, 63 },
				{ 83, 84, 89, 87, 75 },
				{ 89, 83, 93, 94, 78 }
				};
		
		int sum = 0;
		int count = 0;
				
		for(int i = 0; i < scoreboard.length; i++) {
			for(int j = 0; j < scoreboard[0].length; j++) {
				if(scoreboard[i][j] >= 85) {
					count++;
					sum += scoreboard[i][j];
				}
			}
		}
		System.out.printf("총 합: %d 평균: %d", sum, sum/count);
	}

}
