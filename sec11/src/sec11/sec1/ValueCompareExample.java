package sec11.sec1;

public class ValueCompareExample {
	public static void main(String[] args) {
		System.out.println("[-127 ~ 128 �ʰ����� ���]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		System.out.printf("== ��� : %s\n",(obj1 == obj2));
		System.out.printf("��ڽ� �� == ��� : %s\n",(obj1.intValue() == obj2.intValue()));
		System.out.printf("equals() ��� : %s\n",obj1.equals(obj2));
		
		System.out.println("\n[-127 ~ 128 �������� ���]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		
		System.out.printf("== ��� : %s\n",(obj3 == obj4));
		System.out.printf("��ڽ� �� == ��� : %s\n",(obj3.intValue() == obj4.intValue()));
		System.out.printf("equals() ��� : %s\n",obj3.equals(obj4));
		
	}
}
