package sec13;

import java.util.*;

public class StackQueueExample {
	public static void main(String[] args) {
		/*
		 * Stack : 후입선출
		 * Queue : 선입선출
		 * 
		 * LinkedList를 이용한 스택 및 큐 예제*/
		
		LinkedList<String> stack = new LinkedList<String>();
		
		// Stack 1. push 저장할 값 | 2. pop 값 꺼내기
		stack.push("홍길동");
		stack.push("일지매");
		stack.push("변학도");
		stack.push("강감찬");
		
		String data = stack.pop();
		System.out.println("꺼내온 자료 : " + data);
		System.out.println("꺼내온 자료 : " + stack.pop());
		System.out.println("현재 stacks값 : " + stack);
		
		stack.push("성춘향");
		System.out.println("현재 stacks값 : " + stack);
		System.out.println("꺼내온 자료 : " + stack.pop());
		System.out.println("============================");
		
		LinkedList<String> queue = new LinkedList<String>();
		
		queue.offer("홍길동");
		queue.offer("일지매");
		queue.offer("변학도");
		queue.offer("강감찬");
		
		String temp = queue.poll();
		System.out.println("꺼내온 자료 : " + temp);
		System.out.println("꺼내온 자료 : " + queue.poll());
		System.out.println("현재 stacks값 : " + queue);
		
		if(queue.offer("성춘향")) {
			System.out.println("신규 등록 정보 : 성춘향");
		}
		System.out.println(queue);
		System.out.println(queue.poll());
	}
}
