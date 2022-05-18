package sec13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExercise1 {
	public static void main(String[] args) {	
		
		// ���� 1��
		try {
			List<String> name = new ArrayList<String>();
			Scanner scanner = new Scanner(System.in);

			for(int i = 0 ; i < 5 ; i++	) {
				System.out.print("�̸��� �Է��Ͻÿ� : ");
				name.add(scanner.nextLine());
			}
			System.out.println();
			
			for(String names : name) {
				if(names.contains("��")) {
					System.out.println(names);
				}
			}
			
			scanner.close();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		} 
	}
}

