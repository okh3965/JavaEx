package com.javaex.thread.synchronize;

public class User extends Thread {
	private SharedMemory memory;
	private int data;
	
	// constructor
	public User(String name, SharedMemory memory, int data) {
		this.setName(name);	//thread naming
		this.memory = memory; // 공유 객체 설정
		this.data = data;
	}

	@Override
	public void run() {
		// when the thread starts
		if(memory != null) {
			memory.setMemory(data);
		}
	}
	
	
}
