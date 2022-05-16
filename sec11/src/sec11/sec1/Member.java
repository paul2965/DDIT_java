package sec11.sec1;


// �ڹ��� ��� Ŭ������ Object Ŭ������ �ڽ� Ȥ�� �ڼ� Ŭ�����̴�.
// Object - �ڹ��� Ŭ������ object�� �״�� Ʋ�� �������� ������ �߿�
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
