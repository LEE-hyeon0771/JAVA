package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
	MemberTreeMap membertreemap = new MemberTreeMap();
			
			Member memberLee = new Member(1002, "ÀÌÇö");
			Member memberKim = new Member(1001, "±èÀ¯½Å");
			Member memberSon = new Member(1004, "¼ÕÈï¹Î");
			Member memberKang = new Member(1003, "°­°¨Âù");
			
			membertreemap.addMember(memberLee);
			membertreemap.addMember(memberKim);
			membertreemap.addMember(memberSon);
			membertreemap.addMember(memberKang);
			
			membertreemap.showAllMember();
			
			membertreemap.removeMember(1002);
			membertreemap.showAllMember();
	}

}
