package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);                        //arrayList�� member �߰�(add)
 	}
	
	public boolean removeMember(int memberId) {
		for(int i = 0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);            //arrayList�� �ε����� �ش��ϴ� �� ��� ����(get)
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);                         //arrayList�� �ε����� �ش��ϴ� �� �����(remove)
				return true;                     //memberId�� �ȹٷ� �������ٴ� ������ true ��ȯ
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");            //������ �ش� Id�� ��ã�� ��� �޼����� false��ȯ
		return false;
	}
	
	public void ShowAll() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
		//System.out.println(arrayList);
	}
	
	public void insertMember(Member member,int index) {
		arrayList.add(index, member);
		
	}
	
	
}
