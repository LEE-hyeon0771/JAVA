package collection.arraylist;

import java.util.ArrayList;

class MyQueue{
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {             //enQueue는 추가 add
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		
		return arrayQueue.remove(0);       //Queue의 개념이 선입선출이므로 remove(0)해줘서 맨 앞에꺼가 나가게 됨
	}
}
	
	
public class QueueTest {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		queue.enQueue("a");
		queue.enQueue("b");
		queue.enQueue("c");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}

}
