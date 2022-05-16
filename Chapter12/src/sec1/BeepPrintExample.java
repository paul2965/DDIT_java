package sec1;

public class BeepPrintExample {
	public static void main(String[] args) {
		BeepTask beepTask = new BeepTask();
		Thread thread = new Thread(beepTask); //익명 객체로 선언가능
		thread.start();
		
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 1000 = 1초 , 500 = 0.5초
			} catch (Exception e) {
				
			}
		}
	}
}
