package Exercise;

public class Exercise2 {
	public static void main(String[] args) {
		String str = "��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�.";
		
		int index = str.indexOf("�ڹ�");
		if(index == -1) {
			System.out.println("str ���ڿ����� \"�ڹ�\"�� ���ԵǾ� ���� �ʴ�.");
		} else {
			System.out.println("str ���ڿ����� \"�ڹ�\"�� ���ԵǾ� �ִ�.");
			str = str.replace("�ڹ�", "Java");
		}
		
		System.out.println("-->"+str);
	}
}
