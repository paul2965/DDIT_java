package sec13;

import java.util.*;

public class ArrayListExercise2 {
	public static void main(String[] args) {
		//문제 2번
		ArrayList<String> nickname = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0 ; i < 5 ; i++	) {
			System.out.print("이름을 입력하시오 : ");
			nickname.add(scanner.nextLine());
		}
		System.out.println();
		
		/*
		 * compare()의 반환값을 결정하는 방법 (기본은 오름차순)
		 *  리턴값 : 앞의 값이 더 크면 양수, 같으면 0, 뒤의 값이 더 크면 음수 */
		
		Comparator<String> c = new Comparator<String>() {
			public int compare(String str1, String str2) {
				return Integer.compare(str2.length(), str1.length());
			}
		};
		
		Collections.sort(nickname, c);
		
		System.out.println(nickname);
		
		scanner.close();
	}
}
