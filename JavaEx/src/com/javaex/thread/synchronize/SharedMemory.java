package com.javaex.thread.synchronize;

public class SharedMemory {
	private int memory;

	public int getMemory() {
		return memory;
	}

	// 임계 영역 : 여러곳에서 동시에 사용하면 안되는 영역 -> synchronized
	// 사용이 끝날때가지 메서드가 잠김(Lock)
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(1000);	// wait for 1 second
		} catch(InterruptedException e) {
//			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ":" + memory);
	}
	
	
}
