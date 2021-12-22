package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(1001, "����");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		memberTreeSet.showAllMember();
		
	    Member memberHong = new Member(1001, "ȫ�浿");
	    memberTreeSet.addMember(memberHong);
	    memberTreeSet.showAllMember();
	}

}
