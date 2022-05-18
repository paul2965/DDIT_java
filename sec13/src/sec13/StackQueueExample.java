package sec13;

import java.util.*;

public class StackQueueExample {
	public static void main(String[] args) {
		/*
		 * Stack : ���Լ���
		 * Queue : ���Լ���
		 * 
		 * LinkedList�� �̿��� ���� �� ť ����*/
		
		LinkedList<String> stack = new LinkedList<String>();
		
		// Stack 1. push ������ �� | 2. pop �� ������
		stack.push("ȫ�浿");
		stack.push("������");
		stack.push("���е�");
		stack.push("������");
		
		String data = stack.pop();
		System.out.println("������ �ڷ� : " + data);
		System.out.println("������ �ڷ� : " + stack.pop());
		System.out.println("���� stacks�� : " + stack);
		
		stack.push("������");
		System.out.println("���� stacks�� : " + stack);
		System.out.println("������ �ڷ� : " + stack.pop());
		System.out.println("============================");
		
		LinkedList<String> queue = new LinkedList<String>();
		
		queue.offer("ȫ�浿");
		queue.offer("������");
		queue.offer("���е�");
		queue.offer("������");
		
		String temp = queue.poll();
		System.out.println("������ �ڷ� : " + temp);
		System.out.println("������ �ڷ� : " + queue.poll());
		System.out.println("���� stacks�� : " + queue);
		
		if(queue.offer("������")) {
			System.out.println("�ű� ��� ���� : ������");
		}
		System.out.println(queue);
		System.out.println(queue.poll());
	}
}
