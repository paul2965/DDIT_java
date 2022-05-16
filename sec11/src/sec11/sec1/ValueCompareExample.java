package sec11.sec1;

public class ValueCompareExample {
	public static void main(String[] args) {
		System.out.println("[-127 ~ 128 초과값인 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		System.out.printf("== 결과 : %s\n",(obj1 == obj2));
		System.out.printf("언박싱 후 == 결과 : %s\n",(obj1.intValue() == obj2.intValue()));
		System.out.printf("equals() 결과 : %s\n",obj1.equals(obj2));
		
		System.out.println("\n[-127 ~ 128 범위값인 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		
		System.out.printf("== 결과 : %s\n",(obj3 == obj4));
		System.out.printf("언박싱 후 == 결과 : %s\n",(obj3.intValue() == obj4.intValue()));
		System.out.printf("equals() 결과 : %s\n",obj3.equals(obj4));
		
	}
}
