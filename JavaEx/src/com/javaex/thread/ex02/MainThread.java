package com.javaex.thread.ex02;

public class MainThread {

	public static void main(String[] args) {
		// A separate workflow from the main thread
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		// sub thread start
		thread.start();	// In the start method, run the run method instead
//		thread.run();	//**caution** :  do not directly calling run method//
		
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.setName("AlphabetRunnable");
		//	send a Runnable object that implements the run method to constructor
		thread2.start();
		
		// to maintain control of the working thread
		// 작업 흐름을 main 스레드에 합류
		
		
		try {
			thread.join();
			thread2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("MainThread end");
	}

}
