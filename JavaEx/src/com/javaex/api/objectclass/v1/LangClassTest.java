package com.javaex.api.objectclass.v1;

public class LangClassTest {
	
	public static void main(String[] args) {
		Point p = new Point(10, 10);
		
		//최상위 부모 -> Object
		System.out.println(p.getClass());	// p의 객체 정보
		System.out.println(p.getClass().getSimpleName());	//클래스 정보 -> 문자열
		System.out.println(p.toString());	//객체 정보를 문자열로 전환
		System.out.println(p);
		// toString() : 출력시 or 문자열과 연결될 때 자동으로 호출
		System.out.println(p.hashCode());	//객체 식별을 위한 유일한 정수값
		// hashCode() : 기본적으로는 객체의 메모리 주소
		
		Point p2 = new Point(10, 10);
		Point p3 = p;
		
		System.out.println("p hashcode: " + p.hashCode());
		System.out.println("p2 hashcode: " + p2.hashCode());
		System.out.println("p3 hashcode: " + p3.hashCode());
		
		System.out.println("p hashcode == p2 hashcode ? " + (p.hashCode() == p2.hashCode()));
		System.out.println("p hashcode == p3 hashcode ? " + (p.hashCode() == p3.hashCode()));
		// hashCode는 두 객체가 동일한 객체인지 판단할 수 있게 해준다.
		
	}
	
}
