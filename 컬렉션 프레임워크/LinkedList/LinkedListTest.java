package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(1,"D");  //ù��° ��ġ�� D�� �߰�
		System.out.println(myList);
		
		myList.addFirst("0");      //ù��° ��ġ�� 0�� �߰� addFist�޼���
		System.out.println(myList);
		
		myList.addLast("5");       //������ ��ġ�� 5�� �߰� addLast�޼���
		System.out.println(myList);
		
		System.out.println(myList.removeLast());      //�������� �ִ� �ε����� ���� removeLast�޼���
		System.out.println(myList);
	}

}
