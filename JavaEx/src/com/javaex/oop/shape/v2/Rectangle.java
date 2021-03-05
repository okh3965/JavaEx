package com.javaex.oop.shape.v2;

public class Rectangle extends Shape implements Drawable{
	//field
	private int width;
	private int height;
	
	//생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}

	//methods

	@Override
	public void draw() {
		System.out.printf("사각형[x=%d, y=%d, width=%d, height=%d, area=%.2f 을 그렸습니다.%n",
				x, y, width, height, area());
	}

	@Override
	public double area() {
		return width * height;
	}
	
	
}
