package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(101, "�̼���");
		Member memberKim = new Member(102, "������");
		Member memberShin = new Member(103, "�Ż��Ӵ�");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberShin);             //arrayList�� ��� �ϳ��� �߰�
		
		memberArrayList.ShowAll();
		
		memberArrayList.removeMember(memberKim.getMemberId());        //��� ����
		
		memberArrayList.ShowAll();
		
		memberArrayList.insertMember(memberKim, 0);           //��� ���ϴ� �ε��� ��ġ�� ����
	    
		memberArrayList.ShowAll();
	}

}
