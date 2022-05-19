package sec13_3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class T10PropertiesTest {
	/*
	 * Properties
	 *  - Map���� ��ҵ� ����� ��ü��� �� �� �ִ�.
	 *  - Map�� ��� ������ ��ü �����͸� key�� value������ ����� �� ������,
	 *    Properties�� key�� value������ String�� ��밡��
	 *  - Map�� put, get �޼��带 ���������, Properties�� setProperty, getProperty��
	 *    �̿��Ѵ�.
	 * */
	
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		Properties prop = new Properties();
		
		prop.setProperty("name", "ȫ�浿");
		prop.setProperty("tel", "010-1245-4587");
		prop.setProperty("addr", "����");
		
		String name = prop.getProperty("name");
		String tel = prop.getProperty("tel");
		
		System.out.println("�̸� : " + name);
		System.out.println("��ȣ : " + tel);
		System.out.println("�ּ� : " + prop.getProperty("addr"));
		
		//������ ���Ϸ� ����
		prop.store(new FileOutputStream("src/sec13_3/test.properties"), "�ڸ�Ʈ�Դϴ�");
	}
}
