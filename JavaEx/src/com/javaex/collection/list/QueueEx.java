package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// Queue는 인터페이스, 실체 클래스는 티르스
		Queue<Integer> queue = new LinkedList<>();
		
		// data inqueue
		for(int i = 0; i < 10; i++) {
			queue.offer(i);
			System.out.println("QUEUE:" + queue);
		}
		
		// data dequeue & confirm
		int item = queue.peek();
		System.out.println("PEEK:" + item);
		System.out.println("QUEUE:" + queue);
		item = queue.poll();	//데이터 인출
		System.out.println("POLL" + item);
		System.out.println("QUEUE" + queue);
		
		// queue에서 poll을 할 때,
		// 비어있는지 반드시 확인
		while(!queue.isEmpty() ) {
			System.out.println("POLL" + queue.poll());
			System.out.println("QUEUE:" + queue);
		}
		 
	}

}
