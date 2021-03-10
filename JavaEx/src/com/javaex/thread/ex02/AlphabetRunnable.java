package com.javaex.thread.ex02;

public class AlphabetRunnable implements Runnable {

	@Override
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			// print out name of current thread
			System.out.println(Thread.currentThread().getName() + ":" + ch);
			
			// wait:
			try {
				Thread.sleep(300);	// 0.3 sec
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
