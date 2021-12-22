package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {

private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();         //key���� Interger�� value�� Member������ 
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);    //TreeMap�� put�� ����Ͽ� key-value�� �߰�
	}
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {           //TreeMap�� �Ű������� ���� Ű ���� ȸ�� Id�� �ִ��� Ȯ��
			treeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();   //Map�� ��ȸ�� �ȵǾ iterator Ȱ���ؼ� ��ü ��ȸ
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = treeMap.get(key);  //key���� �ϳ��� ��ȸ�ϸ鼭 get() �޼ҵ带 Ȱ���Ͽ� �ش� value���� ������.
			System.out.println(member);
		}
		System.out.println();
	}
}
