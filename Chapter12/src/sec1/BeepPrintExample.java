package sec1;

public class BeepPrintExample {
	public static void main(String[] args) {
		BeepTask beepTask = new BeepTask();
		Thread thread = new Thread(beepTask); //�͸� ��ü�� ���𰡴�
		thread.start();
		
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500); // 1000 = 1�� , 500 = 0.5��
			} catch (Exception e) {
				
			}
		}
	}
}
