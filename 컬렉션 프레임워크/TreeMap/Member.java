package collection;

public class Member implements Comparable<Member> {
	
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}
	
	@Override
	public int hashCode() {                //Member class���� hashCode�� equals�� �������־�� ��. 
		return memberId;                    //String class�� set�� Ư���� �ߺ��� ������� �ʴ� Ư���� �̹� equals�� String�� �ڹٰ� ������ ���ұ� ������ �����ϴ�.
	}                                       //���� ���׸����� ����� ������ set�� Ư���� Ȱ���Ϸ��� hashCode�� equals ������ �ʿ��ϴ�.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			
			if(this.memberId == member.memberId) {
				return true;
				}
			else return false;
		}
		
		return false;
	}
	@Override
	public int compareTo(Member member) {               //TreeSet������ comparable�� �Ἥ compareTo�� ����
		return this.memberId - member.memberId;           //String������ �˾Ƽ� �ߺ� ó�� ������, Member���� compare �޼ҵ尡 �����Ƿ� ��������
		//return (this.memberId - member.memberId) * (-1);  //���������� ������
	}                                                       //���������� �����
	                                           //Comparator �������̽��� implements �ϰ� �Ǹ� compare( , )�� �����ؾ���.
	
}
