package com.javaex.oop.casting;

public class Dog extends Animal{
	//생성자
	public Dog(String name) {
		super(name);
	}
	
	//methods
	public void bark() {
		System.out.println(name + "bark bark!");
	}
	
}
