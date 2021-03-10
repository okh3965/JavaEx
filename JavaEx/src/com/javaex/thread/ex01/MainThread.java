package com.javaex.thread.ex01;

public class MainThread {

	public static void main(String[] args) {
		// A separate workflow from the main thread
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		// sub thread start
		thread.start();	// In the start method, run the run method instead
//		thread.run();	//**caution** :  do not directly calling run method//
		
		
		
		// main thread : A ~ Z print
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("MainThread:" + ch);
			
			// wait:
			try {
				Thread.sleep(300);	// 0.3 sec
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
