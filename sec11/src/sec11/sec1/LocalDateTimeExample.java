package sec11.sec1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
	public static void main(String[] args) {
		// jdk 1.8 이전
		//Date date = new Date();
		//SimpleDateFormat format = new SimpleDateFormat();
		
		// jdk 1.8 이후
		String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분 "));
		System.out.println(now);
	}
}
