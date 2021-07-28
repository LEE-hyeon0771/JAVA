package Interfaceex;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("고구려1");
		shelfQueue.enQueue("고구려2");
		shelfQueue.enQueue("고구려3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
