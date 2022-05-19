package sec13_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	/*
	 * @MAP
	 *  - key�� value�� ���� �̷�� ������
	 *  - �������̽� : HashMap
	 *  - key���� �ߺ��� ������� �ʴ´�(Set�� Ư¡)
	 *  - value���� �ߺ� ���(List�� Ư¡)
	 *  - Ű���� �ڵ������� �ȴ�
	 *  - ������ ����Ʈó�� ���� �ʴ´�. ������ "Ű��"�� �̿��Ͽ� ���� �� �����Ѵ�.
	 * */
	
	public static void main(String[] args) {
		Map<String, String > map = new HashMap<String, String>();
		
		// �ڷ� �߰� -> put(key, value)
		map.put("name", "ȫ�浿");
		map.put("address", "������");
		map.put("phoneNum", "010-1234-5678");
		
		System.out.println("map => " + map);
		
		// �ڷ���� -> �����͸� �����Ҷ� key���� ������ ���߿� �Է��� ���� �����(���)
		//          put(������ Ű, ���ο� ��)
		
		map.put("address", "�����");
		
		System.out.println("map => " + map);
		
		// �ڷ� ���� -> remove(Ű)
		// 
		map.remove("name");
		System.out.println("map => " + map);
		
		//�ڷ� �б� -> get(Ű)
		System.out.println("map => " + map.get("phoneNum"));
		
		System.out.println("=".repeat(30));
		
		// Ű������ �о�� �ڷḦ ����ϴ� ���
		//���1. keySet() �̿�
		//      keySet()�޼��� : 
		Set<String> keySet = map.keySet();
		
		System.out.println("Iterator�� �̿��ϴ� ���");
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println("----------------------------------------");
		
		//���2. Set���� �����͸� ���� for������ ó���ϸ� Iterator�� ������� �ʾƵ� ��
		
		System.out.println("���� for��");
		for (String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println("----------------------------------------");
		
		//��� 3. value���� �о�� ����ϱ� -> value() �̿�
		System.out.println("value������ �̿��ϱ�");
		for(String value : map.values()) {
			System.out.println(value);
		}
		System.out.println("------------------------------------------");
		
		//��� 4. MAP���� Ŭ�������� Map.EntryŸ���� ���� Ŭ������
		//       ������� �ִ�. �� ���� Ŭ������ Ű�� value��� ���������
		//       �����Ǿ� �ִ�. Map���� �� Map.EntryŸ���� ��ü���� Set������
		//       ������ �� �ִ�.-> entrySet() �޼��� �̿�
		
		Set<Map.Entry<String, String>> mapSet = map.entrySet();
		
		Iterator<Map.Entry<String, String>> entryIt = mapSet.iterator();
		
		while(entryIt.hasNext()) {
			Map.Entry<String, String> entry = entryIt.next();
			System.out.println("key �� : " + entry.getKey());
			System.out.println("value �� : " + entry.getValue());
			System.out.println();
		}
		
		
	}
}
