package collection.hashmap;

import collection.Member;

public class HashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberhashmap = new MemberHashMap();
		
		Member memberLee = new Member(1001, "����");
		Member memberKim = new Member(1002, "������");
		Member memberSon = new Member(1003, "�����");
		Member memberKang = new Member(1004, "������");
		
		memberhashmap.addMember(memberLee);
		memberhashmap.addMember(memberKim);
		memberhashmap.addMember(memberSon);
		memberhashmap.addMember(memberKang);
		
		memberhashmap.showAllMember();
		
		memberhashmap.removeMember(1002);
		memberhashmap.showAllMember();
	}

}
