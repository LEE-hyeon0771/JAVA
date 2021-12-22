package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {

private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();         //key값은 Interger로 value는 Member변수로 
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);    //TreeMap은 put을 사용하여 key-value쌍 추가
	}
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {           //TreeMap에 매개변수로 받은 키 값인 회원 Id가 있는지 확인
			treeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();   //Map은 순회가 안되어서 iterator 활용해서 전체 순회
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);  //key값을 하나씩 순회하면서 get() 메소드를 활용하여 해당 value값을 가져옴.
			System.out.println(member);
		}
		System.out.println();
	}
}
