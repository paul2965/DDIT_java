package sec13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		/*
		 * Comparable�� Comparator Interface 2���� ����
		 *  - Comparable������ compareTo()�� ����
		 *  - Comparator������ compare()�� ����*/
		
		list.add("������");
		list.add("ȫ�浿");
		list.add("������");
		list.add("���е�");
		list.add("�̼���");
		
		System.out.println("���� �� : " + list);
		
		/*
		 * ������ Collection.sort()�� �̿��Ͽ� �����Ѵ�.
		 * ������ �⺻������ ���������δ�*/
		
		Collections.sort(list);
		System.out.println("���� �� : " + list);
		
		
	}
}
