package com.javaex.thread.ex02;

// run 메서드만 구현, Thread의 생성자로 전달
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
