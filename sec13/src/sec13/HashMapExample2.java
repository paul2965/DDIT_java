package sec13;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1,"ȫ�浿"),95);
		map.put(new Student(1,"ȫ�浿"),95);
		
		System.out.println("�� ��Ʈ�� �� : " + map.size());
	}
}
