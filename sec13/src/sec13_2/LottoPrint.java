package sec13_2;

import java.util.*;

public class LottoPrint {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.runLotto();
	}
}

class Lotto {
	Scanner scanner = new Scanner(System.in);
	
	public void runLotto() {
		while(true) {
			System.out.println("==========================");
			System.out.println("로또 프로그램");
			System.out.println("--------------------------");
			System.out.println("1. Lotto 구입\n2.프로그램 종료");
			System.out.println("==========================");
			System.out.print("메뉴 선택 : ");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				//로또 구매
				buyLotto();
				//프로그램 반복
				runLotto();
				break;
			case 2:
				System.out.println("감사합니다.");
				//종료
				System.exit(0);
			}
			
		}
	}
	
	public void buyLotto() {
		Random random = new Random();
		while(true) {
			System.out.print("구매할 금액(1장에 1000원) : ");
			int money = scanner.nextInt();
			int lottoNum = money / 1000;
			int change = money % 1000;
			
			for(int i = 0; i < lottoNum; i++) {
				Set<Integer> lottoSet = new HashSet<>();
				while(lottoSet.size() < 6) {
					int lotto = random.nextInt(45) + 1;
					lottoSet.add(lotto);
				}
				System.out.println("로또 번호 " + (i+1) + "번" + lottoSet);
			}
			
			System.out.println("받은 금액은 " + money + "원이고 거스름돈은 " + change + "원입니다.");
			return;
		}
	}
}