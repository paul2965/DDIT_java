package sec11.sec1;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldstr = "�ڹٴ� ��ü ���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�";
		String newstr = oldstr.replace("�ڹ�", "java");
		
		System.out.println(oldstr);
		System.out.println(newstr);
	}
}
