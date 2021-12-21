package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);                        //arrayList에 member 추가(add)
 	}
	
	public boolean removeMember(int memberId) {
		for(int i = 0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);            //arrayList의 인덱스에 해당하는 값 들고 오기(get)
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);                         //arrayList의 인덱스에 해당하는 값 지우기(remove)
				return true;                     //memberId가 똑바로 지워졌다는 것으로 true 반환
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");            //끝까지 해당 Id를 못찾은 경우 메세지와 false반환
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
