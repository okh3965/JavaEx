package com.javaex.oop.point.v2;

//v1. 필드 은닉, getter/setter, 출력 메서드
public class Point {
	//필드
	private int x;
	private int y;
	
	// 생성자가 하나도 없으면
	// 컴파일러가 기본 생성자를 추가
	// -> 생성자가 없는 것이 아님
	public Point() {
		System.out.println("기본 생성자 호출");
	}
	public Point(int x, int y) {
		System.out.println("사용자정의 생성자 호출");
		this.x = x;
		this.y = y;
	}
	
	// getter, setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	// 출력 메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", x, y);
	}
	
	
}
