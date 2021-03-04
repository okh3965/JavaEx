package com.javaex.oop.goods.v4;

// v4. this : 객체 자신을 의미
// this() : 내부에 있는 다른 생성자를 호출
public class Goods {
	// 필드
	private String name;
	private int price;

	// 생성자 1
	public Goods(String name) {
		this.name = name;
	}
	
	// 모든 필드를 초기화하는 생성자: 생성자 2
	public Goods(String name, int price) {
		this(name);
		this.price = price;
	}
	
	//Getter , Setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	//출력용 메서드
	public void showInfo() {
		System.out.printf("상품 이름: %s%n가격 : %d원%n", name, price);
	}
}
