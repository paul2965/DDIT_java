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
			System.out.println("�ζ� ���α׷�");
			System.out.println("--------------------------");
			System.out.println("1. Lotto ����\n2.���α׷� ����");
			System.out.println("==========================");
			System.out.print("�޴� ���� : ");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				//�ζ� ����
				buyLotto();
				//���α׷� �ݺ�
				runLotto();
				break;
			case 2:
				System.out.println("�����մϴ�.");
				//����
				System.exit(0);
			}
			
		}
	}
	
	public void buyLotto() {
		Random random = new Random();
		while(true) {
			System.out.print("������ �ݾ�(1�忡 1000��) : ");
			int money = scanner.nextInt();
			int lottoNum = money / 1000;
			int change = money % 1000;
			
			for(int i = 0; i < lottoNum; i++) {
				Set<Integer> lottoSet = new HashSet<>();
				while(lottoSet.size() < 6) {
					int lotto = random.nextInt(45) + 1;
					lottoSet.add(lotto);
				}
				System.out.println("�ζ� ��ȣ " + (i+1) + "��" + lottoSet);
			}
			
			System.out.println("���� �ݾ��� " + money + "���̰� �Ž������� " + change + "���Դϴ�.");
			return;
		}
	}
}