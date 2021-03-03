package com.javaex.oop.goods.v2;

// v2. 필드 접근 제한
public class Goods {
	// 필드
	// public > protected > default > private
	private String name;
	private int price;
	
	public void setName(String name) {
		this.name = name;
	}
}
