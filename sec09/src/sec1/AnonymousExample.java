package sec1;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//�͸� ��ü �ʵ� ���
		anony.field.wake();
		
		//�͸� ��ü ���� ���� ���
		anony.method1();
		
		//�͸� ��ü �Ű��� ���
		anony.method2(
			new Person() {  //Person person = new Person();uj
				void study() {
					System.out.println("������");
				}
						
				@Override
				void wake() {
					System.out.println("8�� ���");
					study();
				}					
			}
		);
	}
}
