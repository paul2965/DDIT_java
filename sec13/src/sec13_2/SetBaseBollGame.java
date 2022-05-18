package sec13_2;

import java.util.*;

public class SetBaseBollGame {
	int[] num = new int[3]; // ������ ����� �迭
	int[] user;				// ����ڰ� �Է��� ���� ������ �迭
	
	int strike;	// ��Ʈ����ũ ����
	int ball;	// �� ����
	
	Scanner scan = new Scanner(System.in);
	
	
	public void getRndNum(){
		
		Set<Integer> NumSet = new HashSet<Integer>();
		
		// Set�� �̿��� 3���� ���� �����
		while(NumSet.size()<3){
			NumSet.add( (int)(Math.random() * 9 + 1) );
		}
		
		// Set�� �ڷḦ �迭�� �����ϱ�
		Iterator<Integer> it = NumSet.iterator();
		
		int i = 0; // �迭�� ÷�� ����
		while(it.hasNext()){
			num[i++] = it.next().intValue();
		}
		
		// shuffle�� �̿��� ������ ����
		List<Integer> NumList = new ArrayList<>(NumSet);
		Collections.shuffle(NumList); 
		int i1 = 0; 
		for(int bbNum : NumList) {
			num[i1++] = bbNum;
		}

	}

	public void inputNum(){
		int n1, n2, n3;  
		
		do{
			System.out.print("���� �Է� => ");
			n1 = scan.nextInt();
			n2 = scan.nextInt();
			n3 = scan.nextInt();
			if(n1==n2 || n1==n3 || n2==n3){
				System.out.println("���� �ߺ� �Ұ����մϴ�. �ٽ� �Է��ϼ���");
			}
		}while(n1==n2 || n1==n3 || n2==n3);
		
		user = new int[]{n1, n2, n3}; // ����
	}
	
	// �����ϴ� ����
	public void ballCount(){
		strike = 0;
		ball = 0;   
		
		for(int i=0; i<num.length; i++){
			for(int j=0; j<user.length; j++){
				if(num[i] == user[j]){  
					if(i==j){   
						strike++;
					}else{		
						ball++;
					}
				}
			}
		}
		
		System.out.println(user[0] + " " + user[1] + " " + user[2] + " ==> " + strike + "S " + ball + "B");
		
	}
	
	public void gameStart(){
		getRndNum();
		
		System.out.println("��ǻ�� ������ => " + num[0] + " " + num[1] + " " + num[2]);
		
		int cnt = 0; 
		
		do{
			cnt++; 
			inputNum(); 
			ballCount();  
		}while(strike!=3);  
		
		System.out.println(cnt + "��°���� ����");
	}
	
	public static void main(String[] args) {
		SetBaseBollGame baseBall = new SetBaseBollGame();
		baseBall.gameStart();
	}
}
