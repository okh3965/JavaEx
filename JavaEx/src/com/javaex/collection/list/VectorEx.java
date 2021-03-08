package com.javaex.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		//	벡터의 선언
		Vector<Integer> v = new Vector<>();	// Integer vector
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		
		// 1 to 10 value assign 
		for (int i = 1; i <=10; i++) {
			// value add
			v.addElement(i);
		}
		System.out.println("v:" + v);
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		// 허용량 초과
		v.addElement(11);
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		
		// 중간에 삽입
		v.insertElementAt(7, 5);
		System.out.println("v:" + v);
		
		// 객체 참조
		System.out.println("5번 인덱스의 객체:" + v.elementAt(5));
		
		// 객체 검색
		int index = v.indexOf(6);
		System.out.println("index of 6:" + index);
		index = v.indexOf(0);
		System.out.println("index of 0:" + index);
		
		// 포함 여부 확인
		// 내부에 10 포함?
		System.out.println("v contains 10 ? " + v.contains(10));
		
		// 객체 삭제
		System.out.println("v:" + v);
		v.removeElement(7);
		System.out.println("v:" + v);
		
		// 내부 객체를 출력
		for (int i = 0; i < v.size(); i++) {
			Integer item = v.elementAt(i);
			System.out.print(item + " ");
		}
		System.out.println();
		
		// Enhanced for -> 권장 x
		for (Integer item: v) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		// Vector -> Enumeration을 받아와서 순회
		Enumeration<Integer> e = v.elements();
		
		while (e.hasMoreElements()) {	// 뒤에 담긴 객체가 더 있는가
			Integer item = e.nextElement();	// 데이터를 꺼내고, 뒤로 이동
			System.out.print(item + " ");
		}
		System.out.println();
		
		// 벡터 비우기
		v.clear();
		System.out.println("v:" + v);
		System.out.printf("Size: %d, Capacity: %d%n", v.size(), v.capacity());
				
	}

}
