package sec13_2;

import java.util.*;

public class SetBaseBollGame {
	int[] num = new int[3]; // 난수가 저장되 배열
	int[] user;				// 사용자가 입력한 값을 저장할 배열
	
	int strike;	// 스트라이크 개수
	int ball;	// 볼 개수
	
	Scanner scan = new Scanner(System.in);
	
	
	public void getRndNum(){
		
		Set<Integer> NumSet = new HashSet<Integer>();
		
		// Set을 이용한 3개의 난수 만들기
		while(NumSet.size()<3){
			NumSet.add( (int)(Math.random() * 9 + 1) );
		}
		
		// Set의 자료를 배열에 저장하기
		Iterator<Integer> it = NumSet.iterator();
		
		int i = 0; // 배열의 첨자 역할
		while(it.hasNext()){
			num[i++] = it.next().intValue();
		}
		
		// shuffle을 이용한 데이터 섞기
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
			System.out.print("숫자 입력 => ");
			n1 = scan.nextInt();
			n2 = scan.nextInt();
			n3 = scan.nextInt();
			if(n1==n2 || n1==n3 || n2==n3){
				System.out.println("숫자 중복 불가능합니다. 다시 입력하세요");
			}
		}while(n1==n2 || n1==n3 || n2==n3);
		
		user = new int[]{n1, n2, n3}; // 저장
	}
	
	// 판정하는 영역
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
		
		System.out.println("컴퓨터 난수값 => " + num[0] + " " + num[1] + " " + num[2]);
		
		int cnt = 0; 
		
		do{
			cnt++; 
			inputNum(); 
			ballCount();  
		}while(strike!=3);  
		
		System.out.println(cnt + "번째만에 맞춤");
	}
	
	public static void main(String[] args) {
		SetBaseBollGame baseBall = new SetBaseBollGame();
		baseBall.gameStart();
	}
}
