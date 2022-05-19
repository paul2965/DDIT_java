package sec13_3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class T10PropertiesTest {
	/*
	 * Properties
	 *  - Map보다 축소된 기능의 객체라고 할 수 있다.
	 *  - Map은 모든 형태의 객체 데이터를 key와 value값으로 사용할 수 있지만,
	 *    Properties는 key와 value값으로 String만 사용가능
	 *  - Map은 put, get 메서드를 사용하지만, Properties는 setProperty, getProperty를
	 *    이용한다.
	 * */
	
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		Properties prop = new Properties();
		
		prop.setProperty("name", "홍길동");
		prop.setProperty("tel", "010-1245-4587");
		prop.setProperty("addr", "대전");
		
		String name = prop.getProperty("name");
		String tel = prop.getProperty("tel");
		
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + tel);
		System.out.println("주소 : " + prop.getProperty("addr"));
		
		//내용을 파일로 저장
		prop.store(new FileOutputStream("src/sec13_3/test.properties"), "코멘트입니다");
	}
}
