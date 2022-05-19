package sec13_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	/*
	 * @MAP
	 *  - key와 value로 쌍을 이루어 존재함
	 *  - 인터페이스 : HashMap
	 *  - key값은 중복을 허용하지 않는다(Set의 특징)
	 *  - value값은 중복 허용(List의 특징)
	 *  - 키값은 자동정렬이 된다
	 *  - 순서는 리스트처럼 넣지 않는다. 오로지 "키값"을 이용하여 수정 및 삭제한다.
	 * */
	
	public static void main(String[] args) {
		Map<String, String > map = new HashMap<String, String>();
		
		// 자료 추가 -> put(key, value)
		map.put("name", "홍길동");
		map.put("address", "대전시");
		map.put("phoneNum", "010-1234-5678");
		
		System.out.println("map => " + map);
		
		// 자료수정 -> 데어터를 저장할때 key값이 같으면 나중에 입력한 값이 저장됨(덮어씀)
		//          put(수정할 키, 새로운 값)
		
		map.put("address", "서울시");
		
		System.out.println("map => " + map);
		
		// 자료 삭제 -> remove(키)
		// 
		map.remove("name");
		System.out.println("map => " + map);
		
		//자료 읽기 -> get(키)
		System.out.println("map => " + map.get("phoneNum"));
		
		System.out.println("=".repeat(30));
		
		// 키값들을 읽어와 자료를 출력하는 방법
		//방법1. keySet() 이용
		//      keySet()메서드 : 
		Set<String> keySet = map.keySet();
		
		System.out.println("Iterator를 이용하는 방법");
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println("----------------------------------------");
		
		//방법2. Set형의 데이터를 향상된 for문으로 처리하면 Iterator를 사용하지 않아도 됨
		
		System.out.println("향상된 for문");
		for (String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println("----------------------------------------");
		
		//방법 3. value값만 읽어와 출력하기 -> value() 이용
		System.out.println("value값으로 이용하기");
		for(String value : map.values()) {
			System.out.println(value);
		}
		System.out.println("------------------------------------------");
		
		//방법 4. MAP관련 클래스에는 Map.Entry타입의 내부 클래스가
		//       만들어져 있다. 이 내부 클래스는 키와 value라는 멤버변수로
		//       구성되어 있다. Map에서 이 Map.Entry타입의 객체들을 Set형으로
		//       가져올 수 있다.-> entrySet() 메서드 이용
		
		Set<Map.Entry<String, String>> mapSet = map.entrySet();
		
		Iterator<Map.Entry<String, String>> entryIt = mapSet.iterator();
		
		while(entryIt.hasNext()) {
			Map.Entry<String, String> entry = entryIt.next();
			System.out.println("key 값 : " + entry.getKey());
			System.out.println("value 값 : " + entry.getValue());
			System.out.println();
		}
		
		
	}
}
