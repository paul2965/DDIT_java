package Exercise;

import java.util.*;

public class HotelMap {
	private Scanner sc;
	private Map<String, HotelPerson> hotelMap;
	
	public HotelMap() {
		sc = new Scanner(System.in);
		hotelMap = new HashMap<>();
	}
	
	// 프로그램 시작
	public void hotelOpen() {
		System.out.println("====================================");
		System.out.println("\t호텔 문을 열었습니다.\t");
		System.out.println("====================================");
		while (true) {
			System.out.println("====================================");
			System.out.println("어떤 업무를 하시겠습니까?");
			System.out.println("1.체크인    2.체크아웃     3.객실상태     4.업무종료");
			System.out.println("====================================");
			System.out.print("메뉴 선택 => ");
			int choice = sc.nextInt(); // 메뉴 번호 입력
			sc.nextLine();
			switch (choice) {
			case 1:
				checkIn(); // 체크인
				break;
			case 2:
				checkOut(); // 체크아웃
				break;
			case 3:
				roomCondition(); // 객실상태
				break;
			case 4:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력했습니다. 다시입력하세요.");
			}
		}
	}

	private void checkOut() {
		System.out.println();
		System.out.println("어느 방을 체크아웃 하시겠습니까?");
		System.out.print("객실 번호 >> ");
		String rNum = sc.next();
		if(hotelMap.remove(rNum) == null) {
			System.out.println(rNum + "은 이미 빈방입니다.");
		} else {
			System.out.println("체크아웃하셨습니다.");
		}
	}
	
	private void roomCondition() {
		Set<String> keySet = hotelMap.keySet();
		System.out.println("=====================================");
		System.out.println(" 번호\t객실번호\t\t이름 ");
		System.out.println("=====================================");
		
		if(keySet.size() == 0) {
			System.out.println("없는 방입니다.");
		} else {
			Iterator<String> it = keySet.iterator();
			
			int count = 0;
			while(it.hasNext()) {
				count++;
				String rNum = it.next();
				HotelPerson h = hotelMap.get(rNum);
				System.out.println(" " + count + "번"+ "\t" +"방번호 : "+ h.getrNum() +"\t" + "투숙객 : "+ h.getName());

			}
		}
		System.out.println("====================================");
	}

	private void checkIn() {
		System.out.println();
		System.out.println("체크인 할 방을 고르십시오.");
		System.out.print("방 번호 입력 => ");
		String roomNum = sc.next();
		
		if(hotelMap.get(roomNum) != null) {
			System.out.println("이미 사용 중인 방입니다.");
			return;
		}
		
		sc.nextLine();
		System.out.println("성함이 어떻게 되십니까?");
		System.out.print("이름 입력 => ");
		String name = sc.next();
		
		hotelMap.put(roomNum, new HotelPerson(roomNum, name));
		System.out.println("체크인 되었습니다.");
		
	}
	
	
	public static void main(String[] args) {
		new HotelMap().hotelOpen();
	}
}

class HotelPerson{
	private String roomNum;
	private String name;
	
	public HotelPerson(String roomNum, String name) {
		super();
		this.name = name;
		this.roomNum = roomNum;
	}
	
	public String getrNum() {
		return roomNum;
	}

	public void setrNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
