package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(101, "이순신");
		Member memberKim = new Member(102, "김유신");
		Member memberShin = new Member(103, "신사임당");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberShin);
		
		memberHashSet.ShowAllMember();
		
		Member memberLee2 = new Member(101, "이몽룡");      //같은 Id를 가진 객체를 일부러 넣어보았음.set의 특징 점검.
		memberHashSet.addMember(memberLee2);
		memberHashSet.ShowAllMember();
	}

}
