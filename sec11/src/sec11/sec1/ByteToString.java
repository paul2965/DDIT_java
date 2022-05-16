package sec11.sec1;

public class ByteToString {
	public static void main(String[] args) {
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes,6,4); //6번째부터 연속된 4개를 String 객체 전달
		System.out.println(str2);
	}
}
