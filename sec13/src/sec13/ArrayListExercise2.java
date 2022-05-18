package sec13;

import java.util.*;

public class ArrayListExercise2 {
	public static void main(String[] args) {
		//���� 2��
		ArrayList<String> nickname = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0 ; i < 5 ; i++	) {
			System.out.print("�̸��� �Է��Ͻÿ� : ");
			nickname.add(scanner.nextLine());
		}
		System.out.println();
		
		/*
		 * compare()�� ��ȯ���� �����ϴ� ��� (�⺻�� ��������)
		 *  ���ϰ� : ���� ���� �� ũ�� ���, ������ 0, ���� ���� �� ũ�� ���� */
		
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
