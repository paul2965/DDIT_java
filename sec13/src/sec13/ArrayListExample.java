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
		
		// size() = list의 데이터 갯수
		System.out.println(list1.size());
		
		// get(int index) = 데이터 가져오기
		System.out.println(list1.get(0));
		
		// set(int index, value) = 인덱스에 해당하는 데이터 변경
		list1.set(0, "zzz");
		System.out.println("aaa -> zzz " +list1);
		
		// 데이터 변경하기
		String temp = (String)list1.set(0, "yyy");
		System.out.println("aaa -> yyy " + list1);
		
		// 해당 인덱스 데이터 삭제
		list1.remove(0);
		System.out.println("삭제 후 : " + list1);
		
		// 해당 값 데이터 삭제
		list1.remove("bbb");
		System.out.println("삭제 후 : " + list1);
		
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
		
		// contains(객체비교) : 리스트에 object가 있으면 true 없으면 false
		System.out.println("DDD의 contain 값 : " + list2.contains("DDD")); //true
		System.out.println("LLL의 contain 값 : " + list2.contains("LLL")); //false
		
		// indexOf(객체비교) : 리스트에 해당하는 비교객체를 찾아 index값 반환(존재하지 않으면 -1 반환)
		System.out.println("DDD의 indexOf 값 : " + list2.indexOf("AAA"));
		System.out.println("GGG의 indexOf 값 : " + list2.indexOf("GGG"));
		
		// toArray() : 리스트의 데이터들을 배열로 변환하여 반환 (기본적으로 Object형 배열)
		Object[] strArray = list2.toArray();
		System.out.println("strArray의 크기 : " + strArray.length);
		
		for(int i = 0 ; i < list2.size(); i++) {
			list2.remove(i);
		}
		
		
		System.out.println("size의 크기 : " + list2.size());
		
		list2.clear();
		
		List list3 = new Vector();
		
		
	}
}
