package Exercise;

public class Exercise2 {
	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		
		int index = str.indexOf("자바");
		if(index == -1) {
			System.out.println("str 문자열에는 \"자바\"가 포함되어 있지 않다.");
		} else {
			System.out.println("str 문자열에는 \"자바\"가 포함되어 있다.");
			str = str.replace("자바", "Java");
		}
		
		System.out.println("-->"+str);
	}
}
