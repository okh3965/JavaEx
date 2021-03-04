package com.javaex.oop.point.v4;

//v3. 메서드 오버로딩
// 같은 이름을 가졌지만, 매개 변수의 타입과 순서와 갯수만 다른 것
public class Point {
	//필드
	//상속받은 자식에서 접근 허용
	protected int x;
	protected int y;
	
	// 생성자가 하나도 없으면
	// 컴파일러가 기본 생성자를 추가
	// -> 생성자가 없는 것이 아님
	/*
	public Point() {
		System.out.println("기본 생성자 호출");
	}*/
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
	
	public void draw(boolean show) {
		String message = String.format("점[x=%d, y=%d]를 ", x, y);
		if(show) {
			message += "그렸습니다.";
		} else {
			message += "지웠습니다.";
		}
		System.out.println(message);
	}
}
