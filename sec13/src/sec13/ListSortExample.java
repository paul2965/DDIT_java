package sec13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		/*
		 * Comparable과 Comparator Interface 2개가 있음
		 *  - Comparable에서는 compareTo()를 구현
		 *  - Comparator에서는 compare()를 구현*/
		
		list.add("일지매");
		list.add("홍길동");
		list.add("성춘향");
		list.add("변학도");
		list.add("이순신");
		
		System.out.println("정렬 전 : " + list);
		
		/*
		 * 정렬은 Collection.sort()를 이용하여 정렬한다.
		 * 정렬은 기본적으로 오름차순인다*/
		
		Collections.sort(list);
		System.out.println("정렬 후 : " + list);
		
		
	}
}
