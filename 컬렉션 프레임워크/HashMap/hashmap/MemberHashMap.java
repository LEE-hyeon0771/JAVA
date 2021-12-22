package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();         //key���� Interger�� value�� Member������ 
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);    //HashMap�� put�� ����Ͽ� key-value�� �߰�
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {           //HashMap�� �Ű������� ���� Ű ���� ȸ�� Id�� �ִ��� Ȯ��
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();   //Map�� ��ȸ�� �ȵǾ iterator Ȱ���ؼ� ��ü ��ȸ
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);  //key���� �ϳ��� ��ȸ�ϸ鼭 get() �޼ҵ带 Ȱ���Ͽ� �ش� value���� ������.
			System.out.println(member);
		}
		System.out.println();
	}
}
