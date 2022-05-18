package sec13;

import java.lang.Character.Subset;
import java.util.*;

public class TreeSet1 {
	public static void main(String[] args) {

		// TreeSet�� �ڵ� ���� ����� �� �ִ�.
		TreeSet<String> ts = new TreeSet<String>();
		
		List<String> abcList = new ArrayList<String>();

		// ���� �빮�ڸ� ���ڿ��� ��ȯ�Ͽ� List�� �����ϱ�

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			String temp = String.valueOf(ch);
			abcList.add(temp);

		}
		
		Collections.shuffle(abcList);
		
		System.out.println("abcList �ڷ� : " + abcList);

		for (String str : abcList) {
			ts.add(str);
		}
		
		System.out.println("TreeSet �ڷ� : " + ts);
		
		// TreeSet�� ����� �ڷ� �� Ư���� �ڷẸ�� ���� �ڷḦ ã�Ƽ�
		// SortedSet���� ��ȯ�ϴ� �޼��尡 �ִ�.
		// => headSet(���ذ�) : �⺻������ '���ذ�; ������
		// => headSet(���ذ�, ����) : ������ true�̸� '���ذ�' ����.
		
		SortedSet<String> ss1 = ts.headSet("K");
		
		System.out.println("K ���� �ڷ� : " + ss1);// ���ذ� ������.
		System.out.println("K ���� �ڷ�(���ذ� ����) : " 
							+ ts.headSet("K", true));
		
		//'���ذ�'���� ū �ڷḦ ã�� SortedSet���� ��ȯ�ϴ� �޼���
		// tailSet(���ذ�) : �⺻������ '���ذ�' ����.
		// tailSet(���ذ�, ����) : ������ false�̸� '���ذ�' ������
		SortedSet<String> s2 = ts.tailSet("K");
		System.out.println("K ���� �ڷ� " + s2);
		System.out.println("K ���� �ڷ�(���ذ� ������) : " + ts.tailSet("K", false));
		
		// subSet(n,m) : n�� m�� ���̰� ��ȯ
		// subSet(���ذ�1, ����1, ���ذ�2, ����2) : �� ������ �������� ���θ� �����Ѵ�.(������ true�̸� ����)
		System.out.println("K���Ժ��� N�����Ա��� " + ts.subSet("K", "N"));
		System.out.println("K���Ժ��� N���Ա��� " + ts.subSet("K", true, "N", true));
		System.out.println("K���Ժ��� N�����Ա��� " + ts.subSet("K", true, "N", false));
		System.out.println("K�����Ժ��� N���Ա��� " + ts.subSet("K", false, "N", true));
	}
}
