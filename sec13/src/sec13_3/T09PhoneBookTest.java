package sec13_3; 


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
����) �̸�, �ּ�, ��ȭ��ȣ �Ӽ��� ���� PhoneŬ������ �����, �� PhoneŬ������ �̿��Ͽ� 
	  ��ȭ��ȣ ������ �����ϴ� ���α׷��� �ϼ��Ͻÿ�.
	  �� ���α׷����� ��ȭ��ȣ�� ���, ����, ����, �˻�, ��ü����ϴ� ����� �ִ�.
	  
	  ��ü�� ��ȭ��ȣ ������ Map�� �̿��Ͽ� �����Ѵ�.
	  (key�� '�̸�'���� �ϰ� value�� 'PhoneŬ������ �ν��Ͻ�'�� �Ѵ�.)


���࿹��)
===============================================
   ��ȭ��ȣ ���� ���α׷�(���Ϸ� ������� ����)
===============================================

  �޴��� �����ϼ���.
  1. ��ȭ��ȣ ���
  2. ��ȭ��ȣ ����
  3. ��ȭ��ȣ ����
  4. ��ȭ��ȣ �˻�
  5. ��ȭ��ȣ ��ü ���
  0. ���α׷� ����
  ��ȣ�Է� >> 1  <-- ���� �Է�
  
  ���Ӱ� ����� ��ȭ��ȣ ������ �Է��ϼ���.
  �̸� >> ȫ�浿  <-- ���� �Է�
  ��ȭ��ȣ >> 010-1234-5678  <-- ���� �Է�
  �ּ� >> ������ �߱� ���ﵿ 111  <-- ���� �Է�
  
  �޴��� �����ϼ���.
  1. ��ȭ��ȣ ���
  2. ��ȭ��ȣ ����
  3. ��ȭ��ȣ ����
  4. ��ȭ��ȣ �˻�
  5. ��ȭ��ȣ ��ü ���
  0. ���α׷� ����
  ��ȣ�Է� >> 5  <-- ���� �Է�
  
  =======================================
  ��ȣ   �̸�       ��ȭ��ȣ         �ּ�
  =======================================
   1    ȫ�浿   010-1234-5678    ������
   ~~~~~
   
  =======================================
  ��¿Ϸ�...
  
  �޴��� �����ϼ���.
  1. ��ȭ��ȣ ���
  2. ��ȭ��ȣ ����
  3. ��ȭ��ȣ ����
  4. ��ȭ��ȣ �˻�
  5. ��ȭ��ȣ ��ü ���
  0. ���α׷� ����
  ��ȣ�Է� >> 0  <-- ���� �Է�
  
  ���α׷��� �����մϴ�...
  
*/
public class T09PhoneBookTest {
	private Scanner scan;
	private Map<String, Phone> phoneBookMap;
	
	public T09PhoneBookTest() {
		scan = new Scanner(System.in);
		phoneBookMap = new HashMap<String, Phone>();
	}
	
	// �޴��� ����ϴ� �޼���
	public void displayMenu(){
		System.out.println();
		System.out.println("�޴��� �����ϼ���.");
		System.out.println(" 1. ��ȭ��ȣ ���");
		System.out.println(" 2. ��ȭ��ȣ ����");
		System.out.println(" 3. ��ȭ��ȣ ����");
		System.out.println(" 4. ��ȭ��ȣ �˻�");
		System.out.println(" 5. ��ȭ��ȣ ��ü ���");
		System.out.println(" 0. ���α׷� ����");
		System.out.print(" ��ȣ�Է� >> ");		
	}
	
	// ���α׷��� �����ϴ� �޼���
	public void phoneBookMap(){
		System.out.println("===============================================");
		System.out.println("   ��ȭ��ȣ ���� ���α׷�(���Ϸ� ������� ����)");
		System.out.println("===============================================");
		
		while(true){
			
			displayMenu();  // �޴� ���
			try {
				int menuNum = scan.nextInt();   // �޴� ��ȣ �Է�
				
				if(menuNum > 6) {
					System.out.println("���Ǵ� �е�� 0���� 5 �����Դϴ�. ���ư�����");
					new T09PhoneBookTest().phoneBookMap();
				}
				
				switch(menuNum){
				case 1 : insert();		// ���
					break;
				case 2 : update();		// ����
					break;
				case 3 : delete();		// ����
					break;
				case 4 : search();		// �˻�
					break;
				case 5 : displayAll();	// ��ü ���
					break;
				case 0 :
					System.out.println("���α׷��� �����մϴ�...");
					return;
				default :
					System.out.println("�߸� �Է��߽��ϴ�. �ٽ��Է��ϼ���.");
				}
			} catch (Exception e) {
				System.out.println("�߸��� �� �ԷµǾ����ϴ�.");
				new T09PhoneBookTest().phoneBookMap();
			}
			
		}
	}
	
	private void displayAll() {
		Set<String> keySet = phoneBookMap.keySet();
		
		System.out.println("��ȣ\t�̸�\t��ȭ��ȣ\t\t�ּ�");
		
		if(keySet.size() == 0 ) {
			System.out.println("��ϵ� ��ȣ ����");
		} else {
			Iterator<String> it = keySet.iterator();
			int cnt = 0;
			while(it.hasNext()) {
				cnt++;
				String name = it.next();
				Phone p = phoneBookMap.get(name);
				System.out.println(cnt + "\t" + p.getName() + "\t" + p.getTel() + "\t" + p.getAddr());
			}
		}
	}

	private void search() {
		System.out.println("ã�� ����");
		System.out.print("�̸� >> ");
		String name = scan.next();
		
		Phone p = phoneBookMap.get(name);
		if(p == null) {
			System.out.println("�ش��ϴ� ���� ����");
		} else {
			System.out.println(p.getName() + "\t" + p.getTel() + "\t" + p.getAddr());
		}
	}

	private void delete() {
		System.out.println("���� �� ��ȭ��ȣ ����");
		System.out.print("�̸� >>");
		String name = scan.next();
		
		if(phoneBookMap.remove(name) == null) {
			System.out.println("�ش��ϴ� �̸��� �����ϴ�.");	
		} else {
			System.out.println("���� �Ϸ�");
		}
	}

	private void update() {
		System.out.println("������Ʈ �� ��ȭ��ȣ ����");
		System.out.print("�̸� >>");
		String name = scan.next();
		
		if(phoneBookMap.get(name) == null) {
			System.out.println("��ϵ� �̸��� �����ϴ�.");
			return;
		}
		
		System.out.print("��ȭ��ȣ >> ");
		String tel = scan.next();
		
		System.out.print("�ּ� >> ");
		scan.nextLine();
		String addr = scan.nextLine();
		
		Phone p = new Phone(name, tel, addr);
		phoneBookMap.put(name, p);
		
		System.out.println("���� �Ϸ�");
	}

	//��ȭ��ȣ �Է�
	private void insert() {
		System.out.println("���� �Է� : ");
		System.out.print("�̸� >>  ");
		String name = scan.next();
		
		//�̹� ��ϵ� ������� �˻�(get)
		if(phoneBookMap.get(name) != null) {
			System.out.println("�̹� ��ϵ� ����Դϴ�.");
			return;
		}
		
		System.out.print("��ȭ��ȣ >> ");
		String tel = scan.next();
		
		System.out.print("�ּ� >> ");
		scan.nextLine();
		String addr = scan.nextLine();
		
		phoneBookMap.put(name, new Phone(name, tel, addr));
		System.out.println("��� �Ϸ�");
	}
	
	public static void main(String[] args) {
		new T09PhoneBookTest().phoneBookMap();
	}
}

// Phone VO
class Phone{
	private String name;
	private String tel;
	private String addr;

	public Phone(String name, String tel, String addr) {
		super();
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "name : " + name + ", tel :" + tel + ", addr : " + addr;
	}
}

