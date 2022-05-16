package sec11.sec1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
	public static void main(String[] args) {
		// jdk 1.8 ����
		//Date date = new Date();
		//SimpleDateFormat format = new SimpleDateFormat();
		
		// jdk 1.8 ����
		String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy�� M�� d�� a h�� m�� "));
		System.out.println(now);
	}
}
