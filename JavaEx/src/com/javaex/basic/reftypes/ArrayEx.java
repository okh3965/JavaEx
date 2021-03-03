package com.javaex.basic.reftypes;

public class ArrayEx {

	public static void main(String[] args) {

		//arrayBasic();
		//twoDimens();	
		//arrayCopyByFor();
		arrayCopySystem();
		
	}
	
	// 배열 복사
	private static void arrayCopySystem() {
		int source[] = {1, 2, 3};
		int target[] = new int[10];
		
		System.arraycopy(source,	//원본 배열 
				0,	//복사 시작 위치 
				target, //타겟 배열
				0, //타겟 시작 위치
				source.length);	// 복사 길이
		
		for (int i  = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();
		
		//Enhanced for문
		for (int value: target) {
			System.out.print(value + "\t");
		}
		System.out.println();
	}
	
	private static void arrayCopyByFor() {
		int source[] = {1, 2, 3};
		int target[] = new int[10];
		
		for(int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
	
		for(int i = 0; i < target.length; i++) {
			System.out.print(target[i] + " ");
		}
		System.out.println();
	}
	
	
	private static void twoDimens() {
		int[][] twoDimens = new int [5][10];
		
		// 기본 데이터가 있을 경우의 초기화
		int table[][] = {
				{1, 2, 3, 4, 5},
				{2, 3, 4, 5, 6},
				{3, 4, 5, 6, 7}
		};
		
		System.out.println("length of table: " + table.length);
		System.out.println("legngth of table[0] :" + table[0].length);
		
		//table 배열 모든 값 합산
		int total = 0;
		for(int row = 0; row < table.length; row++) {
			for(int col = 0; col < table[row].length; col++) {
				System.out.print(table[row][col] + "\t");
				total += table[row][col];
			}
			System.out.println();
		}
		
		System.out.println("배열요소의 총 합 : " + total);
		
		
	}
	
	private static void arrayBasic() {
		// 배열의 선언
		String[] names;	// 타입[] 식별자
		int scores[]; // 타입 식별자[]
		
		// 초기화
		names = new String[] {
				"홍길동",
				"장길산",
				"임꺽정",
				"전우치"
		};
		System.out.println(names);
		
		scores = new int[4];
		// 공간에 접근하려면 index 사용
		System.out.println("Length of scores:" + scores.length);
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 75;
		scores[3] = 95;
		
		//System.out.println(scores);
		float heights[] = {
				178.5f,
				185.0f,
				170.5f,
				188.0f
		};
		
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%s (%.2f) : score = %d%n", 
					names[i], heights[i], scores[i]);
		}
		
		int[] scores2 = scores;
		System.out.println("scores와 scores2는 같은 객체? " + (scores == scores2));
		
		scores2[3] = 100;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}
		System.out.println();
		
	}

}
