package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("�¹���1");
		shelfQueue.enQueue("�¹���2");
		shelfQueue.enQueue("�¹���3");
		
		System.out.println("���� Array�� ���� : " + shelfQueue.getSize());
		
		System.out.println(shelfQueue.deQueue());
		System.out.println("���� Array�� ���� : " + shelfQueue.getSize());
		System.out.println(shelfQueue.deQueue());
		System.out.println("���� Array�� ���� : " + shelfQueue.getSize());
		System.out.println(shelfQueue.deQueue());
		System.out.println("���� Array�� ���� : " + shelfQueue.getSize());
		
	}

}
