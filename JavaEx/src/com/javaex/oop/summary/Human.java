package com.javaex.oop.summary;

public class Human extends Animal{

	//생성자
	public Human(String name, int age) {
		super(name, age);
	}

	//추상 메서드 Override
	@Override
	public void say() {
		System.out.printf("안녕, 내 이름은 %s야%n", name);
	}
	
	
}
