package sec13_3; 


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
문제) 이름, 주소, 전화번호 속성을 갖는 Phone클래스를 만들고, 이 Phone클래스를 이용하여 
	  전화번호 정보를 관리하는 프로그램을 완성하시오.
	  이 프로그램에는 전화번호를 등록, 수정, 삭제, 검색, 전체출력하는 기능이 있다.
	  
	  전체의 전화번호 정보는 Map을 이용하여 관리한다.
	  (key는 '이름'으로 하고 value는 'Phone클래스의 인스턴스'로 한다.)


실행예시)
===============================================
   전화번호 관리 프로그램(파일로 저장되지 않음)
===============================================

  메뉴를 선택하세요.
  1. 전화번호 등록
  2. 전화번호 수정
  3. 전화번호 삭제
  4. 전화번호 검색
  5. 전화번호 전체 출력
  0. 프로그램 종료
  번호입력 >> 1  <-- 직접 입력
  
  새롭게 등록할 전화번호 정보를 입력하세요.
  이름 >> 홍길동  <-- 직접 입력
  전화번호 >> 010-1234-5678  <-- 직접 입력
  주소 >> 대전시 중구 대흥동 111  <-- 직접 입력
  
  메뉴를 선택하세요.
  1. 전화번호 등록
  2. 전화번호 수정
  3. 전화번호 삭제
  4. 전화번호 검색
  5. 전화번호 전체 출력
  0. 프로그램 종료
  번호입력 >> 5  <-- 직접 입력
  
  =======================================
  번호   이름       전화번호         주소
  =======================================
   1    홍길동   010-1234-5678    대전시
   ~~~~~
   
  =======================================
  출력완료...
  
  메뉴를 선택하세요.
  1. 전화번호 등록
  2. 전화번호 수정
  3. 전화번호 삭제
  4. 전화번호 검색
  5. 전화번호 전체 출력
  0. 프로그램 종료
  번호입력 >> 0  <-- 직접 입력
  
  프로그램을 종료합니다...
  
*/
public class T09PhoneBookTest {
	private Scanner scan;
	private Map<String, Phone> phoneBookMap;
	
	public T09PhoneBookTest() {
		scan = new Scanner(System.in);
		phoneBookMap = new HashMap<String, Phone>();
	}
	
	// 메뉴를 출력하는 메서드
	public void displayMenu(){
		System.out.println();
		System.out.println("메뉴를 선택하세요.");
		System.out.println(" 1. 전화번호 등록");
		System.out.println(" 2. 전화번호 수정");
		System.out.println(" 3. 전화번호 삭제");
		System.out.println(" 4. 전화번호 검색");
		System.out.println(" 5. 전화번호 전체 출력");
		System.out.println(" 0. 프로그램 종료");
		System.out.print(" 번호입력 >> ");		
	}
	
	// 프로그램을 시작하는 메서드
	public void phoneBookMap(){
		System.out.println("===============================================");
		System.out.println("   전화번호 관리 프로그램(파일로 저장되지 않음)");
		System.out.println("===============================================");
		
		while(true){
			
			displayMenu();  // 메뉴 출력
			try {
				int menuNum = scan.nextInt();   // 메뉴 번호 입력
				
				if(menuNum > 6) {
					System.out.println("허용되는 패드는 0부터 5 사이입니다. 돌아가세요");
					new T09PhoneBookTest().phoneBookMap();
				}
				
				switch(menuNum){
				case 1 : insert();		// 등록
					break;
				case 2 : update();		// 수정
					break;
				case 3 : delete();		// 삭제
					break;
				case 4 : search();		// 검색
					break;
				case 5 : displayAll();	// 전체 출력
					break;
				case 0 :
					System.out.println("프로그램을 종료합니다...");
					return;
				default :
					System.out.println("잘못 입력했습니다. 다시입력하세요.");
				}
			} catch (Exception e) {
				System.out.println("잘못된 값 입력되었습니다.");
				new T09PhoneBookTest().phoneBookMap();
			}
			
		}
	}
	
	private void displayAll() {
		Set<String> keySet = phoneBookMap.keySet();
		
		System.out.println("번호\t이름\t전화번호\t\t주소");
		
		if(keySet.size() == 0 ) {
			System.out.println("등록된 번호 없음");
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
		System.out.println("찾을 정보");
		System.out.print("이름 >> ");
		String name = scan.next();
		
		Phone p = phoneBookMap.get(name);
		if(p == null) {
			System.out.println("해당하는 정보 없음");
		} else {
			System.out.println(p.getName() + "\t" + p.getTel() + "\t" + p.getAddr());
		}
	}

	private void delete() {
		System.out.println("삭제 할 전화번호 정보");
		System.out.print("이름 >>");
		String name = scan.next();
		
		if(phoneBookMap.remove(name) == null) {
			System.out.println("해당하는 이름이 없습니다.");	
		} else {
			System.out.println("삭제 완료");
		}
	}

	private void update() {
		System.out.println("업데이트 할 전화번호 정보");
		System.out.print("이름 >>");
		String name = scan.next();
		
		if(phoneBookMap.get(name) == null) {
			System.out.println("등록된 이름이 없습니다.");
			return;
		}
		
		System.out.print("전화번호 >> ");
		String tel = scan.next();
		
		System.out.print("주소 >> ");
		scan.nextLine();
		String addr = scan.nextLine();
		
		Phone p = new Phone(name, tel, addr);
		phoneBookMap.put(name, p);
		
		System.out.println("수정 완료");
	}

	//전화번호 입력
	private void insert() {
		System.out.println("정보 입력 : ");
		System.out.print("이름 >>  ");
		String name = scan.next();
		
		//이미 등록된 사람인지 검사(get)
		if(phoneBookMap.get(name) != null) {
			System.out.println("이미 등록된 사람입니다.");
			return;
		}
		
		System.out.print("전화번호 >> ");
		String tel = scan.next();
		
		System.out.print("주소 >> ");
		scan.nextLine();
		String addr = scan.nextLine();
		
		phoneBookMap.put(name, new Phone(name, tel, addr));
		System.out.println("등록 완료");
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

