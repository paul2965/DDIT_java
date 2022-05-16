package sec11.sec1;

public class SystemTimeExample {
	public static void main(String[] args) {
		//long time1 = System.currentTimeMillis();
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i = 1; i< 1000000000;i++) {
			sum += i;
		}
		
		//long time2 = System.currentTimeMillis();
		long time2 = System.nanoTime();
		
		System.out.printf("1 ~ 1000000까지의 합 : %d\n",sum);
		System.out.println((time2 - time1) + "나노초가 걸렸음");
	}
}
