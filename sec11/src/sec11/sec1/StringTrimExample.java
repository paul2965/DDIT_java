package sec11.sec1;

public class StringTrimExample {
	public static void main(String[] args) {
		String trim1 = "   01   ";
		String trim2 = "01      ";
		String trim3 = "      01";
		
		String tel = trim1.trim() + trim2.trim() + trim3.trim();
		
		System.out.println(tel);
	}
}
