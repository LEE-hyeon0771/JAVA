package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();         //key값은 Interger로 value는 Member변수로 
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);    //HashMap은 put을 사용하여 key-value쌍 추가
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {           //HashMap에 매개변수로 받은 키 값인 회원 Id가 있는지 확인
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();   //Map은 순회가 안되어서 iterator 활용해서 전체 순회
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);  //key값을 하나씩 순회하면서 get() 메소드를 활용하여 해당 value값을 가져옴.
			System.out.println(member);
		}
		System.out.println();
	}
}
