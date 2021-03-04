package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point(5, 10);	//기본 생성자 사용
		p1.draw();
		p1.draw(false);
		
		Point p2 = new Point(15, 30); //사용자 정의 생성자
		p2.draw();
		p2.draw(false);
	}

}
