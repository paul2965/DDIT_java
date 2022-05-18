package sec13;

import java.lang.Character.Subset;
import java.util.*;

public class TreeSet1 {
	public static void main(String[] args) {

		// TreeSet은 자동 정렬 기능이 들어가 있다.
		TreeSet<String> ts = new TreeSet<String>();
		
		List<String> abcList = new ArrayList<String>();

		// 영어 대문자를 문자열로 변환하여 List에 저장하기

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			String temp = String.valueOf(ch);
			abcList.add(temp);

		}
		
		Collections.shuffle(abcList);
		
		System.out.println("abcList 자료 : " + abcList);

		for (String str : abcList) {
			ts.add(str);
		}
		
		System.out.println("TreeSet 자료 : " + ts);
		
		// TreeSet에 저장된 자료 중 특정한 자료보다 작은 자료를 찾아서
		// SortedSet으로 반환하는 메서드가 있다.
		// => headSet(기준값) : 기본적으로 '기준값; 미포함
		// => headSet(기준값, 논리값) : 논리값이 true이면 '기준값' 포함.
		
		SortedSet<String> ss1 = ts.headSet("K");
		
		System.out.println("K 이전 자료 : " + ss1);// 기준값 미포함.
		System.out.println("K 이전 자료(기준값 포함) : " 
							+ ts.headSet("K", true));
		
		//'기준값'보다 큰 자료를 찾아 SortedSet으로 반환하는 메서드
		// tailSet(기준값) : 기본적으로 '기준값' 포함.
		// tailSet(기준값, 논리값) : 논리값이 false이면 '기준값' 미포함
		SortedSet<String> s2 = ts.tailSet("K");
		System.out.println("K 이후 자료 " + s2);
		System.out.println("K 이후 자료(기준값 미포함) : " + ts.tailSet("K", false));
		
		// subSet(n,m) : n과 m의 사이값 반환
		// subSet(기준값1, 논리값1, 기준값2, 논리값2) : 각 기준을 포함할지 여부를 설정한다.(논리값이 true이면 포함)
		System.out.println("K포함부터 N미포함까지 " + ts.subSet("K", "N"));
		System.out.println("K포함부터 N포함까지 " + ts.subSet("K", true, "N", true));
		System.out.println("K포함부터 N미포함까지 " + ts.subSet("K", true, "N", false));
		System.out.println("K미포함부터 N포함까지 " + ts.subSet("K", false, "N", true));
	}
}
