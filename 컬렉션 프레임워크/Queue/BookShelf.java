package bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);            //�迭�� �ǵڷ� ��
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);        //�� �� 0 �ε����� ���� �� ��ȯ - �� �� ���� ��µ�
	}

	@Override
	public int getSize() {
		
		return getCount();
	}

}
