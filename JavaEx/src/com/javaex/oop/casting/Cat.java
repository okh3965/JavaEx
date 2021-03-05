package com.javaex.oop.casting;

public class Cat extends Animal{
	// 생성자
	public Cat(String name) {
		super(name);
	}
	
	// methods
	public void meow() {
		System.out.println(name + ": meow~");
	}
}
