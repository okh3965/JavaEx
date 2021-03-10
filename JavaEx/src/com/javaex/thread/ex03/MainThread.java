package com.javaex.thread.ex03;

public class MainThread {

	public static void main(String[] args) {
		// A separate workflow from the main thread
		// thread의 우선순위를 결정할 수 있다.: 1(MIN) ~ 5(NORMAL) ~ 10(MAX)
		// CPU 자원이 부족할 때, 어느 쓰레드를 우선 실행시킬지 결정
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		thread.setPriority(Thread.MAX_PRIORITY);	// max : 10
		

//		thread.run();	//**caution** :  do not directly calling run method//
		
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.setName("AlphabetRunnable");
		thread2.setPriority(Thread.MIN_PRIORITY);	//min : 1
		
		// sub thread start
		thread.start();	// In the start method, run the run method instead
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
