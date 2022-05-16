package sec11.sec1;

public class WrapperExample {
	public static void main(String[] args) {
//		//¹Ú½Ì
//		Integer integer = new Integer(100);
//		
//		//¾ð¹Ú½Ì
//		int value1 = integer.intValue();
//		String value2 = integer.toString();
//		
//		System.out.println(value1);
//		System.out.println(value2);
		
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
		int value = obj;
		System.out.println("value : " + value);
		
		int result = obj + 100;
		System.out.println("result : " + result);
	}
}
