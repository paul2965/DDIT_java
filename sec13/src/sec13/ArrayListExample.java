package sec13;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListExample {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		
		list1.add("aaa");
		list1.add("bbb");
		list1.add(3);
		list1.add('k');
		list1.add(12.34);
		list1.add(true);
		
		// size() = list�� ������ ����
		System.out.println(list1.size());
		
		// get(int index) = ������ ��������
		System.out.println(list1.get(0));
		
		// set(int index, value) = �ε����� �ش��ϴ� ������ ����
		list1.set(0, "zzz");
		System.out.println("aaa -> zzz " +list1);
		
		// ������ �����ϱ�
		String temp = (String)list1.set(0, "yyy");
		System.out.println("aaa -> yyy " + list1);
		
		// �ش� �ε��� ������ ����
		list1.remove(0);
		System.out.println("���� �� : " + list1);
		
		// �ش� �� ������ ����
		list1.remove("bbb");
		System.out.println("���� �� : " + list1);
		
		list1.clear();
		
		System.out.println("----------------------------------------");
		
		List<String> list2 = new ArrayList<String>();
		
		list2.add("AAA");
		list2.add("BBB");
		list2.add("CCC");
		list2.add("DDD");
		list2.add("EEE");
		
		for(int i = 0 ; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		// contains(��ü��) : ����Ʈ�� object�� ������ true ������ false
		System.out.println("DDD�� contain �� : " + list2.contains("DDD")); //true
		System.out.println("LLL�� contain �� : " + list2.contains("LLL")); //false
		
		// indexOf(��ü��) : ����Ʈ�� �ش��ϴ� �񱳰�ü�� ã�� index�� ��ȯ(�������� ������ -1 ��ȯ)
		System.out.println("DDD�� indexOf �� : " + list2.indexOf("AAA"));
		System.out.println("GGG�� indexOf �� : " + list2.indexOf("GGG"));
		
		// toArray() : ����Ʈ�� �����͵��� �迭�� ��ȯ�Ͽ� ��ȯ (�⺻������ Object�� �迭)
		Object[] strArray = list2.toArray();
		System.out.println("strArray�� ũ�� : " + strArray.length);
		
		for(int i = 0 ; i < list2.size(); i++) {
			list2.remove(i);
		}
		
		
		System.out.println("size�� ũ�� : " + list2.size());
		
		list2.clear();
		
		List list3 = new Vector();
		
		
	}
}
