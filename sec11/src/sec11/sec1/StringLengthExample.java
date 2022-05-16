package sec11.sec1;

public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "7306241230123";
		int length = ssn.length();
		
		if(length == 13) {
			System.out.println("올바른 주민등록번호 자리");
		} else {
			System.out.println("올바르지 않는 주민등록번호 자리");
		}
	}
}
