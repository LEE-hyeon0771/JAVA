package arraylist;

import java.util.ArrayList;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList; //ArrayList ����
	
	public MemberArrayList() { //Member������ ������ arrayList ����
		arrayList = new ArrayList<Member>();
	}
	public void addMember(Member member) {         //arrayList�� ȸ���� �߰�
		arrayList.add(member);
	}
	public boolean removeMember(int memberID) {
		for(int i = 0; i < arrayList.size(); i++) {       
			Member member = arrayList.get(i);        //get �޼���� ȸ���� ���������� ������
			int tempId = member.getMemberID();         //getMemberID �޼���� tempId�� ȸ���� �־���.
			if(tempId == memberID) {          
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAll() {
		
		for(Member member : arrayList) {        //arrayList�� �� �ִ� ȸ���� member�� �ϳ��� ����
			System.out.println(member);
		}
		System.out.println();
	}
}
