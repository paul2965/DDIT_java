package sec11.sec1;


// 자바의 모든 클래스는 Object 클래스의 자식 혹은 자손 클래스이다.
// Object - 자바의 클래스는 object를 그대로 틀을 가져오기 떄문에 중요
public class Member {
	private String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
