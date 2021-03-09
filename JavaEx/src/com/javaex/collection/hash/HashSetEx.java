package com.javaex.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {

		basicHashSetEx();
	
	}
	
	private static void basicHashSetEx() {
		HashSet<String> hs = new HashSet<>();
		
		// 요소 추가
		hs.add("JAVA");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		
		System.out.println("HashSet:" + hs);
		System.out.println("요소의 수:" + hs.size());
		
		hs.add("JAVA");
		System.out.println("HashSet" + hs);	//중복은 허용하지 않음.
		
		// 요소의 포함 여부 확인
		System.out.println("contains JAVA ?" + hs.contains("JAVA"));
		System.out.println("contains Linux ?" + hs.contains("Linux"));
		
		System.out.println("HashSet:" + hs);
		
		// 요소의 삭제
		hs.remove("C++");
		System.out.println("HashSet:" + hs);
		
		// 비우기
		hs.clear();
		System.out.println("HashSet:" + hs);
	}
	

}
