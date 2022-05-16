package sec13;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("ArrayList �ɸ� �ð� : %dns\n",(endTime - startTime));
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("LinkedList �ɸ� �ð� : %dns",(endTime - startTime));
	}
}
