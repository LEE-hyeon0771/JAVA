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
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
	
	@Override
	public int hashCode() {                //Member class에서 hashCode와 equals를 구현해주어야 함. 
		return memberId;                    //String class는 set의 특성상 중복을 허용하지 않는 특성이 이미 equals를 String은 자바가 구현해 놓았기 때문에 가능하다.
	}                                       //내가 제네릭으로 만드는 변수는 set의 특성을 활용하려면 hashCode와 equals 구현이 필요하다.
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
	public int compareTo(Member member) {               //TreeSet에서는 comparable을 써서 compareTo를 구현
		return this.memberId - member.memberId;           //String에서는 알아서 중복 처리 되지만, Member에는 compare 메소드가 없으므로 직접구현
		//return (this.memberId - member.memberId) * (-1);  //내림차순은 음수로
	}                                                       //오름차순은 양수로
	                                           //Comparator 인터페이스를 implements 하게 되면 compare( , )를 구현해야함.
	
}
