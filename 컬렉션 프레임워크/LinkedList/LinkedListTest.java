package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(1,"D");  //첫번째 위치에 D를 추가
		System.out.println(myList);
		
		myList.addFirst("0");      //첫번째 위치에 0을 추가 addFist메서드
		System.out.println(myList);
		
		myList.addLast("5");       //마지막 위치에 5를 추가 addLast메서드
		System.out.println(myList);
		
		System.out.println(myList.removeLast());      //마지막에 있는 인덱스를 제거 removeLast메서드
		System.out.println(myList);
	}

}
