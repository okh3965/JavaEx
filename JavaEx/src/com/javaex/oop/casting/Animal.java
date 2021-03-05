package com.javaex.oop.casting;

public class Animal {
	//field
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	// methods
	public void eat() {
		System.out.println(name + "이 먹고 있습니다.");
	}
	public void walk() {
		System.out.println(name + "이 걷고 있습니다.");
	}
	
	
}
