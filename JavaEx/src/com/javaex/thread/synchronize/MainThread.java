package com.javaex.thread.synchronize;

public class MainThread {

	public static void main(String[] args) {
		SharedMemory memory = new SharedMemory();
		
		// construct Threads
		User user1 = new User("Chul-su", memory, 100);
		User user2 = new User("young-hee", memory, 50);
		
		user1.start();
		user2.start();
		
	}

}
