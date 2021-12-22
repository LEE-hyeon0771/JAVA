package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
	MemberTreeMap membertreemap = new MemberTreeMap();
			
			Member memberLee = new Member(1002, "����");
			Member memberKim = new Member(1001, "������");
			Member memberSon = new Member(1004, "�����");
			Member memberKang = new Member(1003, "������");
			
			membertreemap.addMember(memberLee);
			membertreemap.addMember(memberKim);
			membertreemap.addMember(memberSon);
			membertreemap.addMember(memberKang);
			
			membertreemap.showAllMember();
			
			membertreemap.removeMember(1002);
			membertreemap.showAllMember();
	}

}
