package arraylist;

import java.util.ArrayList;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList; //ArrayList 선언
	
	public MemberArrayList() { //Member형으로 선언한 arrayList 생성
		arrayList = new ArrayList<Member>();
	}
	public void addMember(Member member) {         //arrayList에 회원을 추가
		arrayList.add(member);
	}
	public boolean removeMember(int memberID) {
		for(int i = 0; i < arrayList.size(); i++) {       
			Member member = arrayList.get(i);        //get 메서드로 회원을 순차적으로 가져옴
			int tempId = member.getMemberID();         //getMemberID 메서드로 tempId에 회원을 넣어줌.
			if(tempId == memberID) {          
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}
	public void showAll() {
		
		for(Member member : arrayList) {        //arrayList에 들어가 있는 회원을 member에 하나씩 대입
			System.out.println(member);
		}
		System.out.println();
	}
}
