package sec11.sec1;

public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "7306241230123";
		int length = ssn.length();
		
		if(length == 13) {
			System.out.println("�ùٸ� �ֹε�Ϲ�ȣ �ڸ�");
		} else {
			System.out.println("�ùٸ��� �ʴ� �ֹε�Ϲ�ȣ �ڸ�");
		}
	}
}
