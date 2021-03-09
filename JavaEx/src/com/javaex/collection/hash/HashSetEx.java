package com.javaex.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {

		//basicHashSetEx();
		customHashSetEx();
	
	}
	
	private static void customHashSetEx() {
		
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student("Hong", 10);
		Student s2 = new Student("Jang", 20);
		Student s3 = new Student("Jeon", 30);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println("학생부:" + hs);
		
		Student s4 = new Student("Hong", 10);	//같은값을 가진다 하더라도 추가됨 
		hs.add(s4);
		System.out.println("hashcode of s1 " + s1.hashCode());	//s1 memory addr
		System.out.println("hashcode of s4 " + s4.hashCode());	//s4 momory addr
		System.out.println("s1 equals s4 ? " + s1.equals(s4));
		
		System.out.println("학생부:" + hs);
		
		// 포함 여부 확인
		boolean exists = hs.contains(new Student("Hong", 10));
		System.out.println("Hong(10) exists:" + exists);
		
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
