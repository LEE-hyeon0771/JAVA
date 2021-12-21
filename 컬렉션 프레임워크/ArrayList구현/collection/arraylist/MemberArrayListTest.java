package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(101, "이순신");
		Member memberKim = new Member(102, "김유신");
		Member memberShin = new Member(103, "신사임당");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberShin);             //arrayList에 멤버 하나씩 추가
		
		memberArrayList.ShowAll();
		
		memberArrayList.removeMember(memberKim.getMemberId());        //멤버 삭제
		
		memberArrayList.ShowAll();
		
		memberArrayList.insertMember(memberKim, 0);           //멤버 원하는 인덱스 위치에 삽입
	    
		memberArrayList.ShowAll();
	}

}
